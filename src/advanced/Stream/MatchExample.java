package advanced.Stream;

import java.util.Arrays;
import java.util.List;

public class MatchExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Johanson");

      /*  //Ar yra vardas >3;

        boolean isThereANameLengthMore3 = false;
        for (int i = 0;  i < names.size(); i++) {
            if (names.get(i).length()>3) {
                isThereANameLengthMore3 = true;
                break;
            }
            
        }*/

        boolean isThereANameLengthMore3 = names.stream().anyMatch(name -> name.length()>3);

        System.out.println("Ar yra vardas ilgesnis uz 3 " + isThereANameLengthMore3);

        //Ar visi vardai >3

        /*boolean AllNamesLengthGreater3 = false;
        int counter = 0;
        for (int i = 0; i < names.size(); i++) {

            if (names.get(i).length()>3) {
                counter ++;
            }
            
        }

        if (counter == names.size()) {
            AllNamesLengthGreater3 = true;*/
        //}

        boolean AllnamesLengthGreater3 = names.stream().allMatch(name -> name.length()>3);
        System.out.println("Ar visi vardai " + AllnamesLengthGreater3);
    }
}
