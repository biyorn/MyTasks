package by.javatr.runner;

import by.javatr.scanner.ReadingOfValue;
import by.javatr.task_3.square.Quadrate;

public class Run {

    public static void main(String[] args) {

//        System.out.print("Enter year: ");
//        int year = ReadingOfValue.readingInteger();
//
//        System.out.print("\nEnter month: ");
//        int month = ReadingOfValue.readingInteger();
//
//        try {
//            System.out.println("\nAmount of days - " + DaysOfMonth.calculationOfDays(year, month));
//        } catch (MonthException e) {
//            e.printStackTrace();
//        }

        System.out.print("Enter square of quadrate: ");
        double square = ReadingOfValue.readingDouble();

        System.out.println("Square of inscribed quadrate - " + Quadrate.squareOfInscribedQuadrate(square));
    }
}
