/*
 * InCreaseAndDescrease.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.basic.ch3_operators;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class InCreaseAndDescrease
{
    public static void main(String[] args)
    {
        int lion = 3;
        int tiger = ++lion * 5 / lion--;
        System.out.println("lion is " + lion);//3
        System.out.println("tiger is " + tiger);//5
    }
}



/*
 * Changes:
 * $Log: $
 */