package advanced.GenericInterface;

public class Car implements Comparable<Car> {

    int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int compareTo(Car object) {
        return this.maxSpeed - object.maxSpeed;
    }

    @Override
    public Car getObject() {
        return null;
    }
}
