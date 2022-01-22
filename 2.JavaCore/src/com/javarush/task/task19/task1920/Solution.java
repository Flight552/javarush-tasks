package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        String getFile = args[0];
        TreeMap<String, Double> listItems = new TreeMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(getFile));
            String line = reader.readLine();
            while (line != null) {
                String[] getItems = line.split(" ");
                Double num = Double.parseDouble(getItems[1].trim());
                if(listItems.containsKey(getItems[0])) {
                     Double value = listItems.get(getItems[0]);
                     listItems.put(getItems[0], value+num);
                } else {
                    listItems.put(getItems[0], num);
                }
                line = reader.readLine();
            }
            reader.close();
            Double maxValue = 0.0;

            for(Map.Entry<String, Double> m : listItems.entrySet()){
                if(m.getValue() > maxValue){
                    maxValue = m.getValue();
                }
            }
            for(Map.Entry<String, Double> p : listItems.entrySet()){
                if(p.getValue().equals(maxValue)) {
                    System.out.println(p.getKey());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
