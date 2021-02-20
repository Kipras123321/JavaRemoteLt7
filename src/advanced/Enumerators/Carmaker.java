package advanced.Enumerators;

public enum Carmaker {

    BMW("bymer", 1800),
    VOLVO("vOLVO", 1900),
    MB("Mercedes Benz", 1850);

   final String fullName;
   final int establishment;

    Carmaker(String fullName, int establishment) {
        this.fullName = fullName;
        this.establishment = establishment;
    }
}
