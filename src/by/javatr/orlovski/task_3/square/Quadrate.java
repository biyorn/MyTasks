package by.javatr.orlovski.task_3.square;

import by.javatr.orlovski.task_3.exception.SquareException;

public class Quadrate {

    //private static final int NUMBER_OF_SIDES = 4;
    private static final int HALF_OF_DIAGONAL = 2;
    private static final int MATH_VALUE = 2;
    private static final int SQUARE_OF_QUADRATE = 2;
    private static final int NEGATIVE_VALUE = 0;

    private Quadrate() {}

    public static double squareOfInscribedQuadrate(double square) throws SquareException {
        if(square < NEGATIVE_VALUE){
            throw new SquareException();
        }
        double diagonal = Math.sqrt(square);
        double radius = diagonal / HALF_OF_DIAGONAL;

        double side = radius * Math.sqrt(MATH_VALUE);
        double inscribedSquare = Math.pow(side, SQUARE_OF_QUADRATE);
        double time = square / inscribedSquare;
        return time;
    }
}
