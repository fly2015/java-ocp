/*
 * GenericManipulateDataType.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.generic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class GenericManipulateDataType
{
    public static void main(String[] args)
    {
        List<Exception> exceptions = new ArrayList<>();
        exceptions.add(new Exception());
        exceptions.add(new RuntimeException());
        exceptions.add(new IOException());
        
        // *** We can not determine what exactly type in the upperBoundExceptions.
        // It perhaps a list of RuntimeException type that can not mix with a list of IOException
        List<? extends Exception> upperBoundExceptions = new ArrayList<>();
        Exception exception = upperBoundExceptions.get(0);
        //upperBoundExceptions.add(new Exception());
        //upperBoundExceptions.add(new RuntimeException());
        //upperBoundExceptions.add(new IOException());
        
        
        // *** We can determine ther Exception type in the lowerBoundExceptions is safe
        List<? super Exception> lowerBoundExceptions = new ArrayList<>();
        lowerBoundExceptions.add(new RuntimeException());
        lowerBoundExceptions.add(new IOException());
        lowerBoundExceptions.add(new Exception());
        Object exception2 = lowerBoundExceptions.get(0);
    }
}



/*
 * Changes:
 * $Log: $
 */