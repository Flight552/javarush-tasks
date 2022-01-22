package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();
        int iA = Integer.parseInt(sA);
        int iB = Integer.parseInt(sB);
        int iC = Integer.parseInt(sC);
        if (iA == iB && iA != iC) {
            System.out.println(iA + " " + iB);
        } else if (iB == iC && iA != iB) {
            System.out.println(iB + " " + iC);
        } else if (iA == iC && iA != iB) {
            System.out.println(iA + " " + iC);
        } else if (iA == iB && iB == iC) {
            System.out.println(iA + " " + iB + " " + iC);
        }


    }
}