package homework_week_5;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme7_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>();
        // Checked the array list
        checkArrayListEmpty(nameList);

        // Add an element to the ArrayList
        nameList.add("Sunday");
        nameList.add("Monday");
        nameList.add("Tuesday");

        // Checked the array list
        checkArrayListEmpty(nameList);

    }

    public static void checkArrayListEmpty(ArrayList dayNameList) {
        if (dayNameList.isEmpty()) {
            System.out.println("ArrayList is empty.");
        } else {
            System.out.println("ArrayList is not empty.");

        }
    }

}
