/*
 * DateWith.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.localization.datetime;

import java.time.LocalDate;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class DateWith
{
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.of(2015, 1, 1);
        date.withYear(5);
        System.out.println(date.plusMonths(12));
    }
}



/*
 * Changes:
 * $Log: $
 */