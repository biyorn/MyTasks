package by.javatr.orlovski.task_9.util;

import by.javatr.orlovski.task_9.exception.NumberNotFoundException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleTest {

    @Test
    public void calculationLengthTest_Positive() throws NumberNotFoundException {
        double expected = 31.4;
        double delta = 0.1;
        double actual = Circle.calculationLength(5);
        Assert.assertEquals(actual, expected, delta);
    }

    @Test(expectedExceptions = NumberNotFoundException.class)
    public void calculationLengthTest_Exception() throws NumberNotFoundException {
        Circle.calculationLength(-2);
    }

    @Test
    public void calculationSquareTest_Positive() throws NumberNotFoundException {
        double expected = 78.5;
        double delta = 0.1;
        double actual = Circle.calculationSquare(5);
        Assert.assertEquals(actual, expected, delta);
    }

    @Test(expectedExceptions = NumberNotFoundException.class)
    public void calculationSquareTest_Exception() throws NumberNotFoundException {
        Circle.calculationSquare(-2);
    }
}
