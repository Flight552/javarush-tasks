package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int counterA = 1;
        int b = Integer.parseInt(reader.readLine());
        int counterB = 2;
        int c = Integer.parseInt(reader.readLine());
        int counterC = 3;
        if (a != c && (b == c))
            System.out.println(counterA);
        else if (b != a && (a == c))
            System.out.println(counterB);
        else if (c != a && (b == a))
            System.out.println(counterC);
    }
}
