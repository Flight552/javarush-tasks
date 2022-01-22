package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String getLine = reader.readLine();
        BufferedReader readFile = new BufferedReader(new FileReader(getLine));
        String rl = readFile.readLine();
        String findId = null;
        String getId = null;
        ArrayList<Integer> list = new ArrayList<>();
        while (rl != null) {
            if (!rl.isEmpty()) {
                findId = rl.substring(0, 8);
                getId = findId.trim();
                list.add(Integer.parseInt(getId));
            }
            rl = readFile.readLine();
        }
        Collections.sort(list);
        readFile.close();
/*        String[] args1 = new String[]{
                "-c", "shirt black new long sleeves", "12.4774", "2",
        };*/
        int productIdLength = 8;
        int productNameLength = 30;
        int productPriceLength = 8;
        int productQuantityLength = 4;
        StringBuilder productId = new StringBuilder();
        StringBuilder productName = new StringBuilder();
        StringBuilder productPrice = new StringBuilder();
        StringBuilder productQuantity = new StringBuilder();
        String addProductTrigger = "-c";
        for (int i = 1; i < args.length; i++) {
            try {
                productPrice.append(Double.parseDouble(args[i]));
                break;
            } catch (NumberFormatException e) {
                productName.append(args[i]).append(" ");
                e.printStackTrace();
            }
        }

        if (args.length > 0) {
            String name = null;
            String ID = null;
            String price = null;
            String quantity = null;
            if (args[0].equalsIgnoreCase(addProductTrigger)) {
                int lengthName = productName.length();
                int lengthPrice = productPrice.length();
                productQuantity.append(args[args.length - 1]);
                int lengthQuantity = productQuantity.length();
                int id = 0;
                if (getId != null) {
                    id = list.get(list.size() - 1);
                }
                if (id > 0) {
                    id++;
                } else {
                    id = 1;
                }
                productId.append(id);
                int lengthId = productId.length();
                if (lengthId < productIdLength) {
                    for (int i = 0; i < productIdLength - lengthId; i++) {
                        productId.append(" ");
                    }
                    ID = productId.toString();
                } else if (lengthId > productIdLength) {
                    System.out.println("Limit");
                    return;
                } else {
                    ID = productId.toString();
                }
                if (lengthName > productNameLength) {
                    name = productName.substring(0, 30);

                } else if (lengthName < productNameLength) {
                    for (int i = 0; i < productNameLength - lengthName; i++) {
                        productName.append(" ");
                    }
                    name = productName.toString();
                } else {
                    name = productName.toString();
                }
                if (lengthPrice > productPriceLength) {
                    price = productPrice.substring(0, 8);
                } else if (lengthPrice < productPriceLength) {
                    for (int i = 0; i < productPriceLength - lengthPrice; i++) {
                        productPrice.append(" ");
                    }
                    price = productPrice.toString();
                } else {
                    price = productPrice.toString();
                }
                if (lengthQuantity < productQuantityLength) {
                    for (int i = 0; i < productQuantityLength - lengthQuantity; i++) {
                        productQuantity.append(" ");
                    }
                    quantity = productQuantity.toString();
                } else if (lengthQuantity > productQuantityLength) {
                    quantity = productQuantity.substring(0, 4);
                } else {
                    quantity = productQuantity.toString();
                }
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(getLine, true));
            String addToFile = "\n" + ID + name + price + quantity;
            writer.write(addToFile);
            writer.close();
        }
    }
}
