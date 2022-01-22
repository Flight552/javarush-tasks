package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int [10];
        String[] strings = new String [10];
        for(int i = 0; i < numbers.length; i++) {
            strings[i] = reader.readLine();
            numbers[i] = strings[i].length();
            System.out.println(numbers[i]);
        }


    }
}
