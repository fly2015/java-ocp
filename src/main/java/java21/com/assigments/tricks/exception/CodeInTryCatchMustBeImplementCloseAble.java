/*
 * CodeInTryCatchMustBeImplementCloseAble.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.exception;

import java.io.Closeable;
import java.io.IOException;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CodeInTryCatchMustBeImplementCloseAble
{
    public static void main(String[] args)
    {
        try(CloseAble1 closeAble1 = new CloseAble1())
        {
            System.out.println("Do something!!");
        }
        catch (Exception e)
        {
            
        }
    }

}

record CloseAble1() implements AutoCloseable
{
    /**
     * @see java.io.Closeable#close()
     */
    @Override
    public void close()
    {
        System.out.println("Closed");
    }
    
}

/*
 * Changes:
 * $Log: $
 */