package by.javatr.orlovski.task_6.util;

import by.javatr.orlovski.task_6.exception.NegativeTimeException;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Map;

public class TimeInSecondsTest {

    @Test
    public void timingTest_Positive() throws NegativeTimeException {
        Map<String, Integer> timing = TimeInSeconds.timing(5702);

        Assert.assertNotNull(timing.get("Hours"));
        Assert.assertNotNull(timing.get("Minutes"));
        Assert.assertNotNull(timing.get("Seconds"));
    }

    @Test(expectedExceptions = NegativeTimeException.class)
    public void timingTest_Exception() throws NegativeTimeException {
        TimeInSeconds.timing(-2004);
    }
}
