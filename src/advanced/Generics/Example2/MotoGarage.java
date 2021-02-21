package advanced.Generics.Example2;

public class  MotoGarage {

    private Motorcycle motorcycle;

    public MotoGarage(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }

    public void repairMotorcycle () {
        motorcycle.repair ();

    }
}
