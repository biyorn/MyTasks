package by.javatr.task_7.util;

public class Coordinates {

    private static final int SQUARE_DEGREE = 2;

    public static String coordinateComparison(int pointAX, int pointAY, int pointBX, int pointBY) {
        double coordinateA = Math.sqrt(Math.pow(pointAX, SQUARE_DEGREE) + Math.pow(pointAY, SQUARE_DEGREE));
        double coordinateB = Math.sqrt(Math.pow(pointBX, SQUARE_DEGREE) + Math.pow(pointBY, SQUARE_DEGREE));
        String result;

        if(coordinateA > coordinateB) {
            result = "B";
        } else if (coordinateA < coordinateB) {
            result = "A";
        } else {
            result = "A == B";
        }

        return result;
    }
}
