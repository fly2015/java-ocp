/*
 * DateLightSavingTimeStart.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.localization.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class DateLightSavingTimeStart
{
    public static void main(String[] args)
    {
        //The United States observes daylight saving time on March 13, 2022, by moving the clocks
        //forward an hour at 2 a.m. 2:00 -5 -> 3:00 -4
        LocalDate localDate = LocalDate.of(2022, 3, 13);
        LocalTime localTime = LocalTime.of(1, 59);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        
        System.out.println(zonedDateTime);//2022-03-13T01:59-05:00[America/New_York]
        
        ZonedDateTime plus = zonedDateTime.plus(Duration.ofMinutes(1));
        System.out.println(plus);//2022-03-13T03:00-04:00[America/New_York]
    }
}



/*
 * Changes:
 * $Log: $
 */