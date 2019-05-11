package by.javatr.orlovski.task_7.util;

import by.javatr.orlovski.task_7.util.Coordinates;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CoordinatesTest {

    @Test
    public void coordinateComparisonTest_Positive_A() {
        String expected = "A";
        String actual = Coordinates.coordinateComparison(1, 2, 3, 4);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void coordinateComparisonTest_Positive_B() {
        String expected = "B";
        String actual = Coordinates.coordinateComparison(4, 3, 2, 1);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void coordinateComparisonTest_Equals() {
        String expected = "A = B";
        String actual = Coordinates.coordinateComparison(1, 2, 1, 2);
        Assert.assertEquals(actual, expected);
    }
}
