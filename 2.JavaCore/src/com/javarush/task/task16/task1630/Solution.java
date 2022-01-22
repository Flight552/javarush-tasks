package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String fileContent = null;
        StringBuilder getFile = new StringBuilder();
        @Override
        public void setFileName(String fullFileName)  {
            fileContent = fullFileName;
        }
        @Override
        public void run() {
            BufferedReader fileReader = null;
            try {
                fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileContent)));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                while(fileReader.ready()) {
                    String c = fileReader.readLine();
                    getFile.append(c).append(" ");

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        @Override
        public String getFileContent() {
            return getFile.toString();
        }

    }
}
