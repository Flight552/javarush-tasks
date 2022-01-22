package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());
        int max = -2147483648;
        if (maximum <= 0)
            return;
        for (int i = 0; i < maximum; i++) {
            int number = Integer.parseInt(reader.readLine());
            if (number > max) {
                max = number;
            }
        }

        //напишите тут ваш код
        System.out.println(max);

    }
}
