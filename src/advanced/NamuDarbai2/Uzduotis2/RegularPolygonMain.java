package advanced.NamuDarbai2.Uzduotis2;

import advanced.Interface.Example1.Square;

public class RegularPolygonMain implements RegularPolygon {
    public static void main(String[] args) {


        //Daugiakampiai:
        //    * Interfeisas `RegularPolygon` turi 2 metodus `getNumSides` ir `getSideLength`
        //    * Klasė `EquilateralTriangle`, privalo turėti vieną lauką `length` ir implementuoti interfeisą `RegularPolygon`
        //    metodas `getNumSides` gražina skaičių 3, metodas `getSideLength` gražina kintamojo reikšmę, inicializuotą per konstruktorių;
        //    * Klasė `Square`, kuri implementuoja interfeisą `RegularPolygon` metodą `getNumSides`
        //    gražina skaičių 4, metodą `getSideLength` gražina kintamojo reikšmę, inicializuotą
        //    per konstruktorių;
        //    * Interfeise pridėti 2 defaultinius metodus: `getPerimeter(n * length)` ir `getInteriorAngle((n - 2) 180)`
        //    * Sukurtoje `RegularPolygonMain` klasėje apskaičiuoti figūrų perimetrus ir plotus.


        Square square = new Square(5);

        square.getPerimeter();


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