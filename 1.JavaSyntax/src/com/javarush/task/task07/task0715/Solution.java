package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> array = new ArrayList<>();
        array.add("мама");
        array.add("именно");
        array.add("мыла");
        array.add("именно");
        array.add("раму");
        array.add("именно");



        for(int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
