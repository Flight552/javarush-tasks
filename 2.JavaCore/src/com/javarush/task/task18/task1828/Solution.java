package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String getLine = reader.readLine();
        BufferedReader readFile = new BufferedReader(new FileReader(getLine));
        String rl = readFile.readLine();
        String findId = null;
        String getId = null;
        TreeMap<Integer, String> list = new TreeMap<>();
        while (rl != null) {
            if (!rl.isEmpty()) {
                findId = rl.substring(0, 8);
                getId = findId.trim();
                list.put(Integer.parseInt(getId), rl);
            }
            rl = readFile.readLine();
        }
        readFile.close();

        int productIdLength = 8;
        int productNameLength = 30;
        int productPriceLength = 8;
        int productQuantityLength = 4;
        StringBuilder productId = new StringBuilder();
        StringBuilder productName = new StringBuilder();
        StringBuilder productPrice = new StringBuilder();
        StringBuilder productQuantity = new StringBuilder();
        String updateProduct = "-u";
        String deleteProduct = "-d";

        if (args.length > 0) {
            String name = null;
            String ID = null;
            String price = null;
            String quantity = null;
             if (args[0].equalsIgnoreCase(updateProduct)) {
                Integer updateId = Integer.parseInt(args[1]);
                for (Map.Entry k : list.entrySet()) {
                    if (k.getKey() == updateId) {
                        productId.append(updateId);
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
                        for (int i = 2; i < args.length; i++) {
                            try {
                                productPrice.append(Double.parseDouble(args[i]));
                                break;
                            } catch (NumberFormatException e) {
                                productName.append(args[i]).append(" ");
                                e.printStackTrace();
                            }
                        }
                        int lengthName = productName.length();
                        int lengthPrice = productPrice.length();
                        productQuantity.append(args[args.length - 1]);
                        int lengthQuantity = productQuantity.length();
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
                        String addToFile = ID + name + price + quantity;
                        list.remove(updateId);
                        list.put(updateId, addToFile);
                        break;
                    }
                }

                File file = new File(getLine);
                if (file.delete()) {
                    System.out.println();
                }
                if (file.createNewFile()) {
                    System.out.println();
                }
                BufferedWriter writer = new BufferedWriter(new FileWriter(getLine, true));
                for (Map.Entry in : list.entrySet()) {
                    writer.write("\n" + in.getValue().toString());
                }
                writer.close();
            } else if (args[0].equalsIgnoreCase(deleteProduct)) {
                Integer deleteId = Integer.parseInt(args[1]);
                for (Map.Entry d : list.entrySet()) {
                    if (d.getKey() == deleteId) {
                        list.remove(deleteId);
                        break;
                    }
                }
                File file = new File(getLine);
                if (file.delete()) {
                    System.out.println();
                }
                if (file.createNewFile()) {
                    System.out.println();
                }
                BufferedWriter writer = new BufferedWriter(new FileWriter(getLine, true));
                for (Map.Entry in : list.entrySet()) {
                    writer.write("\n" + in.getValue().toString());
                }
                writer.close();
            }
        }
    }
}
