package advanced.GenericInterface;

public class Motocycle implements Comparable <Motocycle> {


    @Override
    public int compareTo(Motocycle object) {
        return 0;
    }

    @Override
    public Motocycle getObject() {
        return this;
    }
}
