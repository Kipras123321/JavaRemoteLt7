package advanced.Generics.Example1;

public class Car {

    private int engine;

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }

    public Car(int engine) {
        this.engine = engine;
    }
}
