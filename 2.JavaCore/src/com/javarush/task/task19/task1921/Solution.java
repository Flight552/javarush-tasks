package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        String fileName = args[0];
        ArrayList<Integer> dates = new ArrayList<>();
        StringBuilder fullName = new StringBuilder();
        StringBuilder getDate = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        Date date;
        String line = reader.readLine();
        while (line != null) {
            String[] getName = line.split(" ");
            for (String s : getName) {
                try {
                    dates.add(Integer.parseInt(s.trim()));
                } catch (NumberFormatException e) {
                    fullName.append(s + " ");
                }
            }
            for (Integer d : dates) {
                getDate.append(" " + d);
            }
            dates.clear();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            date = dateFormat.parse(getDate.toString().trim());
            System.out.println(date);
            PEOPLE.add(new Person(fullName.toString().trim(), date));
            getDate = new StringBuilder();
            fullName = new StringBuilder();
            line = reader.readLine();
        }
        reader.close();
    }
}
