package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream file = new FileInputStream(fileName);
        Reader rd = new InputStreamReader(file);
        reader = new BufferedReader(rd);

        ArrayList<Integer> list = new ArrayList<>();

        String num = reader.readLine();
        while (num != null) {
            list.add(Integer.parseInt(num));
            num = reader.readLine();
        }
        Collections.sort(list);
        for (Integer i : list) {
            if (i % 2 == 0)
                System.out.println(i);
        }
        file.close();
    }
}
