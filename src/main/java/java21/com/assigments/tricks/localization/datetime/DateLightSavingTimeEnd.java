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
public class DateLightSavingTimeEnd
{
    public static void main(String[] args)
    {
        //In the United States, daylight saving time ends on November 6, 2022 at 02:00 a.m. and we
        //repeat the previous hour 2:00 -4 -> 1:00 -5
        LocalDate localDate = LocalDate.of(2022, 11, 6);
        LocalTime localTime = LocalTime.of(1, 59);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        
        System.out.println(zonedDateTime);//2022-11-06T01:59-04:00[America/New_York]
        
        ZonedDateTime plus = zonedDateTime.plus(Duration.ofMinutes(1));
        System.out.println(plus);//2022-11-06T01:00-05:00[America/New_York]
    }
}



/*
 * Changes:
 * $Log: $
 */