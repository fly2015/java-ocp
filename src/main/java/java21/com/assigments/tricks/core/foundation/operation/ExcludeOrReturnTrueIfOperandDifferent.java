/*
 * ExcludeOrReturnTrueIfOperandDifferent.java
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
public class ExcludeOrReturnTrueIfOperandDifferent
{
    public static void main(String[] args)
    {
        System.out.println(true ^ false);//true
        System.out.println(false ^ false);//false
        System.out.println(true ^ true);//false
        
        
        // Return 1 if only one side has 1
        System.out.println(1 ^ 0);//1
        System.out.println(0 ^ 0);//0
        System.out.println(1 ^ 1);//0
        System.out.println(0 ^ 1);//1
    }
}



/*
 * Changes:
 * $Log: $
 */