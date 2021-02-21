package advanced.Generics.Example1;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(0);
        String text = "tekstas";
        int number = 50;

        GenericBox<Car> boxWithCarInit = new GenericBox<>(car);
        GenericBox<String> boxWithString = new GenericBox<>(text);
        GenericBox<Integer> boxWithNumber = new GenericBox<>(number);

        System.out.println(boxWithCarInit.getItem());
        System.out.println(boxWithNumber.getItem());





    }
}
