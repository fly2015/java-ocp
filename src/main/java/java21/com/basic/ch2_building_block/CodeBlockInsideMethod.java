/*
 * CodeBlockInsideMethod.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.basic.ch2_building_block;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CodeBlockInsideMethod
{
    public static void main(String[] args)
    {
        {
            System.out.println("Feathers");
        }
    }

    {
        System.out.println("Snowy");
    }

}


/*
 * Changes:
 * $Log: $
 */