package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sDay = reader.readLine();
        int iDay = Integer.parseInt(sDay);
        if(iDay == 1) {
            System.out.println("понедельник");
        } else if(iDay == 2) {
            System.out.println("вторник");
        } else if(iDay == 3) {
            System.out.println("среда");
        } else if(iDay == 4) {
            System.out.println("четверг");
        } else if(iDay == 5) {
            System.out.println("пятница");
        } else if(iDay == 6) {
            System.out.println("суббота");
        } else if(iDay == 7) {
            System.out.println("воскресенье");
        } else
            System.out.println("такого дня недели не существует");
    }
}