/*
 * CanCastNullToObject.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.foundation.operation;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CanCastNullToObject
{
    public static void main(String[] args)
    {
        Object ojb = (Object)null;
        System.out.println(ojb);//null
        System.out.println(ojb.toString());//NullPointerException
    }
}



/*
 * Changes:
 * $Log: $
 */