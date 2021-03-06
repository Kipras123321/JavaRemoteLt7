package advanced.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Johanson");

       Optional< String > anyname = names.stream().findAny();
        System.out.println("Any name: " + anyname.orElse("List empty"));

        System.out.println("First name in list: " + names.stream().findFirst().get());

    }


}
