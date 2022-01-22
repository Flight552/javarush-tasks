package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String fileName = args[0];
        TreeMap<Character, Integer> alphabet = new TreeMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            int line;

            while ((line = reader.read()) != -1) {
                if(alphabet.containsKey((char) line)) {
                    alphabet.put((char) line, alphabet.get((char) line) + 1);
                } else
                    alphabet.put((char) line, 1);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Integer> mapValues = new ArrayList<Integer>(alphabet.values());
        Collections.sort(mapValues);

        for(Map.Entry entry : alphabet.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
