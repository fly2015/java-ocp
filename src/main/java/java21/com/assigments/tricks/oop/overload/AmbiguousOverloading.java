/*
 * AmbigousOverload.java
 *
 * Copyright by Hien Ng
 * Hien Ng
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.overload;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class AmbiguousOverloading
{
    static void doIt(Integer in, Number str)
    {
        
    }
    
    static void doIt(Number in, Integer str)
    {
        
    }
    
    public static void main(String[] args)
    {
        final Integer int1 = Integer.valueOf(1);
        //The method doIt(Integer, Number) is ambiguous for the type AmbiguousOverloading
        //doIt(int1, int1); 
    }
}



/*
 * Changes:
 * $Log: $
 */