package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> fileLine1 = new ArrayList<>();
        ArrayList<String> fileLine2 = new ArrayList<>();
        try {
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            FileReader fReader1 = new FileReader(file1);
            FileReader fReader2 = new FileReader(file2);
            BufferedReader reader1 = new BufferedReader(fReader1);
            BufferedReader reader2 = new BufferedReader(fReader2);
            String line1 = reader1.readLine();
            String line2 = reader2.readLine();

            while (line1 != null) {
                fileLine1.add(line1);
                line1 = reader1.readLine();
            }
            while (line2 != null) {
                fileLine2.add(line2);
                line2 = reader2.readLine();
            }
            int j = 0;
          for(int i = 0; i < fileLine1.size(); i++) {
              if(j < fileLine2.size() && fileLine1.get(i).equalsIgnoreCase(fileLine2.get(j))) {
                  lines.add(new LineItem(Type.SAME, fileLine1.get(i)));
              } else if (j < fileLine2.size() && fileLine1.get(i).equalsIgnoreCase(fileLine2.get(j+1))) {
                  lines.add(new LineItem(Type.ADDED, fileLine2.get(j)));
                  fileLine1.add(i, " ");
              } else {
                  lines.add(new LineItem(Type.REMOVED, fileLine1.get(i)));
                  fileLine2.add(i, " ");
              }
              j++;
          }
            for (; j < fileLine2.size(); j++) {
                lines.add(new LineItem(Type.ADDED, fileLine2.get(j)));
            }

            for (LineItem l : lines) {
                System.out.println(l.type + " " + l.line);
            }

            fReader1.close();
            fReader2.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
