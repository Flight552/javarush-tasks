package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution extends Thread{
    public static void main(String[] args) {
        String fileName = args[1];
        String fileOutputName = args[2];
        StringBuilder key = new StringBuilder();

        try {
            BufferedReader readName = new BufferedReader(new FileReader(fileName));
            FileWriter writer = new FileWriter(fileOutputName);
            int readFile = readName.read();
            while(readFile != -1) {
                if(args[0].equalsIgnoreCase("-e")){
                    writer.write(readFile + 1);
                } else if(args[0].equalsIgnoreCase("-d")){
                    writer.write(readFile - 1);
                }
                readFile = readName.read();
            }
            readName.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
