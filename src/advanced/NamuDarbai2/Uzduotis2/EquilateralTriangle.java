package advanced.NamuDarbai2.Uzduotis2;

public class EquilateralTriangle implements RegularPolygon {

   public double length;

    public EquilateralTriangle(int length) {
        this.length = length;
    }


    @Override
    public float getNumSides() {
        return 0;
    }

    @Override
    public double getSideLength() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getInteriorAngle() {
        return 0;
    }
}
