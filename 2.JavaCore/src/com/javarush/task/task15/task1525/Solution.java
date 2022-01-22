package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {

        try {
            File file = new File(Statics.FILE_NAME);
            FileReader reader = new FileReader(file);

            BufferedReader readLine = new BufferedReader(reader);
            String line = readLine.readLine();
            while (line != null) {
                lines.add(line);
                line = readLine.readLine();
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
