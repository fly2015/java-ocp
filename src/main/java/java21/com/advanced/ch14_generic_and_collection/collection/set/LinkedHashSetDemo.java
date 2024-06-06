/*
 * LinkedHashSetDemo.java
 *
 * Da Nang, VN
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class LinkedHashSetDemo
{
    public static void main(String[] args)
    {
        Set<String> setStrings = new LinkedHashSet<>();
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