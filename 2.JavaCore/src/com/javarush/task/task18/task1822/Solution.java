package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        int id = Integer.parseInt(args[0]);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
           String file = reader.readLine();
           BufferedReader getFile = new BufferedReader(new FileReader(file));
           String line = getFile.readLine();
           while (line != null) {
               String[] items = line.split(" ");
               if( Integer.parseInt(items[0].trim()) == id) {
                   for(int i = 0; i < items.length; i++) {
                       System.out.print(items[i].trim() + " ");
                       System.out.println();
                   }
               }
               line = getFile.readLine();
           }
           getFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
