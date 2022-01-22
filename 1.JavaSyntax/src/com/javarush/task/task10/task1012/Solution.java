package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;
        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        ArrayList<Character> characters = new ArrayList<>();

        for(String s : list) {
            char[] c = s.toCharArray();
            for(int i = 0; i < c.length; i++) {
                characters.add(c[i]);
            }
        }
        for(int i = 0; i < alphabet.size(); i++) {
            counter = 0;
            for(int j = 0; j < characters.size(); j++) {
                if(alphabet.get(i).equals(characters.get(j))) {
                    counter++;
                }
            }
            System.out.println(alphabet.get(i) + " " + counter);
        }
        // напишите тут ваш код
    }
}
