package advanced.Generics.Example2;

public class GarageMain {
    public static void main(String[] args) {

        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

       // CarGarage carGarage = new CarGarage(car);
       // MotoGarage motoGarage = new MotoGarage(motorcycle);

      //  carGarage.carRepair();
       // motoGarage.repairMotorcycle();

        Garage<Car> carGarage = new Garage<>(car);
        Garage<Motorcycle> motorcycleGarage = new Garage<>(motorcycle);

        carGarage.repairVehicle();
        motorcycleGarage.repairVehicle();



    }


}
