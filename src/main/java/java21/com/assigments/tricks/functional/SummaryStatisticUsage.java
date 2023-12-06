/*
 * SummaryStatisticUsage.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.functional;

import java.util.IntSummaryStatistics;
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
    }
}



/*
 * Changes:
 * $Log: $
 */