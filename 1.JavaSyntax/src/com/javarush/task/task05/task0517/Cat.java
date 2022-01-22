package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;
    String color;
    int age;
    String address;
    int weight;

    public Cat(String name) {
        this.name = name;
        this.color = "black";
        this.age = 5;
        this.weight = 10;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Black";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.color = "Grey";
        this.age = age;
        this.weight = 14;

    }

    public Cat(int weight, String color) {
        this.name = null;
        this.color = color;
        this.age = 5;
        this.address = null;
        this.weight = weight;
    }
    public Cat(int weight, String color, String address) {
        this.name = null;
        this.color = color;
        this.age = 5;
        this.address = address;
        this.weight = weight;
    }

    public static void main(String[] args) {

    }
}
