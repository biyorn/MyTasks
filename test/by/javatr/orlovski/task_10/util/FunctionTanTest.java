package by.javatr.orlovski.task_10.util;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class FunctionTanTest {

    @Test
    public void calculationTanTest_Positive() {
        Map<Double, Double> mapList = FunctionTan.calculationTan(1, 10, 1);

        Assert.assertNotNull(mapList.get(1d));
        Assert.assertNotNull(mapList.get(5d));
        Assert.assertNotNull(mapList.get(10d));
    }
}
