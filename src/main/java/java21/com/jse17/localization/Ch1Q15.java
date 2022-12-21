/*
 * Ch1Q15.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse17.localization;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Ch1Q15
{
    public static void main(String[] args)
    {
        var montyPythonDay = LocalDate.of(2023, Month.MAY, 10);
        var aprilFools = LocalDate.of(2023, Month.APRIL, 1);
        var duration = Duration.ofDays(1);
        System.out.println(duration);
        var result = montyPythonDay.minus(duration);
        System.out.println(result + " " + aprilFools.isBefore(result));
    }
}



/*
 * Changes:
 * $Log: $
 */