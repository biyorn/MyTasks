package by.javatr.orlovski.task_3.square;

import by.javatr.orlovski.task_3.exception.SquareException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadrateTest {

    @Test
    public void squareOfInscribedQuadrateTest_Positive() throws SquareException {
        double expected = 2;
        double delta = 0.001;
        double actual = Quadrate.squareOfInscribedQuadrate(20);
        Assert.assertEquals(actual, expected, delta);
    }

    @Test(expectedExceptions = SquareException.class)
    public void squareOfInscribedQuadrateTest_Exception() throws SquareException {
        Quadrate.squareOfInscribedQuadrate(-10);
    }
}
