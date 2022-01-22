package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = args[0];
        TreeMap<String, Double> getLine = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        try {
            String line = reader.readLine();
            while (line!=null) {
                 String[] getInfo = line.split(" ");
                 Double num = Double.parseDouble(getInfo[1].trim());
                 Double sum = 0.0;
                 if(getLine.containsKey(getInfo[0])) {
                     sum = getLine.get(getInfo[0]);
                     sum += num;
                     getLine.put(getInfo[0], sum);
                 } else {
                     getLine.put(getInfo[0], num);
                 }

                 line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Map.Entry<String, Double> m : getLine.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
