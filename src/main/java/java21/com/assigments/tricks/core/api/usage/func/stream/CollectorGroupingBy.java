/*
 * CollectorGroupingBy.java
 *
 * Copyright by Da Nang, Viet Nam
 * Hien Ng
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.api.usage.func.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CollectorGroupingBy
{
    public static void main(String[] args)
    {
        final Map<String, Long> count1 = Stream.of("A", "B123", "CC").collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        final Map<String, Long> count2 = Stream.of("A", "B123", "CC").collect(Collectors.groupingBy(s-> s, Collectors.counting()));
        final Map<String, List<String>> collect = Stream.of("A", "B123", "CC").collect(Collectors.groupingBy(s-> s));
    }
}



/*
 * Changes:
 * $Log: $
 */