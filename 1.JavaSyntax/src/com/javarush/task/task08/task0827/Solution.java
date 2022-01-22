package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws ParseException {

        System.out.println(isDateOdd("JANUARY 2 2012"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat dateToday = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Calendar dateYear = Calendar.getInstance();
        dateYear.setTime(dateToday.parse(date));
        if(dateYear.get(Calendar.DAY_OF_YEAR) % 2 == 0)
            return false;
        return true;
    }
}
