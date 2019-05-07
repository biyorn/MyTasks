package by.javatr.orlovski.test_4.validator;

import by.javatr.orlovski.task_4.exception.NumberNotFoundException;
import by.javatr.orlovski.task_4.validator.NumberValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberValidatorTest {

    @Test
    public void checkExpressionTest_Positive() throws NumberNotFoundException {
        boolean expected = true;
        int[] array = {1, 2, 3, 4};
        boolean actual = NumberValidator.checkExpression(array);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void checkExpressionTest_Negative() throws NumberNotFoundException {
        boolean expected = false;
        int[] array = {1, 2, 3, 9};
        boolean actual = NumberValidator.checkExpression(array);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = NumberNotFoundException.class)
    public void checkExpressionTest_Exception() throws NumberNotFoundException {
        int[] array = null;
        NumberValidator.checkExpression(array);
    }
}
