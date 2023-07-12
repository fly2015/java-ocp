/*
 * DateTrickiestPoint.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.jse17.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class DateTrickiestPoint
{
    public static void main(String[] args)
    {
        // Period do not chain
        var period = Period.ofYears(1).ofMonths(6).ofDays(3);
        // LocalDate do not chain
        var datex = LocalDate.of(2022, Month.MARCH, 3).of(2022, Month.MARCH, 4);
        System.out.println(datex);
        
    }
}



/*
 * Changes:
 * $Log: $
 */