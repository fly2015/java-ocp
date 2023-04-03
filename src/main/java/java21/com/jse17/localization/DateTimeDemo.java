/*
 * DateTimeDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse17.localization;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class DateTimeDemo
{
    public static void main(String[] args)
    {
        var time = LocalTime.of(1,2,3,4);
        System.out.println(time);
        
        var x = ChronoUnit.HOURS;
    }
}



/*
 * Changes:
 * $Log: $
 */