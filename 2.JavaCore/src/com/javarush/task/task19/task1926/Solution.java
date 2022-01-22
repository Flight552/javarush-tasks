package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<StringBuilder> dataFile = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader file = null;
        try {
            file = new BufferedReader(new FileReader(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            while (file.ready()) {
                String dataS = file.readLine();
                StringBuilder data = new StringBuilder();
                data.append(dataS);
                dataFile.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            file.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(StringBuilder s : dataFile) {
            System.out.println(s.reverse());
        }

    }
}
