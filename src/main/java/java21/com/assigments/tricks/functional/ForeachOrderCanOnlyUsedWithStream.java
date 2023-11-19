/*
 * ForeachOrderCanOnlyUsedWithStream.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.functional;

import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ForeachOrderCanOnlyUsedWithStream
{
    public static void main(String[] args)
    {
        List.of(1, 2, 3, 4).stream().forEachOrdered(System.out::println);;
        //List.of(1, 2, 3, 4).forEachOrdered(System.out::println); //COMPILATION ERROR
    }
}



/*
 * Changes:
 * $Log: $
 */