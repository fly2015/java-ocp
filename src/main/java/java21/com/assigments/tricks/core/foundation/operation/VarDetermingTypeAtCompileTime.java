/*
 * VarDetermingTypeAtCompileTime.java
 *
 * Copyright by Da Nang, Viet Nam
 * Hien Ng
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.foundation.operation;

/**
 * @author nhqhien
 * @version $Revision: $
 */
public class VarDetermingTypeAtCompileTime
{

}


class BubbleException extends Exception
{
}


abstract class Fish
{
    Fish getFish()
    {
        throw new RuntimeException("fish!");
    }
}


final class Clownfish extends Fish
{
    final Clownfish getFish() // throws BubbleException
    {
        throw new RuntimeException("clown!");
    }


    public static void main(String[] bubbles) throws Exception
    {
        final var v = (Fish)new Clownfish();
        
        // v was a Fish
        
        Clownfish f = (Clownfish)v; //NOTICED HERE
        f.getFish();
        System.out.println("swim!");
    }
}

/*
 * Changes:
 * $Log: $
 */