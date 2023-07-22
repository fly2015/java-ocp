/*
 * Test4Lamdas.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.assigments.jse11;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
interface Sing
{
    boolean isTooLoud(int volume, int limit);
    public default void test()
    {
        
    }
}


public class OperaSinger
{
    public static void main(String[] args)
    {
        //check((h, l) -> h.toString(), 5); // m1
    }


    private static void check(Sing sing, int volume)
    {
        if (sing.isTooLoud(volume, 10)) // m2
            System.out.println("not so great");
        else
            System.out.println("great");
    }
}




/*
 * Changes:
 * $Log: $
 */