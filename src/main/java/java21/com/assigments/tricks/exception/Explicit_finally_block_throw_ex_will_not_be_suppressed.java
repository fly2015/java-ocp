/*
 * Explicit_finally_block_throw_ex_will_not_be_suppressed.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.exception;

/**
 * @author nhqhien
 * @version $Revision: $
 */
public class Explicit_finally_block_throw_ex_will_not_be_suppressed
{
    public static void m1() throws Exception
    {
        throw new Exception("Exception from m1");
    }


    public static void m2() throws Exception
    {
        try
        {
            m1();
        }
        catch (Exception e)
        {
            // Can't do much about this exception so rethrow it
            throw e;
        }
        finally
        {
            throw new RuntimeException("Exception from finally");
        }

    }


    public static void main(String[] args)
    {
        try
        {
            m2();
        }
        catch (Exception e)
        {
            Throwable[] ta = e.getSuppressed();
            for (Throwable t : ta)
            {
                System.out.println(t.getMessage());
            }
        }
    }
}

/*
 * Changes:
 * $Log: $
 */