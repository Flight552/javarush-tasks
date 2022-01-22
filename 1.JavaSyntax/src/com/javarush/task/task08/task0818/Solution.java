package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> namesList = new HashMap<>();
        namesList.put("Васильев", 2500);
        namesList.put("Петров", 100);
        namesList.put("Сидоров", 250);
        namesList.put("Куприянов", 850);
        namesList.put("Барышников", 450);
        namesList.put("Карамзина", 2000);
        namesList.put("Попилина", 324);
        namesList.put("Яппарова", 543);
        namesList.put("Швилли", 432);
        namesList.put("Аванесова", 889);

        return namesList;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> getSalary = iterator.next();
            int deleteUser = getSalary.getValue();
            if(deleteUser < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}