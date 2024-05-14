package homework_week_5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Programme3_ReverseArray {

    // Declared Reverse Integer Array method
    public static void reverseIntegerArray(int[] intArr ){
        // Created local variable
        int startVal = 0;
        int endVal = (intArr.length-1) ;
        // Reverse array with the use of temp variable
        while (startVal < endVal ){
            int tempVal = intArr[startVal];
            intArr[startVal] = intArr[endVal];
            intArr[endVal] = tempVal;
            startVal++;
            endVal--;
        }
    }

    // Declared main method
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of integer array: ");
        int arrLength = Integer.parseInt(scanner.nextLine());

        // Numeric array Declaration
        int[] numArray = new int[arrLength];
        for (int i = 0; i < numArray.length; i++){
            System.out.println("Please enter " + i + " element value of Number Array:");
            numArray[i] = scanner.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(numArray));

        // Method called
        reverseIntegerArray(numArray);

        System.out.println("Reversed Array: " + Arrays.toString(numArray));
        //close scanner
        scanner.close();

    }
}
