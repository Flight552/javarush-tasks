package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stringDate = reader.readLine();
        SimpleDateFormat newDate = new SimpleDateFormat();
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(stringDate);
        String simpleDateFormat = new SimpleDateFormat("MMM d, yyyy").format(date);
        System.out.println(simpleDateFormat.toUpperCase());
    }
}
