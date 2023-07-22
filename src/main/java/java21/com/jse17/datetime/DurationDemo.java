/*
 * DurationDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.jse17.datetime;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class DurationDemo
{
    public static void main(String[] args)
    {
        System.out.println(Duration.ofMillis(1000000000));
        System.out.println(Duration.of(10, ChronoUnit.MONTHS)); //Unit must not have an estimated duration
    }
}



/*
 * Changes:
 * $Log: $
 */