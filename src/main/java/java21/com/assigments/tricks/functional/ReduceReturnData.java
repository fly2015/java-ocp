/*
 * ReduceReturnData.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.functional;

import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ReduceReturnData
{
    public static void main(String[] args)
    {
        System.out.println(Stream.of("1", "2", "3").reduce("", (s1, s2) -> s1 + s2));//123
        System.out.println(Stream.of("1", "2", "3").reduce(0, (l1, l2) -> l1 + l2.length(), (s1, s2) -> s1 + s2));//3
    }
}



/*
 * Changes:
 * $Log: $
 */