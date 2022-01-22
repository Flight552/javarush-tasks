package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> newMap = new HashMap<>();
        boolean isTrue = false;

        while (true) {
            int id = 0;
            String name = null;
            try {
                id = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                break;
            }

            name = reader.readLine();
            if (name.isEmpty()) {
                newMap.put(name, id);
                break;
            }


            isTrue = false;
            while (!isTrue) {
                isTrue = false;
                if (newMap.containsKey(name)) {
                    name = reader.readLine();
                    isTrue = false;
                } else
                    isTrue = true;
            }
            newMap.put(name, id);
        }
        for (Map.Entry<String, Integer> s : newMap.entrySet()) {
            System.out.println(s.getValue() + " " + s.getKey());
        }
    }
}
