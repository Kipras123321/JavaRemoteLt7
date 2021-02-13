package advanced.inheritance.abstract_example;

public class Ship extends Vehicle {

    String model;

    public Ship(int maxSpeed) {
        super(maxSpeed);
    }


    @Override
    public int vehicleMaxSpeed() {
        return maxSpeed;
    }
}
