package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String surname;
        private int age;
        private char sex;
        private String profession;
        private boolean smooking;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, String surname, int age, char sex) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String surname, int age, char sex, String profession) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.profession = profession;
        }

        public Human(String name, String surname, int age, char sex, String profession, boolean smooking) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.profession = profession;
            this.smooking = smooking;
        }

        public Human(String name, String surname, int age, boolean smooking) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.smooking = smooking;
        }

        public Human(String name, String surname, char sex, boolean smooking) {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.smooking = smooking;
        }

        public Human(String name, int age, String profession) {
            this.name = name;
            this.age = age;
            this.profession = profession;
        }

        public Human(String name, String surname, boolean smooking) {
            this.name = name;
            this.surname = surname;
            this.smooking = smooking;
        }
    }
}
