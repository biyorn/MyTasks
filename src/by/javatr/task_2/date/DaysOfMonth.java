package by.javatr.task_2.date;

import by.javatr.task_2.exception.MonthException;
import java.time.Month;

public class DaysOfMonth {

    private static final int FIRST_MONTH = 1;
    private static final int LAST_MONTH = 12;
    private static final int LEAP_YEAR = 0;
    private static final int LEAP_YEAR_ONCE_IN = 4;


    private DaysOfMonth() {
    }

    public static int calculationOfDays(int year, int month) throws MonthException {
        if(month < FIRST_MONTH || month > LAST_MONTH || year < 0) {
            throw new MonthException("Month isn't true");
        }

        int quantityOfDays;

        if(year % LEAP_YEAR_ONCE_IN == LEAP_YEAR) {
            quantityOfDays = leapYearСalculation(month);
        } else {
            quantityOfDays = nonLeapYearCalculation(month);
        }

        return quantityOfDays;
    }

    private static int leapYearСalculation(int month) {
       int amount = Month.of(month).maxLength();
       return amount;
    }

    private static int nonLeapYearCalculation(int month) {
        int amount = Month.of(month).minLength();
        return amount;
    }
}
