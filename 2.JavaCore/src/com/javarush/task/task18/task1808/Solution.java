package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(new File(reader.readLine()));
        FileOutputStream file2 = new FileOutputStream(new File(reader.readLine()));
        FileOutputStream file3 = new FileOutputStream(new File(reader.readLine()));

        int counter = file1.available();
        int size = counter % 2 == 0 ? counter / 2 : counter / 2 + 1;

        while (file1.available() > 0) {
           byte[] buffer1 = new byte[size];
           byte[] buffer2 = new byte[counter - size];
           file2.write(buffer1);
           file3.write(buffer2);
        }
        file3.close();
        file2.close();
        file1.close();
        reader.close();
    }
}
