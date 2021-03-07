package advanced.NamuDarbai2.Uzduotis1;

public class Main {


    public static void main(String[] args) {

        Circle circle = new Circle(15);
        RightAngleRectangle rightAngleRectangle = new RightAngleRectangle(25, 35);
        Rectangle rectangle = new Rectangle(20, 50);

        apskaiciuotiApskritimmoPlota(15);
        apskaiciuotiApskritimoIlgi(15);
        apskaiciuotiStatausTrikampioPlota(10, 20);
        apskaiciuotiStaciakampioPlota(20, 25);


    }


    static void apskaiciuotiApskritimmoPlota(int radius) {

        double area = Math.PI * radius * radius;

            System.out.println("Apskritimo plotas yra: " + area);

        }

        static void apskaiciuotiApskritimoIlgi (int radius) {

        double ilgis = 2 * Math.PI * radius;

            System.out.println("Apskritimo ilgis yra: " + ilgis);
        }

        static void apskaiciuotiStatausTrikampioPlota (int a, int b) {
        int plotas = a * b /2;
            System.out.println("Stataus trikampio plotas yra: " + plotas);

        }

        static void apskaiciuotiStaciakampioPlota (int a, int b) {
        int plotas = a * b;
            System.out.println("Staciakampio plotas yra: " + plotas);

        }


    }

