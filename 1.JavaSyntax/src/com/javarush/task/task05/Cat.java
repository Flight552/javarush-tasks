package com.javarush.task.task05;

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int score = 0;
        if (this.age > anotherCat.age)
            score++;
        if (this.weight > anotherCat.weight)
            score++;
        if (this.strength > anotherCat.strength)
            score++;

        if ((this.weight == anotherCat.weight) && (this.strength == anotherCat.strength) && (this.age == anotherCat.age)) {
            long a = this.hashCode();
            long b = anotherCat.hashCode();
            System.out.println(a);
            System.out.println(b);


        }


        return score >= 2;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.weight = 10;
        cat1.strength = 5;
        cat1.age = 7;
        Cat cat2 = new Cat();
        cat2.weight = 10;
        cat2.strength = 5;
        cat2.age = 7;
        System.out.println(cat1.fight(cat2));

    }
}
