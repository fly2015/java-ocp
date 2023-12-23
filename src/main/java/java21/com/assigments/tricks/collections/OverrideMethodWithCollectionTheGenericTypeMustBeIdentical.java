/*
 * OverrideMethodWithCollectionTheGenericTypeMustBeIdentical.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.collections;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class OverrideMethodWithCollectionTheGenericTypeMustBeIdentical
{
    public static <U extends Exception> void printException(U u)
    {
        System.out.println(u.getMessage());
    }
}



/*
 * Changes:
 * $Log: $
 */