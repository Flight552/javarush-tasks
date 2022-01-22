package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Andrey", 40, "Moscow");
        Man man2 = new Man("Pilot", 34, "Moscow");
        Woman woman1 = new Woman("Yana", 33, "Moscow");
        Woman woman2 = new Woman("Lena", 38, "Moscow");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);

    }

    //напишите тут ваш код
    public static class Man{
        String name;
        String address;
        int age;

        public Man(String name) {
            this.name = name;
        }

        public Man(String address, int age) {
            this.address = address;
            this.age = age;
        }

        public Man(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }
    public static class Woman{
        String name;
        String address;
        int age;

        public Woman(String name) {
            this.name = name;
        }

        public Woman(String address, int age) {
            this.address = address;
            this.age = age;
        }

        public Woman(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }
}
