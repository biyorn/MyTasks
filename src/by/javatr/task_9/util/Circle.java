package by.javatr.task_9.util;

import by.javatr.task_4.exception.NegativeNumberException;

public class Circle {

    private static final int MULTIPLICATION = 2;
    private static final int SQUARE_DEGREE = 2;
    private static final int POSITIVE_NUMBER = 0;

    public static double calculationLength(int setRadius) throws NegativeNumberException {
        if(setRadius < POSITIVE_NUMBER) {
            throw new NegativeNumberException();
        }
        int diameter = setRadius * MULTIPLICATION;
        double result = Math.PI * diameter;
        return result;
    }

    public static double calculationSquare(int setRadius) throws NegativeNumberException {
        if(setRadius < POSITIVE_NUMBER) {
            throw new NegativeNumberException();
        }
        double result = Math.PI * Math.pow(setRadius, SQUARE_DEGREE);
        return result;
    }
}
