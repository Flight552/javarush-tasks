package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sYears = reader.readLine();
        int iYears = Integer.parseInt(sYears);
        if (iYears % 400 == 0) {
            System.out.println("количество дней в году: " + 366);
        } else if (iYears % 100 == 0 && iYears % 400 != 0) {
            System.out.println("количество дней в году: " + 365);
        } else if(iYears % 4 == 0) {
            System.out.println("количество дней в году: " + 366);
        } else
            System.out.println("количество дней в году: " + 365);

    }
}