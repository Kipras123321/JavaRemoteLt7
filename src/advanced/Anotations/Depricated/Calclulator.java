package advanced.Anotations.Depricated;

import java.util.List;

public class Calclulator {

    @Deprecated
    public int sum (int firstNum, int secondNum) {
        return firstNum + secondNum;


    }

    public int sum (List<Integer> numbers) {
        int result = 0;
        for (Integer number : numbers) {
            result += number;
        }

        return result;
    }
}
