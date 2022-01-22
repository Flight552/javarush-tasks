package com.javarush.task.task07.task0716;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("рот");
        strings.add("мера");
        strings.add("море");
        strings.add("рота");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        boolean isTrue = false;
        Iterator<String> strIt = strings.iterator();
            while(strIt.hasNext()) {
                String st = strIt.next();
                if(st.contains("р") && !st.contains("л")) {
                    strIt.remove();
                }
            }

        ArrayList<String> newStrings = new ArrayList<>(strings);

        for (int i = 0; i < strings.size(); i ++) {
            if (strings.get(i).contains("л") && !strings.get(i).contains("р")) {
                newStrings.add(strings.get(i));
            }
        }

        return newStrings;
    }
}