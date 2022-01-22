package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> children = new ArrayList<>();
        children.add(new Human("son Vova", true, 10));
        children.add(new Human("son Greg", true, 8));
        children.add(new Human("daughter Elena", false, 5));

        ArrayList<Human> parents = new ArrayList<>();
        parents.add(new Human("mother Natali", false, 45, children));
        parents.add(new Human("father Sergei", true, 50, children));

        ArrayList<Human> grandParents = new ArrayList<>();
        grandParents.add(new Human("ded Vaysa", true, 68, parents.get(1)));
        grandParents.add(new Human("baba Maria", false, 65, parents.get(1)));
        grandParents.add(new Human("ded Ilya", true, 75, parents.get(0)));
        grandParents.add(new Human("baba Marina", false, 64, parents.get(0)));

        for(Human g : grandParents) {
            System.out.println(g);
        }
        for (Human p : parents) {
            System.out.println(p);
        }

        for(Human c : children) {
            System.out.println(c);
        }


    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();


        public Human(String name) {
            this.name = name;
        }

        public Human(String name, boolean sex, int age) {
            this(name);
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human children) {
            this(name, sex, age);
            this.children.add(children);
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this(name, sex, age);
            this.children.addAll(children);

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
