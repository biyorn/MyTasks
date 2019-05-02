package by.javatr.task_4.validator;

public class NumberValidator {

    private static final int MORE_THAN = 2;
    private static final int CHECK_EVEN = 2;
    private static final int EVEN_NUMBER = 0;
    private static final int START_VALUE = 0;

    public static boolean checkExcpression(String excpressions) {
        String[] numbers = excpressions.split("[\\s]+");
        int counter = parser(numbers);
        boolean value = false;
        if (counter >= MORE_THAN) {
            value = true;
        }
        return value;
    }

    private static int parser(String[] excpressions) {
        int counter = START_VALUE;
        for (String element : excpressions) {
            if(Integer.parseInt(element) % CHECK_EVEN == EVEN_NUMBER) {
                counter++;
            }
        }
        return counter;
    }
}
