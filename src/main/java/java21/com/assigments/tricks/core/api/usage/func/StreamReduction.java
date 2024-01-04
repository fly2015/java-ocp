/*
 * StreamReduction.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.api.usage.func;

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
        reduce(list);
        collect(list);
    }


    private static void collect(List<Student> list)
    {
        final StudentSummary collect = list.stream().collect(Collectors.teeing(Collectors.counting(), Collectors.summingInt(s -> s.mark()), (c, m) -> new StudentSummary(c.intValue(), m)));
        System.out.println(collect);
    }

    private static void reduce(final List<Student> list)
    {
        list.stream().reduce((s1, s2) -> {
            if (s1.mark() - s2.mark() >= 0)
            {
                return s1;
            }
            else
            {
                return s2;
            } 
        }).ifPresent(System.out::println);
        
        
        final Student student = list.stream().reduce(new Student("A", 9), (s1, s2) -> {
            if (s1.name().equals(s2.name()))
            {
                return s2;
            }
            else
            {
                return s1;
            }
        });
        
        System.out.println(student);
        
        final Integer mark = list.stream().reduce(0, (i, s) -> i + s.mark(), (m1, m2) -> m1 + m2);
        System.out.println(mark);
    }
}



/*
 * Changes:
 * $Log: $
 */