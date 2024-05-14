package homework_week_5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme4_NewArray {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of integer array: ");
        int arrLength = Integer.parseInt(scanner.nextLine());
        // Called method
        ArrayList(arrLength);
        //Close scanner object
        scanner.close();
    }

    public static void ArrayList(int list) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);

        //Create new array
        ArrayList<String> colorsList = new ArrayList<>();

        for (int i = 0; i < list; i++) {
            System.out.println("Enter the colour which you want to see in List:");
            String name = scanner.nextLine();
            colorsList.add(name);
        }


        // Print out the collection using foreach loop
        System.out.println("Colors in the List:");
        for (String color : colorsList) {
            System.out.println(color);
        }

    }

}

