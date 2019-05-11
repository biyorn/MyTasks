package by.javatr.orlovski.task_9.util;

import by.javatr.orlovski.task_9.exception.NumberNotFoundException;

public class Circle {

    private static final int MULTIPLICATION = 2;
    private static final int SQUARE_DEGREE = 2;
    private static final int POSITIVE_NUMBER = 0;

    public static double calculationLength(int setRadius) throws NumberNotFoundException {
        if(setRadius < POSITIVE_NUMBER) {
            throw new NumberNotFoundException();
        }
        int diameter = setRadius * MULTIPLICATION;
        double result = Math.PI * diameter;
        return result;
    }

    public static double calculationSquare(int setRadius) throws NumberNotFoundException {
        if(setRadius < POSITIVE_NUMBER) {
            throw new NumberNotFoundException();
        }
        double result = Math.PI * Math.pow(setRadius, SQUARE_DEGREE);
        return result;
    }
}
