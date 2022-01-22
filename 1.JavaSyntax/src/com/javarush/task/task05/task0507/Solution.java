package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float median;
        int numbers = 0;
        int counter = 0;
        int input;
        while(true) {
            input = Integer.parseInt(reader.readLine());
            if(input == -1) {
                median = (float) numbers / counter;
                break;
            }
            numbers += input;
            counter++;
        }
        System.out.println(median);
    }
}

