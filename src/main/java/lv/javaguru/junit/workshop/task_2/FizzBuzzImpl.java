package lv.javaguru.junit.workshop.task_2;

public class FizzBuzzImpl implements FizzBuzz {

    public String calculate(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return "" + number;
    }

}
