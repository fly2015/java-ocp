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
public class PeriodMethodNoChaining
{
    public static void main(String[] args)
    {
        Period ofMonths = Period.ofDays(10).ofMonths(3);
        final Period plus = ofMonths.plus(Duration.ofDays(1));
        System.out.println(ofMonths);//P3M
    }
}



/*
 * Changes:
 * $Log: $
 */