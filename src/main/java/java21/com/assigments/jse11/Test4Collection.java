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
        map.merge(1, 3, (a,b) -> a + b); //1-13
        map.merge(3, 3, (a,b) -> null);// 3-null
        map.merge(4, 3, (a,b) -> null);//4-3
        System.out.println(map);//{1=13, 2=20, 3=3, 4=3}

        List.of();
    }
}



/*
 * Changes:
 * $Log: $
 */