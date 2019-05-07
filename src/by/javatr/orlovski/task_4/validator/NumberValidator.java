package by.javatr.orlovski.task_4.validator;

import by.javatr.orlovski.task_4.exception.NumberNotFoundException;

public class NumberValidator {

    private static final int MORE_THAN = 2;
    private static final int CHECK_EVEN = 2;
    private static final int EVEN_NUMBER = 0;
    private static final int INITIAL_VALUE = 0;
    private static final int POSITIVE_NUMBER = 0;

    public static boolean checkExpression(int[] numbers) throws NumberNotFoundException {
        if(numbers == null) {
            throw new NumberNotFoundException();
        }
        int counter = INITIAL_VALUE;
        for(int element : numbers) {
            if(element % CHECK_EVEN == EVEN_NUMBER) {
                counter++;
            }
        }
        return counter >= MORE_THAN;
    }
}
