/*
 * StripUsage.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.string;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class StripUsage
{
    public static void main(String[] args)
    {
        String str1 = " \tabc\n\t123\n ";
        System.out.println(str1);
        System.out.println(str1.strip());
        System.out.println("END");
    }
}



/*
 * Changes:
 * $Log: $
 */