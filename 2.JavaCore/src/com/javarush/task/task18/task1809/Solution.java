package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(new File(reader.readLine()));
        FileOutputStream file2 = new FileOutputStream(new File(reader.readLine()));

        ArrayList<Integer> list = new ArrayList<>();

        while(file1.available() > 0) {
            list.add(file1.read());
        }
        for(int i = list.size() -1; i>=0; i--) {
            file2.write(list.get(i));
        }
        file2.close();
        file1.close();
    }
}
