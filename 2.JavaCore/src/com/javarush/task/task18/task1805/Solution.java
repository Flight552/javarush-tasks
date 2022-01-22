package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(new File(reader.readLine()));
        HashMap<Integer, Integer> values = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();


        while (input.available() > 0) {
            int data = input.read();
            list.add(data);
        }
        Collections.sort(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            values.put(list.get(i), 0);
        }
        list.clear();

        for (Map.Entry<Integer, Integer> m : values.entrySet()) {
            list.add(m.getKey());
        }
        Collections.sort(list);
        for (Integer k : list) {
            System.out.print(k + " ");
        }
        input.close();
        reader.close();
    }
}
