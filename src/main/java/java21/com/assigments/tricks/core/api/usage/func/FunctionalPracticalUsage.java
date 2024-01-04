/*
 * PracticalUsage.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.api.usage.func;

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
public class FunctionalPracticalUsage
{
    public static void main(String[] args)
    {
        Stream.of("1", "2", "3", "4", "5").sorted().distinct().collect(Collectors.partitioningBy(x -> x != null));
        IntStream insIntStream = IntStream.of(1,2);
        final Stream<Integer> boxed = insIntStream.boxed();
        final DoubleStream mapToDouble = boxed.mapToDouble(x -> x);
        //final DoubleStream mapToDouble2 = insIntStream.mapToDouble(x -> x);
        final IntStream mapToInt = mapToDouble.mapToInt(x -> (int)x);
        
        //var s = DoubleStream.of(1.2, 2.4);
        //s.peek(System.out::println).filter(x -> x> 2).count();
        
        final Stream<Integer> mapToObj = IntStream.range(1, 6).mapToObj(i -> i);
        
        var stream = Stream.iterate("", (s) -> s + "1");
        stream.limit(2).map(x -> x + "2").forEach(System.out::println);
        
        Stream.iterate(1, x -> x++).limit(5).forEach(System.out::print);//11111
    }
}



/*
 * Changes:
 * $Log: $
 */