package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        int counter = 0;
        //напишите тут ваш код
       ArrayList<String> list2 = new ArrayList<>(list);
       for(int i = 0; i < list.size(); i++) {
           counter = 0;
           for(int j = 0; j < list2.size(); j++) {
               if(list.get(i).equals(list2.get(j))) {
                   counter++;
               }
           }
           result.put(list.get(i), counter);
       }


        return result;
    }

}

