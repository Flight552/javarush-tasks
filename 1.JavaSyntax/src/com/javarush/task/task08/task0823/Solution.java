package com.javarush.task.task08.task0823;

import javax.crypto.spec.PSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        //напишите тут ваш код

        for (String word : string.split("\\b"))
            System.out.print(word.substring(0, 1).toUpperCase().concat(word.substring(1)));

    }
}
