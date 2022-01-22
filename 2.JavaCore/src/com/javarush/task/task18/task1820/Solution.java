package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file1 = reader.readLine();
            String file2 = reader.readLine();

            BufferedReader readFile = new BufferedReader(new FileReader(file1));
            BufferedWriter writeFile = new BufferedWriter(new FileWriter(file2));
            String line = readFile.readLine();
            while(line != null) {
                String[] numbers = line.split(" ");
                for(int i = 0; i < numbers.length; i++) {
                    double number = Double.parseDouble(numbers[i].trim());
                    int num = (int) Math.round(number);
                    writeFile.write(num + " ");
                }
                line = readFile.readLine();
            }
            readFile.close();
            writeFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
