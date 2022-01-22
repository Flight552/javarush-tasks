package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.23, "Hello");
        labels.put(1.24, "Hello");
        labels.put(1.25, "Hello");
        labels.put(1.26, "Hello");
        labels.put(1.27, "Hello");
    }

    public static void main(String[] args) {

        System.out.println(labels);

    }
}
