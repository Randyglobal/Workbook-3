package com.pluralsight;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> kids = new ArrayList<>();
//        Adding Items in an Array
        kids.add("Randy King");
        kids.add("Java Intro");
        kids.add("Word Press");
//        Updating an index in an Array
        kids.set(2, "Andy");

//        Removing an Item an in An Array
        kids.remove(1);

        for (int i = 0; i < kids.size(); i++) {
            System.out.println((i + 1) + " : " + kids.get(i));
        }

//        Adding After deleting
        kids.add("Brittany");
        System.out.println("After Brittany re-added: ");
        for (int i = 0; i < kids.size(); i++) {
            System.out.println((i + 1) + " : " + kids.get(i));
//            Collection.sort(kids);

        }

    }

}

