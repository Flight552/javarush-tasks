package com.javarush.task.task20.task2013;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/* 
Externalizable Person
*/
public class Solution {
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Person(){}

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeObject(father);
            out.writeObject(mother);
            out.writeInt(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            firstName = (String) in.readObject();
            lastName = (String) in.readObject();
            father = (Person)in.readObject();
            mother = (Person)in.readObject();
            age = in.readInt();
            children = (List)in.readObject();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person son = new Person("Andrey", "V", 40);
        Person mother = new Person("Natalia", "V", 60);
        Person father = new Person("Dmitry", "V", 63);
        son.setChildren(Arrays.asList(new Person("4", "4", 2), new Person("5", "5", 1)));
        son.setMother(mother);
        son.setFather(father);


        FileOutputStream file = new FileOutputStream("task2013.txt");
        ObjectOutputStream ous = new ObjectOutputStream(file);
        son.writeExternal(ous);

        Person son_2 = new Person("Pilot", "A", 45);

        FileInputStream fis = new FileInputStream("task2013.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        son_2.readExternal(ois);

        System.out.println(son);
        System.out.println(son_2);
    }
}
