/*
 * MapEntrySet.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.collections;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class MapEntrySet
{
    public static void main(String[] args)
    {
        var map = Map.of(1,2, 3, 6);
   
        List<Entry<Integer, Integer>> entry = List.copyOf(map.entrySet());
        var list = List.copyOf(map.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList()));
        list.replaceAll(x -> x * 2);
    }
}



/*
 * Changes:
 * $Log: $
 */