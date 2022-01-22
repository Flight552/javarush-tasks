package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> namesList = new HashMap<>();
        namesList.put("Васильев", "Андрей");
        namesList.put("Петров", "Дима");
        namesList.put("Сидоров", "Сергей");
        namesList.put("Куприянов", "Андрей");
        namesList.put("Барышников", "Максим");
        namesList.put("Карамзина", "Елена");
        namesList.put("Попилина", "Наталья");
        namesList.put("Яппарова", "Елена");
        namesList.put("Швилли", "Вова");
        namesList.put("Аванесова", "Ира");

        return namesList;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> names = new ArrayList<>();
        for(Map.Entry<String, String> s : map.entrySet()) {
            names.add(s.getValue());
        }
        Collections.sort(names);
        for(int i = 0; i < names.size() - 1; i++) {
            if(names.get(i).equals(names.get(i+1)))
                removeItemFromMapByValue(map, names.get(i));
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}
