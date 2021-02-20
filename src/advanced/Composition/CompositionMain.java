package advanced.Composition;

public class CompositionMain {

    public static void main(String[] args) {
        TV tv = new TV("SAMSUNG", 55);
        Bed bed = new Bed("King Size", "bedroom");
        Room room1 = new Room(tv, bed);


        Room room2 = new Room(
                new TV("SAMSUNG", 55),
                new Bed("Kingsize", "sleep")
        );

    }
}
