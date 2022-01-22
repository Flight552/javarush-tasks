package com.javarush.task.task19.task1909;

/* 
Замена знаков
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
            String dots = file1.readLine();
            dots = dots.replace(".", "!");
            file2.write(dots);
        }
        file2.close();
        file1.close();
    }
}
