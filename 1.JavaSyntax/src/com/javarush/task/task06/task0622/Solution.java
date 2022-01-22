package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();
       for(int i = 0; i < 5; i++) {
           int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
       }
        Collections.sort(numbers);
       for(Integer i : numbers) {
           System.out.println(i);
       }

        //напишите тут ваш код
    }
}
