/*
 * SpliteratorInteraction.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.functional;

import java.util.Spliterator;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SpliteratorInteraction
{
    public static void main(String[] args)
    {
        Spliterator<String> spliterator = Stream.of("A", "B", "C", "D").spliterator();
        
        Spliterator<String> batch = spliterator.trySplit();
        boolean hasOne = batch.tryAdvance(System.out::println); // A
        System.out.println(hasOne); //True
        batch.tryAdvance(System.out::println); //B
        
        spliterator.tryAdvance(System.out::println); // C
        hasOne = spliterator.tryAdvance(System.out::println); // D
        System.out.println(hasOne);// True
        hasOne = spliterator.tryAdvance(System.out::println); // Empty
        System.out.println(hasOne);// False
    }
}



/*
 * Changes:
 * $Log: $
 */