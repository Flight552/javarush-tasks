package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human human1 = new Human("Max", true, 55);
        Human human2 = new Human("Lena", false, 87);
        Human human3 = new Human("Yana", false, 87);
        Human human4 = new Human("Greg", true, 96);
        Human human5 = new Human("Andrey", true, 3, human1, human2);
        Human human6 = new Human("Vova", true, 44, human1, human2);
        Human human7 = new Human("Vladi", true, 1, human1, human2);
        Human human8 = new Human("Nat", false, 42, human1, human2);
        Human human9 = new Human("Kat", false, 23, human1, human2);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);
        System.out.println(human9);
    }

    public static class Human {
        // напишите тут ваш код
         String name;
         int age;
         boolean sex;
         Human father;
         Human mother;
         public Human(String name, boolean sex, int age) {
             this.name = name;
             this.age = age;
             this.sex = sex;
         }
         public Human(String name, boolean sex, int age, Human father, Human mother) {
             this(name, sex, age);
             this.father = father;
             this.mother = mother;
         }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}