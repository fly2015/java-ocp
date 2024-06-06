/*
 * Test4Exception.java
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
public class Test4Exception
{
    @SuppressWarnings("finally")
    public static void main(String[] args) throws Exception
    {
        System.out.print("a");
        try
        {
            System.out.print("b");
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e)
        {
            System.out.print("d");
            throw new IllegalArgumentException("2");
        }
        catch (Exception e)
        {
            System.out.print("d");
            throw new Exception("2");
        }
        
    }
}



/*
 * Changes:
 * $Log: $
 */