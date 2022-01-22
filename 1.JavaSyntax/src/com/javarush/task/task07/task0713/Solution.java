package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        ArrayList<Integer> listMain = new ArrayList<>();
        ArrayList<Integer> listByThree = new ArrayList<>();
        ArrayList<Integer> listByTwo = new ArrayList<>();
        ArrayList<Integer> allOther = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            number = Integer.parseInt(reader.readLine());
            listMain.add(number);
        }

        for (int i = 0; i < listMain.size(); i++) {
            number = listMain.get(i);
            if (number % 3 == 0) {
                listByThree.add(number);
            }
        }
        for (int i = 0; i < listMain.size(); i++) {
            number = listMain.get(i);
            if (number % 2 == 0) {
                listByTwo.add(number);
            }
        }
        for (int i = 0; i < listMain.size(); i++) {
            number = listMain.get(i);
            if (number % 3 != 0 && number % 2 != 0)
                allOther.add(number);
        }
        printList(listByThree);
        printList(listByTwo);
        printList(allOther);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
