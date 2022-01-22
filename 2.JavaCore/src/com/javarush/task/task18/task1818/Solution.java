package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream file1 = null;
        FileInputStream file2 = null;
        FileInputStream file3 = null;
        try {
             file1 = new FileOutputStream(reader.readLine());
             file2 = new FileInputStream(reader.readLine());
             file3 = new FileInputStream(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            while (file2.available() > 0) {
                int data = file2.read();
                file1.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            while (file3.available() > 0) {
                int data = file3.read();
                file1.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            file1.flush();
            file1.close();
            file2.close();
            file3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
