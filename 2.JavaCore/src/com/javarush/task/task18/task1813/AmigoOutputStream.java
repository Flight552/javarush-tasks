package com.javarush.task.task18.task1813;

import java.io.*;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
    FileOutputStream component;

    @Override
    public void write(int b) throws IOException {
        component.write(b);

    }

    @Override
    public void write(byte[] b) throws IOException {
        component.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        component.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        component.flush();
        String name = "JavaRush © All rights reserved.";
        write(name.getBytes());
        component.close();
    }

    @Override
    public void flush() throws IOException {
        component.flush();
    }


    public AmigoOutputStream(FileOutputStream name) throws FileNotFoundException {
        super(fileName);
        component = name;
    }


    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
