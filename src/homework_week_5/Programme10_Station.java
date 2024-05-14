package homework_week_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Write a programme that tells you which line passes through particular stations. Just use Zone 1 stations name.
 */
public class Programme10_Station {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stations of Zone 1:");
        String stationName = sc.nextLine();

        zone1PassesLine(stationName);

    }

    public static void zone1PassesLine(String stationName){
        // Create a map to associate Zone 1 stations with the lines that pass through them
        Map<String, String> zone1Stations = new HashMap<>();

        zone1Stations.put("Bank", "Bakerloo, Central, Victoria");
        zone1Stations.put("Kennington", "Circle, Jubilee, Northern, Waterloo & City");
        zone1Stations.put("Bond Street", "Central, Circle, District, Hammersmith & City");
        zone1Stations.put("Waterloo", "Victoria, Hammersmith & City, Metropolitan, Northern, Piccadilly, Victoria");

        String stationToQuery = stationName;

        if (zone1Stations.containsKey(stationToQuery)) {
            String lines = zone1Stations.get(stationToQuery);
            System.out.println("The following lines pass through " + stationToQuery + ": " + lines);
        } else
            System.out.println(stationToQuery + " is not a Zone 1 station.");
    }
}
