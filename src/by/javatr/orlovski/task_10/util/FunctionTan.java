package by.javatr.orlovski.task_10.util;

import java.util.HashMap;
import java.util.Map;

public class FunctionTan {

    public static Map<Double, Double> calculationTan(double beginA, double endB, double step) {
        Map<Double, Double> tanList = new HashMap<>();

        for (double tanX = beginA; tanX <= endB; tanX += step) {
            double calcTan = Math.tan(tanX);
            tanList.put(tanX, calcTan);
        }

        return tanList;
    }
}
