package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String getFile1 = reader.readLine();
        String getFile2 = reader.readLine();

        reader.close();

        BufferedReader file1 = new BufferedReader(new FileReader(getFile1));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(getFile2));

        while(file1.ready()) {
            String noSigns = file1.readLine();
            noSigns = noSigns.replaceAll("[\\p{Punct}\\n]","");
            file2.write(noSigns);
        }
        file2.close();
        file1.close();
    }
}
