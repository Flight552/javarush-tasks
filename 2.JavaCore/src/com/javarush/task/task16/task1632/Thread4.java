package com.javarush.task.task16.task1632;

public class Thread4 extends Thread implements Message {
    private String name;
    private boolean isStopped = false;
    public Thread4(String name){
        this.name = name;
    }
    @Override
    public void run() {
        while (!isStopped) {

        }
    }
    @Override
    public void showWarning() {
        isStopped = true;
    }
}
