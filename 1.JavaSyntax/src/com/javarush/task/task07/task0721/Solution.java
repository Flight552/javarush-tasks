package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int maximum = -2147483647;
        int minimum =  2147483647;

        //напишите тут ваш код
        int[] numbers = new int[20];
        for(int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
            if(list.get(i) > maximum)
                maximum = list.get(i);
            if(list.get(i) < minimum)
                minimum = list.get(i);
        }

        System.out.print(maximum + " " + minimum);
    }
}
