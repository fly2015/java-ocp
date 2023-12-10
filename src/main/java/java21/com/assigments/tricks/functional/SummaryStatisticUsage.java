/*
 * SummaryStatisticUsage.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.functional;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SummaryStatisticUsage
{
    public static void main(String[] args)
    {
        IntSummaryStatistics summaryStatistics = IntStream.of(1, 2, 3).summaryStatistics();
        System.out.println(summaryStatistics);
        
        OptionalDouble average = IntStream.of(1, 2, 3).average();
        OptionalInt max = IntStream.of(1, 2, 3).max();
    }
}



/*
 * Changes:
 * $Log: $
 */