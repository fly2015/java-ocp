/*
 * StringBuilderEqualByCheckingReference.java
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
public class StringBuilderEqualByCheckingReference
{
    public static void main(String[] args)
    {
        StringBuffer b1 = new StringBuffer("abc");
        StringBuffer b2 = new StringBuffer("abc");
        System.out.println(b1.equals(b2)); //false
    }
}



/*
 * Changes:
 * $Log: $
 */