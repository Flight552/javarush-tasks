package com.javarush.task.task16.task1632;

public class Thread2 extends Thread  {
    private String name;
    public Thread2(String name){
        this.name = name;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(100000000);
        } catch (InterruptedException e) {
            //e.printStackTrace();
            System.out.println("InterruptedException");
        }
    }
}
