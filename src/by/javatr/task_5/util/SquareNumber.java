package by.javatr.task_5.util;

import by.javatr.task_5.exception.NotThreeDigitNumberException;

public class SquareNumber {

    private static final int MIN_THREE_DIGIT_NUMBER = 100;
    private static final int MAX_THREE_DIGIT_NUMBER = 999;
    private static final int DEGREE_SQUARE = 2;
    private static final int DEGREE_CUBE = 3;
    private static final int INITIAL_VALUE = 0;
    private static final int LAST_DIGIT_NUMBER = 10;
    private static final int NUMBER_HAS_DIGITS = 0;
    private static final int DELETE_LAST_DIGIT = 10;


    public static boolean numberComparison(int threeDigitNumber) throws NotThreeDigitNumberException {
        if(threeDigitNumber < MIN_THREE_DIGIT_NUMBER || threeDigitNumber > MAX_THREE_DIGIT_NUMBER) {
            throw new NotThreeDigitNumberException();
        }

        int square = (int) Math.pow(threeDigitNumber, DEGREE_SQUARE);

        int sumNumbers = calculationAmount(threeDigitNumber);
        int sumCube = (int) Math.pow(sumNumbers, DEGREE_CUBE);

        return square == sumCube;
    }

    private static int calculationAmount(int number) {
        int result = INITIAL_VALUE;
        while(number > NUMBER_HAS_DIGITS) {
            result += number % LAST_DIGIT_NUMBER;
            number /= DELETE_LAST_DIGIT;
        }
        return result;
    }
}
