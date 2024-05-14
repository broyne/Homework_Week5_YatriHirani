package homework_week_5;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme8_HasSet {
    public static void main(String[] args) {
        // Creating a HashSet to store Integer objects
        HashSet<Integer> numbers = new HashSet<>();

        // Adding numbers 4, 7, and 8 to the HashSet
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Call static method in main method
        checkNum(numbers);
    }

    public static void checkNum(HashSet<Integer> numbers){
        // Check which numbers between 1 and 10 are in the set
        System.out.println("Numbers between 1 and 10 that are in the set:");
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i))
                System.out.println(i + " is in the set.");
            else
                System.out.println(i + " is not in the set.");

        }

    }


}
