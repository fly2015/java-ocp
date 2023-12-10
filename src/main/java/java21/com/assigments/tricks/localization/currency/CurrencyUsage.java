/*
 * CurrencyUsage.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.localization.currency;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Currency;
import java.util.Locale;
import java.util.Locale.Category;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CurrencyUsage
{
    public static void main(String[] args)
    {
        Currency instance = Currency.getInstance(new Locale("vn", "VN"));
        System.out.println(instance);
        
        Locale.setDefault(new Locale("en", "US"));
        Locale.setDefault(Category.FORMAT, new Locale("vn", "VN"));
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        System.out.println(currencyInstance.format(100.109));
        
        NumberFormat currencyInstanceShort = NumberFormat.getCompactNumberInstance(new Locale("en","US"), Style.SHORT);
        System.out.println(currencyInstanceShort.format(100000.01));
        
    }
}



/*
 * Changes:
 * $Log: $
 */