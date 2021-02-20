package advanced.Collection;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

    public static void main(String[] args) {
        Set<String> visitedCities = new HashSet<>();
        visitedCities.add("Vilnius");
        visitedCities.add("Vilnius");
        visitedCities.add("Kaunas");
        visitedCities.add("Taurage");
        visitedCities.add("Panas");
        visitedCities.add("Roma");

        System.out.println("Original set");
        for (String city : visitedCities) {
            System.out.println(city);
        }

        System.out.println("Edited set");
        visitedCities.remove("Vilnius");
            for (String city : visitedCities) {
                System.out.println(city);
        }


            if (!visitedCities.contains("Madrid")){
                System.out.println("Set has no Madrid");
            }
    }
}
