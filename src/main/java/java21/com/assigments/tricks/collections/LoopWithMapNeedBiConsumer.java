/*
 * StreamWithEntrySet.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.collections;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class LoopWithMapNeedBiConsumer
{
    public static void main(String[] args)
    {
        Map.ofEntries(Map.entry(1, "1"), Map.entry(2, "2")).forEach((k, v) -> System.out.println(k + v));
        List.of(1, 2).forEach(v -> System.out.println(v));
    }
}



/*
 * Changes:
 * $Log: $
 */