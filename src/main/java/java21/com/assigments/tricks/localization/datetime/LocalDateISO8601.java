/*
 * LocalDateISO8601.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.localization.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class LocalDateISO8601
{
    public static void main(String[] args)
    {
        LocalDate d = LocalDate.of(0, 1, 1);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yy");
        System.out.println(d.format(dtf));
    }
}



/*
 * Changes:
 * $Log: $
 */