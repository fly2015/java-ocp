/*
 * SortedSetDemo.java
 *
 * Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SortedSetDemo
{
    public static void main(String[] args)
    {
        SortedSet<String> setStrings = new TreeSet<>();
        setStrings.add("b");
        setStrings.add("c");
        setStrings.add("1");
        //setStrings.add(null);
        for (int i = 0; i < 10; i++)
        {
            System.out.println(setStrings.toString());
        }
        
    }
}



/*
 * Changes:
 * $Log: $
 */