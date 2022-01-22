package com.javarush.task.task10.task1015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() throws IOException {
        //напишите тут ваш код
        ArrayList<String>[] list = new ArrayList[5];
        for(int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }
        list[0].add("Hello");
        list[0].add("I am here");
        list[1].add("Fine");
        list[2].add("Let's go");
        list[3].add("Hahaha");
        list[4].add("Final Line");
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}