/*
 * StreamReduction.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.api.usage.func.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class StreamReduction
{
    record Student(String name, int mark) {}
    record StudentSummary(int count, int total) {}
    
    public static void main(String[] args)
    {
        final List<Student> list = List.of(new Student("A", 9), new Student("B", 10), new Student("C", 20), new Student("D", 20));
        
        final StudentSummary collect = list.stream().collect(Collectors.teeing(Collectors.counting(), Collectors.summingInt(s -> s.mark()), (c, m) -> new StudentSummary(c.intValue(), m)));
        System.out.println(collect);
        
        final Integer mark = list.stream().reduce(0, (i, s) -> i + s.mark(), (m1, m2) -> m1 + m2);
        System.out.println(mark);
    }
}



/*
 * Changes:
 * $Log: $
 */