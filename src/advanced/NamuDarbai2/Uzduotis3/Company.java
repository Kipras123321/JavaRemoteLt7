package advanced.NamuDarbai2.Uzduotis3;

public class Company {

    String name;
    String address;
    String productionType;
    Class Device;

    public Company(String name, String address, String productionType, Class device) {
        this.name = name;
        this.address = address;
        this.productionType = productionType;
        Device = device;
    }
}


//Company and device:
//    * Susikurti 3 objektus: `Company`, `Device`, `ProductionType`:
//    * Company turi talpinti laukus (`name`, `address`, `productionType`, `devices`);
//    * Device turi talpinti (`name`, `price`, `quantity`, `description`);
//    * ProductionType turi talpinti tipus -> (TECHNOLOGIES, AUTOMOBILES, GARDEN_TOOLS, FOOD);
//    * Inicializuoti 5 `company` objektus. Vienas `company` objektas privalo turėti 2-3 `device` objektus;
//    * Atvaizduoti kiekvieno `company` objekto brangiausią `device` objektą;
//    * Atvaizduoti visus `company` objektus, kurių `productType` -> TECHNOLOGIES;
//    * Visa informacija išvedama į result.txt failą.