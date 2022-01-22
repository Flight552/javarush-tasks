package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        Object LOCAL = new Object();
        if (args.length > 0) {
            switch (args[0]) {
                case "-c":
                    synchronized (allPeople) {
                    if ((args.length - 1) % 3 == 0) {
                        for (int i = 1; i < args.length; i += 3) {
                            String sex = args[i + 1];
                            String name = args[i];
                            Date dateOfBirth = new Date();
                            SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy", Locale.ENGLISH);
                            try {
                                dateOfBirth = format.parse(args[i + 2]);
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                                if (sex.equalsIgnoreCase("m")) {
                                    allPeople.add(Person.createMale(name, dateOfBirth));
                                } else {
                                    allPeople.add(Person.createFemale(name, dateOfBirth));
                                }
                            }
                        } else{
                            System.out.println("Неверные параметры");
                        }
                    }
                    break;
                case "-u":
                    synchronized (allPeople) {
                        if (args.length < 5) {
                            System.out.println("Неверные параметры");
                        }
                        for (int i = 1; i < args.length; i += 4) {
                            int id = -1;
                            try {
                                id = Integer.parseInt(args[i]);
                                String name = args[i + 1];
                                Date dateOfBirth = new Date();
                                SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy", Locale.ENGLISH);
                                try {
                                    dateOfBirth = format.parse(args[i + 2]);
                                } catch (ParseException e) {
                                    e.printStackTrace();
                                }
                                if(allPeople.get(id).getSex().equals("m")) {
                                    allPeople.get(id).setSex(Sex.MALE);
                                } else {
                                    allPeople.get(id).setSex(Sex.FEMALE);
                                }
                                allPeople.get(id).setName(name);
                                allPeople.get(id).setBirthDate(dateOfBirth);

                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                                System.out.println("Неверные параметры");
                            }
                        }
                    }
                    break;

                case "-d":
                    synchronized (allPeople) {
                        if (args.length < 2) {
                            System.out.println("Неверные параметры");
                        }
                        for (int i = 0; i < args.length; i++) {
                            int id = -1;
                            try {
                                id = Integer.parseInt(args[i]);

                                allPeople.get(id).setName(null);
                                allPeople.get(id).setSex(null);
                                allPeople.get(id).setBirthDate(null);

                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                                System.out.println("Неверные параметры");
                            }
                        }
                    }
                    break;
                case "-i":
                    synchronized (allPeople) {
                    if (args.length < 2) {
                        System.out.println("Неверные параметры");
                    }
                    for (int i = 1; i < args.length; i++) {
                        int id = -1;
                        String sex = null;
                        try {
                            id = Integer.parseInt(args[i]);
                            if (allPeople.get(id).getSex().equals("FEMALE")) {
                                sex = "ж";
                            } else {
                                sex = "м";
                            }
                                System.out.println(allPeople.get(id).getName() + " " + sex + " " + allPeople.get(id).getBirthDate());
                            } catch(NumberFormatException e){
                                e.printStackTrace();
                                System.out.println("Неверные параметры");
                            }
                        }
                    }
                    break;

                default:
                    System.out.println("Wrong parameters");
            }
        }
    }
}
