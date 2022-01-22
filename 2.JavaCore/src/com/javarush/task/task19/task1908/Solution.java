package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String getFile1 = reader.readLine();
        String getFile2 = reader.readLine();
        reader.close();

        BufferedReader file1 = new BufferedReader(new FileReader(getFile1));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(new File(getFile2)));

        while (file1.ready()) {
            String s = file1.readLine();
            String[] numbers = s.split("\\s");
            for(int i = 0; i < numbers.length; i++) {

            }
                for (String n : numbers) {
                    try {
                        System.out.print(Integer.parseInt(n));
                        file2.write(n + " ");
                    } catch (NumberFormatException e) {
                        continue;
                    }
                }
        }
        file2.close();
        file1.close();


    }
}
