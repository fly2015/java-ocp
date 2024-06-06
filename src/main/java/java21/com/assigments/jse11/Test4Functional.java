/*
 * Test4Functional.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.assigments.jse11;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Test4Functional
{
    public static void main(String[] args)
    {
        //var stream = Stream.iterate("", (s) -> s + "1");
        //stream.limit(2).map(x -> x + "2").forEach(System.out::println);

        LongStream of = LongStream.of(6L, 8L, 10L);
        IntStream mapToInt = of.mapToInt(x -> (int)x);
        Stream<Integer> boxed = mapToInt.boxed();
        Map<Integer, List<Integer>> collect = boxed.collect(Collectors.groupingBy(x -> x));
        Set<Integer> keySet = collect.keySet();
        Stream<Integer> stream2 = keySet.stream();
        double result = stream2.collect(Collectors.averagingInt(x -> x));

        LongStream of2 = LongStream.of(6L, 8L, 10L);
        IntStream mapToInt2 = of2.mapToInt(x -> (int)x);
        Stream<Integer> boxed2 = mapToInt2.boxed();
        Map<Integer, Set<Integer>> collect2 = boxed2.collect(Collectors.groupingBy(x -> x, Collectors.toSet()));
        Set<Integer> keySet2 = collect2.keySet();
        Stream<Integer> stream3 = keySet2.stream();
        Collector<Integer, ? , Double> averagingInt = Collectors.averagingInt(x -> x);
        double result4 = stream3.collect(averagingInt);
       
       // System.out.println(List.of(1, 2, 3).stream().collect(Collectors.averagingInt(x -> x)));
        
        
        var stream = LongStream.of(1, 2, 3);
        var opt = stream.map(n -> n * 10).filter(n -> n < 5).findFirst();
        
        
        Map<Boolean, Set<String>> collect3 = List.of("1", "2").stream().collect(Collectors.partitioningBy(x -> x.length() > 0, Collectors.toSet()));
        
        
        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();
       
         var result1 = Stream.generate(() -> "")
        .limit(10)
        .filter(notEmpty)
        .collect(Collectors.groupingBy(k -> k))
        .entrySet()
         .stream()
        .map(Entry::getValue)
         .flatMap(Collection::stream)
         .collect(Collectors.partitioningBy(notEmpty));
         
        System.out.println(result1);
        
        
        List<Integer> of3 = List.of(1, 2, 3);
        List<Integer> of4 = List.of(4, 5, 6);
        
        List<List<Integer>> list = List.of(of3, of4);
        
        Stream<Integer> flatMap = list.stream().flatMap(li -> Stream.of(li.get(0)));
   }
}



/*
 * Changes:
 * $Log: $
 */