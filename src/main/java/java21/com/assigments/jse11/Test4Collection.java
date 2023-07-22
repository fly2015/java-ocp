/*
 * Test4Collection.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.assigments.jse11;

import java.util.HashMap;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Test4Collection
{
    public static void main(String[] args)
    {
        var map = new HashMap<Integer, Integer>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);
        map.merge(1, 3, (a,b) -> a + b);
        map.merge(3, 3, (a,b) -> null);
        map.merge(4, 3, (a,b) -> null);
        System.out.println(map);
        
        
        
        List.of();
    }
}



/*
 * Changes:
 * $Log: $
 */