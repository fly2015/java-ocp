/*
 * TrickiestPoint.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.jse17;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class TrickiestPoint
{
    public static void main(String[] args)
    {
        //parsing && valueOf
        Long valueOf = Long.valueOf("100");
        long parseLong = Long.parseLong("100");
        
        //re-assign declare variable
        getX(5);
        
        // Only have 28/29 on Feb
        /*
         * var date1 = LocalDate.of(2022, Month.MARCH, 3);
         * var date2 = LocalDate.of(2022, Month.FEBRUARY, 31);
         * System.out.println(date1.equals(date2));
         */
        
        // Have to have last space at the closing triple quotes
        System.out.println("""
                         "ape"
                         "baboon"
                         "gorilla" """);
        
        
        //substring with begin index
        var builder = "54321";
        builder = builder.substring(4);
        //System.out.println(builder.charAt(2));
        
        
        // ternary not required parentheses
        int time = 9;
        int day = 3;
        var dinner = ++time >= 10 ? day-- <= 2
        ? "Takeout" : "Salad" : "Leftovers";

        // indent to add a line break
        System.out.print("hien".indent(-1));
    }
    
    public static void getX(int x)
    {
        x = 10;
        System.out.println(x);
    }
}



/*
 * Changes:
 * $Log: $
 */