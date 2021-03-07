package advanced.NamuDarbai2.Uzduotis2;

public class Square implements RegularPolygon  {

   public double length;



    @Override
    public float getNumSides () {
        return 4;
    }

    @Override
    public double getSideLength() {
        return length;
    }
}
