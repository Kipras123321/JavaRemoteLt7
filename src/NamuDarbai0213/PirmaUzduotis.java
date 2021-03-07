package NamuDarbai0213;


public class PirmaUzduotis {
    public static void main(String[] args) {
        String string = "Ad Astra Per Aspera";
        //* Paversti tekstą tik mažosiomis raidėmis;
        System.out.println(string.toLowerCase());

        //* Paversti tekstą tik didžiosiomis raidėmis;
        System.out.println(string.toUpperCase());

        //* Pakeisti visas 'A' raides, raidėmis 'X';
        System.out.println(string.replace("A","X"));

        //* Patikrinkite ar jūsų tekstas prasideda tekstu: "Ad".
        System.out.println(string.startsWith("Ad"));




    }

    }
