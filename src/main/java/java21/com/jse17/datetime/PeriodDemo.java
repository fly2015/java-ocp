/*
 * PeriodDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.jse17.datetime;

import java.time.Duration;
import java.time.Period;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PeriodDemo
{
    public static void main(String[] args)
    {
        int days = Period.ofDays(10).getDays();
        System.out.println(days);
        System.out.println(Period.ofDays(10).plus(Period.ofDays(10)).getDays()); 
        System.out.println(Period.ofDays(10).plus(Duration.ofDays(10)));//Unit must be Years, Months or Days, but was Seconds
    }
}



/*
 * Changes:
 * $Log: $
 */