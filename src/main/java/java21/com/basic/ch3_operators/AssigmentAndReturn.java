/*
 * AssigmentAndReturn.java
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
public class AssigmentAndReturn
{
    public static void main(String[] args)
    {
        long wolf = 5;
        long coyote = (wolf=3);
        System.out.println(wolf); // 3
        System.out.println(coyote); // 3
    }
}



/*
 * Changes:
 * $Log: $
 */