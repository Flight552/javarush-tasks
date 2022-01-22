package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
        while (true) {
            String words = reader.readLine();
            writer.write(words);
            writer.newLine();
            if (words.equals("exit")) {
                break;
            }
        }
        writer.close();
        reader.close();
    }
}
