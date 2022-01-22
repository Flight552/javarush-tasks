package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        int listSize = list.size();

        for (int i = 0; i < 13; i++) {
            String string = list.get(listSize - 1);
            list.remove(listSize - 1);
            list.add(0, string);
        }
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
