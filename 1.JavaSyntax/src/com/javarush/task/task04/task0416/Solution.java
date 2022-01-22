package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sMinutes = reader.readLine();
        double dMinutes = Double.parseDouble(sMinutes);
        dMinutes = (Math.floor(dMinutes)%5);
        if (dMinutes % 10 >= 0 && dMinutes % 10 < 3) {
            System.out.println("зелёный");
        } else if (dMinutes % 10 >= 3 && dMinutes % 10 < 4) {
            System.out.println("жёлтый");
        } else if (dMinutes % 10 >= 4 && dMinutes % 10 < 5)
            System.out.println("красный");

    }
}