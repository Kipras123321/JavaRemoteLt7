package advanced.Interface.Example2;

public class Plane extends AirTransport implements Fly{

    private int speed;

    public Plane(int speed) {
        super(speed);

    }

    @Override
    public int calculateMaxSpeed() {
        return speed + 50;
    }

    @Override
    public boolean canFly(String condition) {
        return true;
    }
}
