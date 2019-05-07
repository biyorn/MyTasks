package by.javatr.task_8.util;

public class FunctionFromX {

    private static final int SET_VALUE_NUMBER = 3;
    private static final int SQUARE_DEGREE = 2;
    private static final int CUBE_DEGREE = 3;
    private static final int NUMBER_FOR_FIRST_CALCULATION = 3;
    private static final int NUMBER_FOR_FIRST_FUNCTION = 9;
    private static final int NUMBER_FOR_SECOND_CALCULATION = 6;

    public static double calculationFunction(int valueX) {
        double result;
        double squareX = Math.pow(valueX, SQUARE_DEGREE);
        double cubeX = Math.pow(valueX, CUBE_DEGREE);

        if(valueX >= SET_VALUE_NUMBER) {
            result = -squareX + NUMBER_FOR_FIRST_CALCULATION * valueX + NUMBER_FOR_FIRST_FUNCTION;
        } else {
            result = 1 / (cubeX - NUMBER_FOR_SECOND_CALCULATION);
        }

        return result;
    }
}
