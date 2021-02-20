package advanced.Enumerators;

public class EnumExampleMain {
    public static void main(String[] args) {

        System.out.println(Coffee.AMERICANO.name());

        Coffee coffee = Coffee.valueOf("LATTE");
        System.out.println(coffee.name());

        System.out.println(Carmaker.BMW.fullName);
    }
}
