/*
 * DateLightSavingTimeStart.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.jse17.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class DateLightSavingTime
{
    public static void main(String[] args)
    {
        // Most of the United States observes daylight saving time on March 13, 2022, by moving the
        // clocks forward an hour at 2 a.m
        
        var localDate = LocalDate.of(2022, 3, 13);
        var localTime = LocalTime.of(1, 0);
        var zone = ZoneId.of("America/New_York"); //-5
        var z = ZonedDateTime.of(localDate, localTime, zone); // 2022, 3, 12 1:00 05:00[America/New_York]
        var offset = z.getOffset(); //-5
        var duration = Duration.ofHours(3);
        var later = z.plus(duration);// 2022, 3, 13 is date light saving, then plus 1 to skip the 2AM hours, then the later is contain 5 and the offset change from - 5 to -4
        System.out.println(later.getHour() + " " + offset.equals(later.getOffset()));
    }
}



/*
 * Changes:
 * $Log: $
 */