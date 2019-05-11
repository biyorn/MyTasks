package by.javatr.orlovski.task_5.util;

import by.javatr.orlovski.task_5.exception.NotThreeDigitNumberException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareNumberTest {

    @Test
    public void numberComparisonTest_Negative() throws NotThreeDigitNumberException {
        boolean expected = false;
        boolean actual = SquareNumber.numberComparison(243);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = NotThreeDigitNumberException.class)
    public void numberComparisonTest_Exception() throws NotThreeDigitNumberException {
        SquareNumber.numberComparison(24);
    }
}
