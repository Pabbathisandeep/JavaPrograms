package JavaBasicPrograms;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeConverter {
    public static String getTimeBasedOnGivenHours(int hours) {
        LocalTime currentTime = LocalTime.now();

        // Convert to PST by subtracting 13.5 hours (IST is 13.5 hours ahead of PST)
        LocalTime newTime = currentTime.minusHours(13).minusMinutes(30).plusHours(hours);

        // Upper round to the nearest 15, 30, 45, or 00 minute interval
        int minute = newTime.getMinute();
        int roundedMinute;
        if (minute % 30 == 0) {
            roundedMinute = minute; // No rounding needed
        } else {
            roundedMinute = ((minute / 30) + 1) * 30;
            if (roundedMinute == 60) {
                roundedMinute = 0; // reset to 0 for the next hour
                newTime = newTime.plusHours(hours);
            }
        }

        newTime = newTime.withMinute(roundedMinute).withSecond(0);

        // Format in 12-hour format with am/pm in lowercase
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH);
        String formattedTime = newTime.format(formatter).toLowerCase(); // Convert to lowercase
        return formattedTime;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(getTimeBasedOnGivenHours(2));
    }
}
