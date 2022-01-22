package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.*;

public class FileConsoleWriter {
    private FileWriter fileWriter = null;

    private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    FileConsoleWriter(File file, boolean append) throws IOException {

        fileWriter = new FileWriter(file, append);
    }

    FileConsoleWriter(File file) throws IOException {
        fileWriter = new FileWriter(file);
    }

    FileConsoleWriter(FileDescriptor fd) {
        fileWriter = new FileWriter(fd);
    }

    FileConsoleWriter(String str) throws IOException {
        fileWriter = new FileWriter(str);
    }

    FileConsoleWriter(String str, boolean append) throws IOException {
        fileWriter = new FileWriter(str, append);
    }


    public void write(char[] cbuf, int off, int len) throws IOException {
        writer.write(cbuf, off, len);
        writer.flush();
        fileWriter.write(cbuf, off, len);
    }

    public void write(int c) throws IOException {
        writer.write(c);
        writer.flush();
        fileWriter.write(c);
    }

    public void write(String str) throws IOException {
        writer.write(str);
        writer.flush();
        fileWriter.write(str);
    }

    public void write(String str, int off, int len) throws IOException {
        writer.write(str, off, len);
        writer.flush();
        fileWriter.write(str, off, len);
    }

    public void write(char[] cbuf) throws IOException {
        writer.write(cbuf);
        writer.flush();
        fileWriter.write(cbuf);
    }

    public void close() throws IOException {
        writer.flush();
        writer.close();
        fileWriter.close();
    }

    public static void main(String[] args) {

    }

}
