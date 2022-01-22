package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] numbers = new int[20];
        int[] small1 = new int[10];
        int[] small2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        for(int i = 0; i < small1.length; i++) {
            small1[i] = numbers[i];
        }
        for(int i = 10; i < numbers.length; i++) {
            small2[i - 10] = numbers[i];
        }
        for(int i = 0; i < small2.length; i++) {
            System.out.println(small2[i]);
        }
    }
}
