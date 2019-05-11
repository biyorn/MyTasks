package by.javatr.orlovski.task_8.util;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FunctionFromXTest {

    @Test
    public void calculationFunctionTest_Positive_More_Three() {
        double expected = 5;
        double actual = FunctionFromX.calculationFunction(4);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void calculationFunctionTest_Positive_Less_Three() {
        double expected = 0.5;
        double actual = FunctionFromX.calculationFunction(2);
        Assert.assertEquals(actual, expected);
    }
}
