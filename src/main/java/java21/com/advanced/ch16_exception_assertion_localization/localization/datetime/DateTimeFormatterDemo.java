/*
 * DateTimeFormatterDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch16_exception_assertion_localization.localization.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class DateTimeFormatterDemo
{
    public static void main(String[] args)
    {
        DateTimeFormatter isoDate = DateTimeFormatter.ISO_DATE;
        LocalDateTime now = LocalDateTime.now();
        
        System.out.println(isoDate.format(now));
        System.out.println(now.format(isoDate));
        
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("'Date: ' YYYY-MM-dd", Locale.US);
        System.out.println(ofPattern.format(now)); // Date:  2023-06-29
        
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(now));// Thursday, June 29, 2023
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(now));// June 29, 2023
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(now));// Jun 29, 2023
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(now));// 6/29/23
        
        System.out.println(DateTimeFormatter.ofPattern("M.hhmmss").format(now));// 
    }
}



/*
 * Changes:
 * $Log: $
 */