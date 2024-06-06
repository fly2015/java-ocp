/*
 * CollectionDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.collection;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CollectionDemo
{
    public static void main(String[] args)
    {
        Map<Integer, Integer> map = Map.of(1,2,3,4);
        List.copyOf(map.entrySet());
    }
}



/*
 * Changes:
 * $Log: $
 */