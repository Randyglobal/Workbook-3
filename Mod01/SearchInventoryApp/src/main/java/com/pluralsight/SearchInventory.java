package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class SearchInventory {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %s %s - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
        readInFile();
    }

    public static void display(String message){
        System.out.println(message);
    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();
        display("Enter Id: ");
        String id = scanner.nextLine();
        display("Enter Name: ");
        String name = scanner.nextLine();
//        scanner.next();
        display("Enter Price: ");
        float price = scanner.nextInt();

        Product product = new Product(id, name, price);
        inventory.add(product);
        display("Product Added Successfully");
        return inventory;
    }
    public static void readInFile(){
        try {
            FileReader fileReader = new FileReader("products.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;
            while((input = bufferedReader.readLine()) != null){
                String[] productList = input.split("\\|");
                String id = "";
                String name = "";
                float price = 0;
                Product product = new Product(id, name, price);
                for (String item : productList) {
                    System.out.println(item);
                }
                System.out.println();
            }
            bufferedReader.close();
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
