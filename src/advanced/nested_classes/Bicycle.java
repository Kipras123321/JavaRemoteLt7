package advanced.nested_classes;

public class Bicycle {

    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Bicycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    //nested
    public static class Mechanic {
        public void upgrade(Bicycle bicycle) {
            bicycle.maxSpeed *= 2;




        }
    }
}
