package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String,String> peopleList = new HashMap<>();
        peopleList.put("Vasilyev", "Andrey");
        peopleList.put("Vasilyev", "Dmitri");
        peopleList.put("Kupriyanov", "Andrey");
        peopleList.put("Karamzina", "Elena");
        peopleList.put("Demidova", "Vika");
        peopleList.put("Demidova", "Katya");
        peopleList.put("Volodchenkova", "Katya");
        peopleList.put("Baryshnikoff", "Max");
        peopleList.put("Yapparo", "Greg");
        peopleList.put("Shvili", "Vova");

        return peopleList;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
