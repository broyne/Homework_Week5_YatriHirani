package homework_week_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Write a Java program to iterate through all elements in an array list using Iterater.
 */
public class Programme5_Iterate {
    public static void main(String[] args) {
        // Create a new ArrayList to store elements
        ArrayList<String> arrayList = new ArrayList<>();

        // Add some text to the ArrayList
        arrayList.add("First element");
        arrayList.add("Second element");
        arrayList.add("Third element");
        arrayList.add("Forth element");
        arrayList.add("Fifth element");


        // Create an Iterator to iterate through the ArrayList
        Iterator<String> iterator =  arrayList.iterator();

        // Iterate and print each element using the Iterator
        System.out.println("Iterating using the ArrayList using Iterator");
        while (iterator.hasNext()) {
            String list = iterator.next();
            System.out.println(list);
        }
    }
}
