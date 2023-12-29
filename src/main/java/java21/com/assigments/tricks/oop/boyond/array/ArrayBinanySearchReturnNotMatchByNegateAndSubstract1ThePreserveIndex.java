/*
 * ArrayBinanySearchReturnNotMatchByNegateAndSubstract1ThePreserveIndex.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.array;

import java.util.Arrays;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ArrayBinanySearchReturnNotMatchByNegateAndSubstract1ThePreserveIndex
{
    public static void main(String[] args)
    {
        String strs1 [] = {"a", "1", "b"};
        Arrays.sort(strs1);
        System.out.println(Arrays.binarySearch(strs1, "c"));//  -4, c should be at index 3
    }
}



/*
 * Changes:
 * $Log: $
 */