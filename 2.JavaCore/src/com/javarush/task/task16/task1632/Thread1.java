package com.javarush.task.task16.task1632;

public class Thread1 extends Thread{
    String name;

    public Thread1(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        while (true);
    }
}
