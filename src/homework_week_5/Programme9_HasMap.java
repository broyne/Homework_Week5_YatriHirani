package homework_week_5;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme9_HasMap {
    public static void main(String[] args) {
        //Create Hashmap to store String keys and integer value
        Map<String, Integer> peoplename = new HashMap();
        peoplename.put("Yatri", 22);
        peoplename.put("Smita", 24);
        peoplename.put("Priyanka", 33);
        peoplename.put("Keyur", 44);
        //Called static method
        checkMap(peoplename);
    }

    public static void checkMap(Map<String, Integer> student) {
        // foreach loop is used to iterate the value in the map
        System.out.println("Roll no of the student in the map");
        for (Map.Entry<String, Integer> pName : student.entrySet()) {
            System.out.println(pName.getKey() + " " + pName.getValue());
        }
    }
}
