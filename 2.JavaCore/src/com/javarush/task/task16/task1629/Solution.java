package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t2.start();

        t1.join();
        t2.join();


        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        private int counter = 0;
        ArrayList<String> str = new ArrayList<>();
        private String out;
        private boolean isTrue = false;
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                while (!isTrue) {
                    if (counter < 3) {
                        String getLine = reader.readLine();
                        str.add(getLine);
                        counter++;
                    } else
                        isTrue = true;
                }
            } catch (IOException e) {

            }
        }

        public void printResult() {
            for(String s : str){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
