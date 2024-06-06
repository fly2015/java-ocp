/*
 * MaxMethodWithANormalStream.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.functional;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class MaxMethodWithANormalStream
{
    public static void main(String[] args)
    {
        Comparator<String> cp = (s1, s2) -> s1.compareTo(s2);
        String max = Stream.of("1", "2", "3").max(cp).orElse("empty");
        System.out.println(max);
        
        String max1 = Stream.of("1", "2", "3").max(Comparator.naturalOrder()).orElse("empty");
    }
}



/*
 * Changes:
 * $Log: $
 */