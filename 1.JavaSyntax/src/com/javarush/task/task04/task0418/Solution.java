package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumberA = reader.readLine();
        String sNumberB = reader.readLine();

        int iNumberA = Integer.parseInt(sNumberA);
        int iNumberB = Integer.parseInt(sNumberB);

        if (iNumberA <= iNumberB)
            System.out.println(iNumberA);
        else if(iNumberA >= iNumberB) {
            System.out.println(iNumberB);
        }
    }
}