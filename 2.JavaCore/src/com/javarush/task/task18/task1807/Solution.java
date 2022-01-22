package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(new File(reader.readLine()));
        int counter = 0;

        while (input.available() > 0) {
            int data = input.read();
            if(data == 44) {
                counter++;
            }
        }
        System.out.println(counter);
        input.close();
        reader.close();
    }
}
