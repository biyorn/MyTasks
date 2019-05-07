package by.javatr.orlovski.task_10.util;

import by.javatr.orlovski.task_10.exception.NumberIsNotValidException;

import java.util.HashMap;
import java.util.Map;

public class FunctionTan {

    private static final int POSITIVE_NUMBER = 0;

    public static Map<Double, Double> calculationTan(double beginA, double endB, double step) throws NumberIsNotValidException {
        if(step <= POSITIVE_NUMBER) {
            throw new NumberIsNotValidException();
        }
        Map<Double, Double> tanList = new HashMap<>();

        for (double tanX = beginA; tanX < endB; tanX += step) {
            double calcTan = Math.tan(tanX);
            tanList.put(tanX, calcTan);
        }

        return tanList;
    }
}
