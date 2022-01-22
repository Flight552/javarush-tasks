package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileToRead = args[0];
        String fileToWrite = args[1];

        BufferedReader reader = new BufferedReader(new FileReader(fileToRead));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileToWrite));

        String numbersInFile = reader.readLine();
        while(numbersInFile != null) {
            String[] words = numbersInFile.split(" ");
            for(String w : words) {
                char[] nums = w.toCharArray();
                for(int i = 0; i < nums.length; i++) {
                    if(nums[i] > 47 && nums[i] < 58) {
                        writer.write(" " + w.trim());
                        writer.flush();
                        break;
                    }
                }
            }
            numbersInFile = reader.readLine();
        }
        reader.close();
        writer.close();
    }
}
