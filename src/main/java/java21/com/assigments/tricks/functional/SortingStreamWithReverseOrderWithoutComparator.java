/*
 * SortingStreamWithReverseOrderWithoutComparator.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.functional;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SortingStreamWithReverseOrderWithoutComparator
{
    public static void main(String[] args)
    {
        Stream<String> sorted = Stream.of("1", "2", "3", "4", "5").sorted(Comparator.comparing(String::length).thenComparing(s -> s.charAt(0)).reversed().thenComparing(String::length));
        System.out.println(sorted);
        Stream<String> sorted1 = Stream.of("1", "2", "3", "4", "5").sorted(Comparator.reverseOrder());
        
       // sorted1.filter(n -> n.startsWith("t")).sorted(Comparator::reverseOrder).findFirst().ifPresent(System.out::println);// COMPILCATION ERROR
    }
}



/*
 * Changes:
 * $Log: $
 */