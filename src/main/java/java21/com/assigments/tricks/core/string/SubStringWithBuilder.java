/*
 * SubStringWithBuilder.java
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
public class SubStringWithBuilder
{
    public static void main(String[] args)
    {
        StringBuilder builder1 = new StringBuilder("abc");
        System.out.println(builder1.substring(0, 0)); //EMPTY
        //System.out.println(builder1.substring(0, 10)); // EXCEPTION
        System.out.println(builder1.delete(0, 0));
        System.out.println(builder1.delete(0, 10)); 
    }
}



/*
 * Changes:
 * $Log: $
 */