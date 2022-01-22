package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) {
        System.out.println(new Solution(4));
        FileInputStream fis = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        String fileName = "task2014.txt";
        try {
            fis = new FileInputStream(fileName);
            fos = new FileOutputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
        Solution savedObject = new Solution(10);
        try {
            oos = new ObjectOutputStream(fos);
            oos.writeObject(savedObject);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Solution loadObject = new Solution(15);
        try{
            ois = new ObjectInputStream(fis);
            loadObject = (Solution) ois.readObject();
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(savedObject);
        System.out.println(loadObject);

        if(savedObject.string.equals(loadObject.string)) {
            System.out.println("Equal");
        }

    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
