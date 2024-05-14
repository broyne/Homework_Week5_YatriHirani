package homework_week_5;

import java.util.ArrayList;

/**
 * Declare following two arrylist and compare it.
 *
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme11_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        System.out.print("C1 ArrayList: ");
        for (String arrayList1 : c1){
            System.out.print(arrayList1 + ", ");
        }
        System.out.println();
        System.out.print("C2 ArrayList: ");
        for (String arrayList2 : c2) {
            System.out.print(arrayList2 + ", ");
        }
        // Comparing two ArrayLists
        if (c1.equals(c2))
            System.out.println("Given arraylist c1 and c2 are Same.");
        else {
            System.out.println();
            System.out.println("Given arraylist c1 and c2 are not Same.");
        }
    }
}
