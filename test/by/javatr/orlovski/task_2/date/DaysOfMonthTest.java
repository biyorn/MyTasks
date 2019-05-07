package by.javatr.orlovski.task_2.date;

import by.javatr.orlovski.task_2.exception.MonthException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DaysOfMonthTest {

    @Test
    public void calculationOfDaysTest_Positive() throws MonthException {
        int expected = 28;
        int actual = DaysOfMonth.calculationOfDays(2019, 2);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = MonthException.class)
    public void calculationOfDaysTest_Exception() throws MonthException {
        DaysOfMonth.calculationOfDays(-1000, 20);
    }
}
