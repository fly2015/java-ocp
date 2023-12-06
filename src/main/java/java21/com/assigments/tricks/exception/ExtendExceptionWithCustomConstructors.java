/*
 * ExtendExceptionWithCustomConstructors.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.assigments.tricks.exception;

/**
 * @author nhqhien
 * @version $Revision: $
 */
public class ExtendExceptionWithCustomConstructors
{

}

class Danger extends RuntimeException
{
    public Danger(String message)
    {
        super();
    }


    public Danger(int value)
    {
        super((String)null);
    }
}


class Catastrophe extends Exception
{
    public Catastrophe(Throwable c) throws RuntimeException
    {
        super(new Exception());
        c.printStackTrace();
    }
}


class Emergency extends Danger
{
    // public Emergency() {}
    public Emergency(String message)
    {
        super(message);
    }
}

/*
 * Changes:
 * $Log: $
 */