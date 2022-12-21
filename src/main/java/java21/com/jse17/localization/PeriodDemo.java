/*
 * PeriodDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse17.localization;

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
        
        System.out.println(true^false);
    }
}



/*
 * Changes:
 * $Log: $
 */