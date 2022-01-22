package com.javarush.task.task16.task1632;

public class Thread3 extends Thread {
    private String name;
    public Thread3(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        while(true) {
            try {
                System.out.println("Ура");
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
