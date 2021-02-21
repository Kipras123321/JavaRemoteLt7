package advanced.Generics.Example2;

public class CarGarage {

    private Car car;

    public CarGarage(Car car) {
        this.car = car;
    }

    public void carRepair () {
        car.repair();
    }
}
