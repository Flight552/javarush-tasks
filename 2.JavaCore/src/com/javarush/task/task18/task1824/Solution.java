package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        String fileName = null;
        boolean isRead = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = null;
        while(!isRead) {
            try {
                fileName = reader.readLine();
                file = new FileInputStream(fileName);
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                isRead = true;
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
