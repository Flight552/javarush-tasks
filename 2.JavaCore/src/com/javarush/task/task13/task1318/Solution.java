package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream input  = new FileInputStream(reader.readLine());

        while (input.available() > 0) {
            System.out.print((char) input.read());
        }

        input.close();
        reader.close();

    }
}