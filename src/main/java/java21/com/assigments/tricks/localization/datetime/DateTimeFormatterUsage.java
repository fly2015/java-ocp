/*
 * DateTimeFormatter.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.localization.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class DateTimeFormatterUsage
{
    public static void main(String[] args)
    {
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.of(2023, 11, 20), LocalTime.of(20, 20, 30));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss SS a");
        System.out.println(localDateTime.format(dateTimeFormatter));
        
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDate.of(2023, 11, 20), LocalTime.of(20, 20, 30), ZoneId.systemDefault());
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss SS a z");
        System.out.println(dateTimeFormatter2.format(zonedDateTime));
    }
}



/*
 * Changes:
 * $Log: $
 */