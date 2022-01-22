package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> array = new ArrayList<>();
        array.add("Hello");
        array.add("I am here");
        array.add("Forever and ever");
        array.add("But it is");
        array.add("Too difficult");



        System.out.println(array.size());

        for(int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

    }
}
