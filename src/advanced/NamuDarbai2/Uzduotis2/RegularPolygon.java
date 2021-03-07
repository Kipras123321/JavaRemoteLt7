package advanced.NamuDarbai2.Uzduotis2;

public interface RegularPolygon {

    double length = 0;

   float getNumSides();


    double getSideLength ();

     default double getPerimeter(){
         int n = 0;
         return n * length;
     }

     default double getInteriorAngle(){
         int n = 0;
         return (( n -2 ) * 180);
     }

}





//Daugiakampiai:
//    * Interfeisas `RegularPolygon` turi 2 metodus `getNumSides` ir `getSideLength`
//    * Klasė `EquilateralTriangle`, privalo turėti vieną lauką `length` ir implementuoti interfeisą `RegularPolygon`
//    metodas `getNumSides` gražina skaičių 3, metodas `getSideLength` gražina kintamojo reikšmę, inicializuotą per konstruktorių;
//    * Klasė `Square`, kuri implementuoja interfeisą `RegularPolygon` metodą `getNumSides`
//    gražina skaičių 4, metodą `getSideLength` gražina kintamojo reikšmę, inicializuotą
//    per konstruktorių;
//    * Interfeise pridėti 2 defaultinius metodus: `getPerimeter(n * length)` ir `getInteriorAngle((n - 2) 180)`
//    * Sukurtoje `RegularPolygonMain` klasėje apskaičiuoti figūrų perimetrus ir plotus.



