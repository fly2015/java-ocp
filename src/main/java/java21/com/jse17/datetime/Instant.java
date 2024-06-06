/*
 * Instant.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.jse17.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Instant
{
    public static void main(String[] args)
    {
        var trainDay = LocalDate.of(2022, 5, 13);
        var time = LocalTime.of(10, 0);
        var zone = ZoneId.of("America/Los_Angeles");
        var zdt = ZonedDateTime.of(trainDay, time, zone);
        System.out.println(zdt);
        
        var instant = zdt.toInstant(); // caculate with original offset to GTM/UTC
        System.out.println(instant);
        instant = instant.plus(1, ChronoUnit.DAYS);
        System.out.println(instant);
        
        System.out.println(instant.plus(1, ChronoUnit.WEEKS)); //Unsupported unit: Weeks
    }
}



/*
 * Changes:
 * $Log: $
 */