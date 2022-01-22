package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        int maxLength = 0, minLength = 2147483647;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++) {
            list.add(reader.readLine());
            if(list.get(i).length() > maxLength) {
                maxLength = list.get(i).length();
            }
            if(list.get(i).length() < minLength) {
                minLength = list.get(i).length();
            }
        }
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).length() == minLength) {
                System.out.println(list.get(i));
                break;
            }
            else if(list.get(i).length() == maxLength) {
                System.out.println(list.get(i));
                break;
            }
        }

    }
}
