/*
 * B9ErasureOfGenericMethods.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.generic.doc;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class B9ErasureOfGenericMethods
{
    // Counts the number of occurrences of elem in anArray.
    //
    public static <T> int count(T[] anArray, T elem) {
        int cnt = 0;
        for (T e : anArray)
            if (e.equals(elem))
                ++cnt;
            return cnt;
    }
    
    // Because T is unbounded, the Java compiler replaces it with Object:
    public static int count1(Object[] anArray, Object elem)
    {
        int cnt = 0;
        for (Object e : anArray)
            if (e.equals(elem))
                ++cnt;
        return cnt;
    }
    
    // Suppose the following classes are defined:
    class Shape { /* ... */ }
    class Circle extends Shape { /* ... */ }
    class Rectangle extends Shape { /* ... */ }
    
    //You can write a generic method to draw different shapes:
    public static <T extends Shape> void draw(T shape) { /* ... */ }
    
    // => The Java compiler replaces T with Shape:
    public static void draw1(Shape shape) { /* ... */ }
}



/*
 * Changes:
 * $Log: $
 */