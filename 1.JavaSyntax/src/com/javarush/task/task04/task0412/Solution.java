package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber  = reader.readLine();
        int iNumber = Integer.parseInt(sNumber);
        if(iNumber > 0) {
            iNumber *= 2;
            System.out.println(iNumber);
        } else if(iNumber < 0) {
            iNumber += 1;
            System.out.println(iNumber);
        } else
            System.out.println(0);
    }

}