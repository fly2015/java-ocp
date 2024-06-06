/*
 * NumberFormatDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch16_exception_assertion_localization.localization.number;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Currency;
import java.util.Locale;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class NumberFormatDemo
{
    public static void main(String[] args)
    {
        Locale locale = new Locale("en", "US");
        long number = 10_00000_123;
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        System.out.println(numberFormat.format(number));
        
        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
        System.out.println(numberInstance.format(number));
        
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyInstance.format(number)); // $
        
        NumberFormat compactNumberInstance = NumberFormat.getCompactNumberInstance();
        System.out.println(compactNumberInstance.format(number)); // 1B - Style.SHORT is default
        
        System.out.println(NumberFormat.getCompactNumberInstance(locale, Style.LONG).format(number)); // 1 billion
        System.out.println(NumberFormat.getCompactNumberInstance(locale, Style.SHORT).format(number)); // 1B
        
    }
}



/*
 * Changes:
 * $Log: $
 */