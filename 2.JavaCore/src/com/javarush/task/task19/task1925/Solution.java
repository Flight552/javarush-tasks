package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileToRead = args[0];
        String fileToWrite = args[1];
        BufferedReader reader = new BufferedReader(new FileReader(fileToRead));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileToWrite));
        ArrayList<String> getWords = new ArrayList<>();
        String line;
        int counter = 0;
        while ((line = reader.readLine()) != null){
            String[] words = line.split(" ");
            for(String c : words){
                if(c.length() > 6) {
                    getWords.add(c.trim());
                    counter++;
                }
            }
        }
        for(String s : getWords) {
            if(counter > 1) {
                writer.write(s + ",");
                counter--;
            } else {
                writer.write(s);
            }
            writer.flush();
        }
        reader.close();
        writer.close();
    }
}
