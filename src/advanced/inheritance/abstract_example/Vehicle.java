package advanced.inheritance.abstract_example;

public abstract class Vehicle {

    protected int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract int vehicleMaxSpeed ();

}
