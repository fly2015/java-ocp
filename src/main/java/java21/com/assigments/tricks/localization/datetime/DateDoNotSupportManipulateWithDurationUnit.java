/*
 * DateDoNotSupportManipulateWithDurationUnit.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.assigments.tricks.localization.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class DateDoNotSupportManipulateWithDurationUnit
{
    public static void main(String[] args)
    {
        var montyPythonDay = LocalDate.of(2023, Month.MAY, 10);
        var duration = Duration.ofDays(1);
        System.out.println(duration);
        var result1 = montyPythonDay.minus(duration);
        var result2 = montyPythonDay.minus(1, ChronoUnit.MINUTES);
        //System.out.println(result + " " + aprilFools.isBefore(result));
    }
}



/*
 * Changes:
 * $Log: $
 */