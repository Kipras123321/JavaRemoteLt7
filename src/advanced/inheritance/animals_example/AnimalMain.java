package advanced.inheritance.animals_example;

import java.security.interfaces.DSAKeyPairGenerator;

public class AnimalMain {
    public static void main(String[] args) {
                 Cat cat = new Cat("ginger", "moew", true);
                Dog dog = new Dog("brown", "huf", true);

        System.out.println(cat.yieldVoice());
        System.out.println(dog.yieldVoice());


    }
}

