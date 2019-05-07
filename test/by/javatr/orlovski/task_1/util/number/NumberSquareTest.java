package by.javatr.orlovski.task_1.util.number;

import by.javatr.orlovski.task_1.exception.NegativeNumberException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberSquareTest {

    @Test
    public void definitionNumberTest_Positive() throws NegativeNumberException {
        int expected = 6;
        int actual = NumberSquare.definitionNumber(24);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = NegativeNumberException.class)
    public void definitionNumberTest_Exception() throws NegativeNumberException {
        NumberSquare.definitionNumber(-10);
    }
}
