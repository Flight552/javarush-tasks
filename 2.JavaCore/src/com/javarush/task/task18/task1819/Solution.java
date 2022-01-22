package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> dataList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = null;
        FileInputStream file2 = null;
        String dataFile = null;
        int i = 0;

        try {
            dataFile = reader.readLine();
            file1 = new FileInputStream(dataFile);
            file2 = new FileInputStream(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            while (file1.available() > 0) {
                int data = file1.read();
                dataList.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileOutputStream file1ToWrite = new FileOutputStream(dataFile);
        while(file2.available() > 0) {
            int data = file2.read();
            dataList.add(i, data);
            i++;
        }
        for(Integer s : dataList) {
            file1ToWrite.write(s);
        }

        file1ToWrite.flush();
        file1ToWrite.close();
        file1.close();
        file2.close();
    }
}
