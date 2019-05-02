package by.javatr.scanner;

import java.util.Scanner;

public class ReadingValue {
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static int readingInteger() {
        //Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double readingDouble() {
        return scanner.nextDouble();
    }

    public static String readingString() {return  scanner.nextLine();}

}
