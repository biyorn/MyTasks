package by.javatr.task_6.util;

import by.javatr.task_6.exception.NegativeTimeException;

import java.util.HashMap;
import java.util.Map;

public class TimeInSeconds {

    private static final int NEGATIVE_TIME = 0;
    private static final int HOUR_IN_SECONDS = 3600;
    private static final int MINUTES_IN_HOUR = 60;
    private static final int SECONDS_IN_MINUTE = 60;

    public static Map<String, Integer> timing(long presetTime) throws NegativeTimeException {
        if(presetTime < NEGATIVE_TIME) {
            throw new NegativeTimeException();
        }
        Map<String, Integer> pastTime = new HashMap<>();
        int hours = (int) presetTime / HOUR_IN_SECONDS;
        presetTime -= hours * HOUR_IN_SECONDS;
        int minutes = (int) presetTime / MINUTES_IN_HOUR;
        int seconds = (int) presetTime % SECONDS_IN_MINUTE;
        pastTime.put("Hours", hours);
        pastTime.put("Minutes", minutes);
        pastTime.put("Seconds", seconds);

        return pastTime;
    }
}

