/*
 * ParallelReduction.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.functional.parallel;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ParallelReduction
{
    public static void main(String[] args)
    {
        //source is unordered
        //stream is parallel
        //collector must be concurrent
        
        Set<String> set = new HashSet<>();
        for (int i = 0; i <= 100000; i++)
        {
            set.add(i + "");
        }
        
        ConcurrentMap<Integer, List<String>> collect = set.parallelStream().peek(s1 -> {
            System.out.println(Thread.currentThread().getName());
        }).collect(Collectors.groupingByConcurrent(String::length));
        
        System.out.println(collect.size());
    }
}



/*
 * Changes:
 * $Log: $
 */