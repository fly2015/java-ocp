/*
 * InstantOnlyManipulateWithDateOrSmaller.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.localization.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class InstantOnlyManipulateWithDateOrSmaller
{
    public static void main(String[] args)
    {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(2023, 11, 10, 10, 30, 10, 50, ZoneId.systemDefault());
        System.out.println(zonedDateTime);
        
        Instant instant = zonedDateTime.toInstant();
        System.out.println(instant);
        System.out.println(instant.plus(10, ChronoUnit.DAYS));
        System.out.println(instant.plus(10, ChronoUnit.DAYS).plus(1, ChronoUnit.DAYS));
        
        System.out.println(instant.plus(10, ChronoUnit.MONTHS));//Exception
    }
}



/*
 * Changes:
 * $Log: $
 */