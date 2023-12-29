/*
 * DoWhileParamScope.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.foundation.decision;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class DoWhileParamScope
{
    public static void main(String[] args)
    {
        double iguana = 0;
       /*
        do
        {
            int snake = 1;
            System.out.print(snake++ + " ");
            iguana--;
        }
        while (snake <= 5);// snake is not in scope
        */
        System.out.println(iguana);
    }
}



/*
 * Changes:
 * $Log: $
 */