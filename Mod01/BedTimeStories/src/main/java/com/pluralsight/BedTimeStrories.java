package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedTimeStrories {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      getUserPriompt();
    }
    public static void getUserPriompt(){
        System.out.println("Please select the story you want to read 1/2/3");
        int selectedOption = scanner.nextInt();
        if (selectedOption == 1){
            goldilockStory();
        } else if (selectedOption == 2) {
            hanselAAndGretel();
        } else if (selectedOption == 3) {
            maryHadLittleLamp();
        }
    }
    public static void goldilockStory(){
        String path = "\\pluralsight_1\\Workbook-3\\Mod1\\BedTimeStories\\src\\main\\java\\com\\pluralsight\\";
        try {
            FileInputStream fis = new FileInputStream(path + "goldilocks.txt");
            Scanner scanner = new Scanner(fis);

            String input;

            while (scanner.hasNextLine()){
                input = scanner.nextLine();
                System.out.println(input);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
    public static void hanselAAndGretel(){
        String path = "\\pluralsight_1\\Workbook-3\\Mod1\\BedTimeStories\\src\\main\\java\\com\\pluralsight\\";
        try {
            FileInputStream fis = new FileInputStream(path + "hansel_and_gretel.txt");
            Scanner scanner = new Scanner(fis);

            String input;

            while (scanner.hasNextLine()){
                input = scanner.nextLine();
                System.out.println(input);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
    public static void maryHadLittleLamp(){
        String path = "\\pluralsight_1\\Workbook-3\\Mod1\\BedTimeStories\\src\\main\\java\\com\\pluralsight\\";
        try {
            FileInputStream fis = new FileInputStream(path + "mary_had_a_little_lamb.txt");
            Scanner scanner = new Scanner(fis);

            String input;

            while (scanner.hasNextLine()){
                input = scanner.nextLine();
                System.out.println(input);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

}
