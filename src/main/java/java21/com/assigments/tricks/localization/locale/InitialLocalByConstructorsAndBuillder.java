/*
 * InitialLocalByConstructorsAndBuillder.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.localization.locale;

import java.util.Locale;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class InitialLocalByConstructorsAndBuillder
{
    public static void main(String[] args)
    {
        Locale l1 = new Locale("en");
        Locale l2 = new Locale("en", "US");
        Locale l3 =  new Locale.Builder().setLanguage("en").build();
    }
}



/*
 * Changes:
 * $Log: $
 */