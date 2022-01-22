package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.*;

public class Solution implements Runnable {
    TreeMap<String, String> readFile = new TreeMap<>();
    File file;
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String triggerWord = "end";
        StringBuilder getFileFullName = new StringBuilder();
        String fileName = null;
        while (true) {
            String getLine = reader.readLine();
            if (getLine.equalsIgnoreCase(triggerWord)) {
                System.out.println(fileName);
                break;
            }
            String[] fileParts = getLine.split("\\.");
            getFileFullName.append(fileParts[0]).append(".").append(fileParts[1]);
            solution.readFile.put(fileParts[2], getLine);
            if(fileName == null) {
                fileName = getFileFullName.toString();
            }
            getFileFullName = new StringBuilder();
        }
        solution.file = new File(fileName);
        if (solution.file.createNewFile()) {
            System.out.println("File Created");
        } else {
            System.out.println("File Already exits");
        }
        List<String> mapValues = new ArrayList<>(solution.readFile.keySet());
        Collections.sort(mapValues);
        for(Map.Entry entry : solution.readFile.entrySet()) {
            System.out.println(entry.getKey());
        }
        Thread writing = new Thread(solution);
        writing.start();
        try {
            writing.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
             fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(Map.Entry entry : readFile.entrySet()) {
            try {
                fis = new FileInputStream(entry.getValue().toString());
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer, 0, buffer.length);
                fos.write(buffer, 0, buffer.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
