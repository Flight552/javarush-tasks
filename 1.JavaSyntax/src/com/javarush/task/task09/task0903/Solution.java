package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return  /*напишите тут ваш код*/ stackTraceElement[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        return  /*напишите тут ваш код*/ stackTraceElement[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return  /*напишите тут ваш код*/ element[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return  /*напишите тут ваш код*/element[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return  /*напишите тут ваш код*/ element[2].getLineNumber();
    }
}
