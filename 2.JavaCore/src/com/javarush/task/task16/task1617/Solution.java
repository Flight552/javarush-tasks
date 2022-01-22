package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();

    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            int i = 0;
            try {
                while (!isInterrupted()) {
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                    Thread.sleep(1000);
                    if (numSeconds < 1) {
                        System.out.println("Марш!");
                        this.interrupt();
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Прервано!");
            }
        }
    }
}
