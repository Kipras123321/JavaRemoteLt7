package advanced.Stream;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("Tom", "Brandon", "Michael");
        //Tom: Brandon : Michael

        String text = names.stream()
                .reduce("",
                        (curentValue, element) -> (curentValue.isEmpty() ? "" : curentValue + " : " ) + element);
        System.out.println(text);


        int num = names.stream()
                .map(name -> name.length())
                .reduce(0,
                        (currentSum, number) ->(number > 3? 1 : 0) + currentSum);
        System.out.println(num);


        ////////////////////////////////////////////////////////////////////////////
        //Su esamu žodžių sąrašu atlikite užduotis:
        //    * Sujunkite žodžius į vieną naudodami `reduce` funkciją;
        //    * Naudodami pradinį žodžių sąrašą, paverskite juos didžiosiomis raidėmis su `map` funkcija ir vėl
        //    sujunkite į vieną žodį su `reduce`;
        //    * Naudodami pradinį žodžių sąrašą, sujunkite į vientisą tekstą, kiekvieną žodį atskyrę ženklu `,`
        //    (tekstas negali prasidėti ar baigtis nurodytu ženklu);
        //    * Naudodami pradinį žodžių sąrašą, išspausdinkite tuos, kurie turi raidę `o`.
        //    [Rytas, Lova, Durys, Automobilis, Katinas]

      //1
        List<String > words = Arrays.asList("Rytas", "Lova", "Durys", "Automobilis", "Katinas");
        String concacenatedString = words.stream()
                .reduce("", (concacenatedText, word) -> concacenatedText + " " + word);
        System.out.println(concacenatedString);

        //2
        String concacenatedStringInCapitals = words.stream()
                .map(word -> word.toUpperCase())
                .reduce("", (concacenatedText, word) -> concacenatedText + word);
        System.out.println(concacenatedStringInCapitals);

        //3
        String concacenatedStringKomma = words.stream()
                .filter(word -> word.length() > 5)
                .reduce("",
                        (concacenatedText, word) -> (concacenatedText.isEmpty() ? "": concacenatedText +",") + word);
        System.out.println(concacenatedStringKomma);




    }
}

