package com.javarush.task.task19.task1904;

/* 
И еще один адаптер
*/

import java.io.IOException;
import java.text.DateFormat;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner = null;
        public PersonScannerAdapter (Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            Person person = null;
            if (fileScanner.hasNext()) {
                String s = fileScanner.nextLine();
                String[] parts = s.split(" ");

                String firstName = parts[1];
                String middleName = parts[2];
                String lastName = parts[0];

                Calendar calendar = new GregorianCalendar(Integer.parseInt(parts[5]),
                        Integer.parseInt(parts[4])-1,
                        Integer.parseInt(parts[3]));

                person = new Person(firstName, middleName, lastName, calendar.getTime());
            }
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
