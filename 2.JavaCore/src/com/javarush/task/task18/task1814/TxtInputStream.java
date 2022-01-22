package com.javarush.task.task18.task1814;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    boolean isException = false;
    FileInputStream component;

    public TxtInputStream(String fileName) throws UnsupportedFileNameException, IOException, FileNotFoundException {
        super(fileName);
        if (fileName.endsWith(".txt")) {
          this.component = new FileInputStream(fileName);
        } else {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) {
    }
}

