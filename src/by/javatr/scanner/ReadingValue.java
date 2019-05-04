package by.javatr.scanner;

import by.javatr.scanner.exception.NumberIsNotValidException;

import java.util.Scanner;

public class ReadingValue {
    static {
        scanner = new Scanner(System.in);
    }

    private static Scanner scanner;
    private static final String REGEX_INTEGER_NUMBER = "-?\\d+";
    private static final String REGEX_DOUBLE_NUMBER = "-?\\d+\\.*\\d*";

    public static int readingInteger() throws NumberIsNotValidException {
        String str = scanner.next();
        if(!str.matches(REGEX_INTEGER_NUMBER)) {
            throw new NumberIsNotValidException();
        }
        return Integer.parseInt(str);
    }

    public static double readingDouble() throws NumberIsNotValidException {
        String str = scanner.nextLine().replace(",", ".");
        if(!str.matches(REGEX_DOUBLE_NUMBER)) {
            throw new NumberIsNotValidException();
        }
        return Double.parseDouble(str);
    }

    public static String readingString() {return  scanner.nextLine();}

}
