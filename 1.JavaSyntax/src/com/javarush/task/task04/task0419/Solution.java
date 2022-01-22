package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c, d;
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());
        d = Integer.parseInt(reader.readLine());
        if (a > b && a > c && a > d)
            System.out.println(a);
        else if (b > a && b > c && b > d)
            System.out.println(b);
        else if (c > a && c > b && c > d)
            System.out.println(c);
        else if (d > a && d > b && d > c)
            System.out.println(d);
        else if ((a > b && (a == c || a == d)) || (a > c && (a == b || a == d)) || (a > d && (a == b || a == c)))
            System.out.println(a);
        else if ((b > a && (b == c || b == d)) || (b > c && (b == a || b == d)) || (b > d && (b == a || b == c)))
            System.out.println(b);
        else if ((c > a && (c == b || c == d)) || (c > d && (c == b || c == a)) || (c > b && (c == a || c == d)))
            System.out.println(c);
        else if ((d > a && (d > b || d > c)) || (d > b && (d == a || d == c)) || (d > c && (d== c || d == b)))
            System.out.println(d);
        else if(a == b && b == c && c == d) {
            System.out.println(a);
        }



    }
}
