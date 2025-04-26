package com.pluralsight;

import java.util.Random;
import java.util.Scanner;

public class FamousQuotes {
    static Scanner scanner = new Scanner( System.in);
    static Random  random = new Random();
    static String[] quotes = {
            "The purpose of our lives is to be happy.",
            "Life is what happens when you're busy making other plans.",
            "Get busy living or get busy dying.",
            "You only live once, but if you do it right, once is enough.",
            "Many of life's failures are people who did not realize how close they were to success when they gave up.",
            "If you want to live a happy life, tie it to a goal, not to people or things.",
            "Never let the fear of striking out keep you from playing the game.",
            "Not how long, but how well you have lived is the main thing.",
            "The best time to plant a tree was 20 years ago. The second best time is now.",
            "Life is a Cycle"
    };
    public static void main(String[] args) {
        displayQuotes();
        looping();
        scanner.close();
//        randomQuote();
    }
//    Method to display messages
    public static String display(String message){
        System.out.println(message);
        return message;
    }
   public static void displayQuotes(){
        display("Please enter any number from 1 - 10 for a quote");
        int quoteNumber = scanner.nextInt();
//        checks if the number the user enters is greater or equals to 1 and if it falls withing the range of the array.length
       if (quoteNumber >= 1 && quoteNumber <= quotes.length) {
//              number -1 to get the index of the quote and display
           try {
               int quote = quoteNumber - 1 ;
               display(" " + quoteNumber + " : " + quotes[quote]);
           } catch (Exception e) {
//               throw new RuntimeException(e);
               display("Invalid entry" + e);
           }


       }
   }
   public static void looping(){
       for (int i = 0; i < quotes.length; i++) {
       display("Do you want to see another Saying? (yes/no)");
       String respond = scanner.next();
       if (respond.equalsIgnoreCase("yes")) {
               displayQuotes();
           } else if (respond.equalsIgnoreCase("no")) {
           display("Okay, Bye");
           randomQuote();
       }
       }
   }
    public static void randomQuote(){
        for (int i = 0; i < quotes.length; i++) {
            display("Do you want to a random Saying? (yes/no)");
            String respond = scanner.next();
            if (respond.equalsIgnoreCase("yes")) {
                int randomQuote = random.nextInt(quotes.length);
                display("" + randomQuote);
            } else if (respond.equalsIgnoreCase("no")) {
                display("Okay, Bye");
                break;
            }
        }
    }
}
