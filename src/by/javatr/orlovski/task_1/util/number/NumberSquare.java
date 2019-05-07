package by.javatr.orlovski.task_1.util.number;

import by.javatr.orlovski.task_1.exception.NegativeNumberException;

public class NumberSquare {

    private static final int LAST_DIGIT_NUMBER = 10;
    private static final int POSITIVE_NUMBER = 0;

    private NumberSquare(){}

    public static int definitionNumber(int number) throws NegativeNumberException {
        if(number < POSITIVE_NUMBER) {
            throw new NegativeNumberException();
        }
        int variable = number % LAST_DIGIT_NUMBER;
        int result;
        switch (variable) {
            case 1:
            case 9:
                result = 1;
                break;
            case 2:
            case 8:
                result = 4;
                break;
            case 3:
            case 7:
                result = 9;
                break;
            case 4:
            case 6:
                result = 6;
                break;
            case 5:
                result = 5;
                break;
                default:
                    result = 0;
        }
        return result;
    }
}
