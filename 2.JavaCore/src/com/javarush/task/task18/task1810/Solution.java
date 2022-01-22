package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import javax.imageio.IIOException;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(new File(reader.readLine()));


        while (input.available() > 999) {
            input = new FileInputStream(new File(reader.readLine()));
        }
        throw new DownloadException();


    }

    public static class DownloadException extends Exception {

    }
}
