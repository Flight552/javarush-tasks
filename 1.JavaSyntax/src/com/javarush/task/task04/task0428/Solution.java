package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int counter = 0;
        if(number > 0) {
            counter++;
        }
        number = Integer.parseInt(reader.readLine());
        if(number > 0) {
            counter++;
        }
        number = Integer.parseInt(reader.readLine());
        if(number > 0)
            counter++;

        System.out.println(counter);
    }
}
