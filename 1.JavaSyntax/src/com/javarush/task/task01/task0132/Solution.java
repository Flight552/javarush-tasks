package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int x = 0, y = 0, z = 0;
        if(number >= 100 && number <= 999) {
            x = (int) number / 100;
            y = (int) (number / 10) % 10;
            z = (int) number%10;
        }
        return (x + y + z);
    }
}