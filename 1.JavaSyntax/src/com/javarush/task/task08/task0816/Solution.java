package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Куприянов", dateFormat.parse("MARCH 16 2012"));
        map.put("Ким", dateFormat.parse("JULY 2 2012"));
        map.put("Барыщников", dateFormat.parse("JULY 6 2012"));
        map.put("Максунов", dateFormat.parse("JULY 7 2012"));
        map.put("Карамзина", dateFormat.parse("JUNE 26 2012"));
        map.put("Васильев", dateFormat.parse("JULY 31 2012"));
        map.put("Япаров", dateFormat.parse("NOVEMBER 26 2012"));
        map.put("Швили", dateFormat.parse("JANUARY 7 2012"));
        map.put("Чантарасан", dateFormat.parse("JANUARY 11 2012"));

        //напишите тут ваш код
        return  map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
       Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
       while (iterator.hasNext()) {
           Map.Entry<String, Date> elementDate = iterator.next();
           Date getDate = elementDate.getValue();
           if(getDate.getMonth() > 4 && getDate.getMonth() < 8 ) {
               iterator.remove();
           }
       }
       for(Map.Entry<String, Date> m : map.entrySet()) {
           System.out.println(m.getValue());
       }
    }

    public static void main(String[] args) throws ParseException {
removeAllSummerPeople(createMap());
    }
}
