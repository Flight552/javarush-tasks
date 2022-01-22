package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1Reader = reader.readLine();
        String file2Reader = reader.readLine();

          BufferedReader file1 = new BufferedReader( new InputStreamReader(new FileInputStream(file1Reader)));
          BufferedReader file2 = new BufferedReader (new InputStreamReader(new FileInputStream(file2Reader)));

        try {
            while (file1.ready()) {
                String readFile = file1.readLine();
                allLines.add(readFile);
            }
            while (file2.ready()) {
                String readFile = file2.readLine();
                forRemoveLines.add(readFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
            return;
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
