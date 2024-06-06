/*
 * SubStringWithString.java
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
public class SubStringWithString
{
    public static void main(String[] args)
    {
        String str1 = "abc";
        System.out.println(str1.substring(0, 0)); //EMPTY
        System.out.println(str1.substring(0, 10)); //EXCEPTION
    }
}



/*
 * Changes:
 * $Log: $
 */