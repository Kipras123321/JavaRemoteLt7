package advanced.Composition;

public class Room {

    private TV tv;
    private Bed bed;

    public Room(TV tv, Bed bed) {
        this.tv = tv;
        this.bed = bed;
    }
}
