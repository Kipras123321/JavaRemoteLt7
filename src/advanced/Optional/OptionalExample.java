package advanced.Optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String text;

        Optional<String> stringOptional1 = Optional.of("Hello");
        Optional<String> stringOptional2 = Optional.of("World");
        Optional<String> stringOptional3 = Optional.ofNullable(null);

            //lambda
        stringOptional1.ifPresent(variable -> System.out.println(variable) );

        String text2 = stringOptional2.orElse("Tekstas");
        String value = stringOptional3.orElse("Hello World");

        System.out.println(text2);
        System.out.println(value);

    }
}
