package homework_week_5;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3 programmes) using if else and while loop.
 */
public class Programme2_MarkSheet {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        int maths, science, english;
        float percent, total;
        String grade, result;

        System.out.println("Enter Name ");
        String studentName = scanner.nextLine();
        System.out.println("Enter Roll No ");
        int rollNo = scanner.nextInt();

        System.out.println("Enter Maths marks ");
        maths = scanner.nextInt();
        while (maths < 0 || maths > 100) {
            System.out.println("Invalid input, enter valid marks between 0 to 100");
            maths = scanner.nextInt();
        }
        System.out.println("Enter science marks ");
        science = scanner.nextInt();
        while (science < 0 || science > 100) {
            System.out.println("Invalid input, enter valid marks between 0 to 100");
            science = scanner.nextInt();
        }
        System.out.println("Enter english marks ");
        english = scanner.nextInt();
        while (english < 0 || english > 100) {
            System.out.println("Invalid input, enter valid marks between 0 to 100");
            english = scanner.nextInt();
        }
        // closing the scanner object
        scanner.close();

        if (maths >= 0 && maths <= 100 && science >= 0 && science <= 100 && english >= 0 && english <= 100) {
            total = (maths + science + english);
            percent = total / 3;
            if (maths < 35 || science < 35 || english < 35)
                grade = "D";
            else
                grade = calculateGrade(percent);
            result = (grade == "D") ? "Fail" : "Pass";

            printMarkSheet(studentName, rollNo, maths, science, english, total, percent, result, grade);
        } else
            System.out.println("Enter valid marks in range between 0-100");


    }


    public static String calculateGrade(float percent) {
        String grade;
        if (percent >= 80 && percent <= 100)
            return grade = "A+";
        else if (percent >= 60 && percent <= 79)
            return grade = "A";
        else if (percent >= 50 && percent <= 59)
            return grade = "B";
        else if (percent >= 35 && percent <= 49)
            return grade = "C";
        else
            return grade = "D";
    }

    public static void printMarkSheet(String studentName, int rollNo, int maths, int science,
                                      int english, float total, float percent, String result, String grade) {
        System.out.println("---------------------------------");
        System.out.println("|                               |");
        System.out.println("|-----------Mark Sheet----------|");
        System.out.println("|                               |");
        System.out.println("---------------------------------");
        System.out.println("|     Name          :      " + studentName + " |");
        System.out.println("|     Roll No       :       " + rollNo + "  |");
        System.out.println("---------------------------------");
        System.out.println("|     Subjects      :    Marks  |");
        System.out.println("|     Maths         :      " + maths + "   |");
        System.out.println("|     Science       :      " + science + "   |");
        System.out.println("|     English       :      " + english + "   |");
        System.out.println("---------------------------------");
        System.out.println("|     Total          :    " + total + "  |");
        System.out.println("---------------------------------");
        System.out.println("|     Percentage     :    " + percent + " |");
        System.out.println("|     Result         :    " + result + "  |");
        System.out.println("|     Grade          :      " + grade + "   |");
        System.out.println("|                               |");
        System.out.println("---------------------------------");
    }

}
