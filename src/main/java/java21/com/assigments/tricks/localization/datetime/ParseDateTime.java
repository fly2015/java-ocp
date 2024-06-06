/*
 * ParseDateTime.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.localization.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ParseDateTime
{
    public static void main(String[] args)
    {
        String inputStr = "The time is 15 minutes past 10PM.";
        String pattern = "'The time is 'm' minutes past 'ha.";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        
        String dateTimeStr = LocalDateTime.of(2015, 12, 24, 22, 15).format(dtf);
        System.out.println(dateTimeStr);
        
        String timeStr = LocalTime.of(9, 20).format(dtf);
        System.out.println(timeStr);
        
        LocalTime time = LocalTime.parse(inputStr, dtf);
        System.out.println(time);//22:15
        
        //LocalDateTime dateTime = LocalDateTime.parse(inputStr, dtf); // without date can not parse to LocalDateTime
        //System.out.println(dateTime);
    }
}



/*
 * Changes:
 * $Log: $
 */