/*
 * PeriodMethodNoChaining.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.localization.datetime;

import java.time.Duration;
import java.time.Period;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class DurationMethodNoChaining
{
    public static void main(String[] args)
    {
        Duration ofHours = Duration.ofDays(10).ofHours(10);
        System.out.println(ofHours);//PT10H
    }
}



/*
 * Changes:
 * $Log: $
 */