/*
 * CollectorTeeingUsage.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.functional.buildin;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CollectorTeeingUsage
{
    public static void main(String[] args)
    {
        Double reduce1 = Stream.of(new Student(1, 10), new Student(2, 20)).reduce(0.0, (initial, s) -> initial + s.score(), (c1, c2) -> c1 + c2);
        System.out.println(reduce1);
        
        StudentSummary collect1 = Stream.of(new Student(1, 10), new Student(2, 20)).collect(Collectors.teeing(Collectors.counting(), Collectors.summingDouble(s -> s.score()), (c,s) -> {return new StudentSummary(c, s);}));
        System.out.println(collect1);
    }

}

record Student(int id, double score) {};
record StudentSummary(Long count, double scoreTotal) {};
/*
 * Changes:
 * $Log: $
 */