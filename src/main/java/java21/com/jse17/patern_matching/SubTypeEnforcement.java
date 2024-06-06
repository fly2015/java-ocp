/*
 * SubTypeEnforcement.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.jse17.patern_matching;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SubTypeEnforcement
{
    public static void main(String[] args)
    {
        Integer value = 123;
        if(value instanceof Integer) {}
        //if(value instanceof Integer data) {} // DOES NOT COMPILE
        
        Number value1 = 1234.0;
        if(value1 instanceof Integer data) {
            System.out.println(data);
        }
    }
}



/*
 * Changes:
 * $Log: $
 */