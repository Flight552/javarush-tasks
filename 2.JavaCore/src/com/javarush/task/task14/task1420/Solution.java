package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer num1 = 0, num2 = 0;
        num1 = Integer.parseInt(reader.readLine());
        num2 = Integer.parseInt(reader.readLine());
        int gcd = 0;
        if (num1 <= 0 || num2 <= 0)
            throw new Exception();

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }
        System.out.println(gcd);
    }
}
