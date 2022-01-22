package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thread5 extends Thread {
    String name;

    public Thread5(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String s = null;
        while (true) {
            try {
                s = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (s.equals("N") == true)
                break;

            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }

}
