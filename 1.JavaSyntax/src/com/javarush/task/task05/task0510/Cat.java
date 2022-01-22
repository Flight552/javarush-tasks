package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int weight;
    int age;
    String address;
    String color;

    public void initialize(String name) {
        this.name = name;
        this.weight = 10;
        this.age = 5;
        this.color = "grey";
    }
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "black";
    }
    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 5;
    }
    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 5;
    }
    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 4;
    }

    public static void main(String[] args) {

    }
}
