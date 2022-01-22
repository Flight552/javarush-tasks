package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        FileReader file1 = new FileReader(reader.readLine());
        reader.close();
        ArrayList<Character> list = new ArrayList<>();
        while(file1.ready()) {
            int ch = file1.read();
            list.add((char) ch);
        }
        file1.close();
        StringBuilder string = new StringBuilder();
        for(Character i : list) {
            string.append(i);
        }
        String str = string.toString();
        Pattern p = Pattern.compile("\\bworld\\b");
        Matcher m = p.matcher(str);
        boolean b = m.matches();
        int count = 0;
        while(m.find()) {
            if(!b)
                count++;
        }
        System.out.println(count);
    }
}
