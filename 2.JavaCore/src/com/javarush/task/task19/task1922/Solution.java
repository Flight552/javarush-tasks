package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        String line = fileReader.readLine();
        while (line != null) {
            int counter = 0;
            String[] getLines = line.split(" ");
            for(int i = 0; i < getLines.length; i++) {
                for(String s : words) {
                    if(getLines[i].equals(s)){
                        counter++;
                    }
                }
            }
            if(counter == 2) {
                System.out.println(line);
            }
            line = fileReader.readLine();
        }
        fileReader.close();
        reader.close();
    }
}
