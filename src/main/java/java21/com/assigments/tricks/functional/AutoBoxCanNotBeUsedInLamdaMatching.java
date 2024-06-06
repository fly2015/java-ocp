/*
 * AutoBoxCanNotBeUsedInLamdaMatching.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.functional;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class AutoBoxCanNotBeUsedInLamdaMatching
{
    public static void main(String[] args)
    {
        Stream<Integer> boxed = IntStream.of(1, 2, 3, 4).boxed();
        IntStream mapToInt = boxed.mapToInt(x -> x.intValue());
    }
}



/*
 * Changes:
 * $Log: $
 */