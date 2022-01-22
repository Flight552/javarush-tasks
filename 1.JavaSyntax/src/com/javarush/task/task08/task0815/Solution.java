package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
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

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for(Map.Entry<String, String> n : map.entrySet()) {
            if(name.equals(n.getValue())) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for(Map.Entry<String, String> n : map.entrySet()) {
            if(lastName.equals(n.getKey())) {
                count++;
            }
        }
    return count;
    }

    public static void main(String[] args) {

    }
}
