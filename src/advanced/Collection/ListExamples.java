package advanced.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {

        List<String> VisitedCOuntries = new ArrayList<>();
        VisitedCOuntries.add("Germany");
        VisitedCOuntries.add("Germany");
        VisitedCOuntries.add("Spain");
        VisitedCOuntries.add("Spain");
        VisitedCOuntries.add("Spain");
        VisitedCOuntries.add("Italy");


        System.out.println("Original");
        for (String country : VisitedCOuntries) {
            System.out.println(country);

        }

        VisitedCOuntries.remove("Spain");
        System.out.println("Edited");
        for (String country : VisitedCOuntries){
        System.out.println(country);

    }
        System.out.println(VisitedCOuntries.contains("Germany"));
}
}
