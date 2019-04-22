package lv.javaguru.junit.workshop.task_2.fizzbuzzenterprise.rules;

import lv.javaguru.junit.workshop.task_2.fizzbuzzenterprise.FizzBuzzRule;

public class DivideBy5Rule implements FizzBuzzRule {

    @Override
    public boolean isSatisfied(int number) {
        return number % 5 == 0;
    }

    @Override
    public String produceResult(int number) {
        return "Buzz";
    }
}
