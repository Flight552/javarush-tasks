package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int counterPos = 0, counterNeg = 0;
        if (number > 0) {
            counterPos++;
        } else if (number < 0) {
            counterNeg++;
        }
        number = Integer.parseInt(reader.readLine());
        if (number > 0) {
            counterPos++;
        } else if (number < 0) {
            counterNeg++;
        }
        number = Integer.parseInt(reader.readLine());
        if (number > 0) {
            counterPos++;
        } else if (number < 0) {
            counterNeg++;
        }
        System.out.println("количество отрицательных чисел: " + counterNeg + ", количество положительных чисел: " + counterPos);

    }
}
