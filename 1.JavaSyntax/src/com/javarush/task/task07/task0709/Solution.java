package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> stringList = new ArrayList<>();
        int stringLength = 2147483647;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 5; i++) {
            stringList.add(reader.readLine());
                if(stringList.get(i).length() < stringLength)
                    stringLength = stringList.get(i).length();
        }
        for(int i = 0; i < stringList.size(); i++) {
            if(stringList.get(i).length() == stringLength)
                System.out.println(stringList.get(i));
        }
    }
}
