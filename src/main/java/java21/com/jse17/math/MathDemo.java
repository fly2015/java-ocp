/*
 * MathDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse17.math;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class MathDemo
{
    public static void main(String[] args)
    {
        
        // ceil -> douple
        System.out.println(Math.ceil(65));
        System.out.println(Math.ceil(0));
        System.out.println(Math.ceil(-1));
        System.out.println(Math.ceil(65.11));
        System.out.println(Math.ceil(65.15));
        System.out.println(Math.ceil(65.19));
        
        System.out.println(Math.ceil(-65.01));
        System.out.println(-Math.ceil(-65.01));
        
        // max
        System.out.println(Math.max(7,8));
        
        //pow -> double
        System.out.println(Math.pow(2, 3));
    }
}



/*
 * Changes:
 * $Log: $
 */