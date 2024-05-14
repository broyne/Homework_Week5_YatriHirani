package homework_week_5;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given array list.
 */
public class Programme6_retrieve {
    public static void main(String[] args) {

        ArrayList<String> dayList = new ArrayList<>();

        dayList.add("Monday");
        dayList.add("Tuesday");
        dayList.add("Wednesday");
        dayList.add("Thursday");
        dayList.add("Friday");
        dayList.add("Saturday");
        dayList.add("Sunday");
         int index = 6;
        retrieveElements(index, dayList);

    }

    public static void retrieveElements(int key, ArrayList<String> shape) {
        if (key >= 0 && key < shape.size()) {
            String element = shape.get(key);
            System.out.println("Element at index " + key + ": " + element);
        } else
            System.out.println("Invalid data");

    }
}
