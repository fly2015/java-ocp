/*
 * ArrayCompareTheFirstDifferentItem.java
 *
 * Copyright by Hien Ng
 * Da Nang
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
public class ArrayCompareTheFirstDifferentItem
{
    public static void main(String[] args)
    {
        String[] s1 = { "Camel", "Peacock", "Llama", ""};
        String[] s2 = { "Camel", "Llama", "Peacock"};
        System.out.println("Compare: " + Arrays.compare(s1, s2)); //compare Peacock and Llama
        System.out.println("P".compareTo("L"));//4
        
        String[] s3 = { "Camel", "Llama", ""};
        String[] s4 = { "Camel", "Llama"};
        System.out.println(Arrays.compare(s3, s4));// postitive
        
    }
}



/*
 * Changes:
 * $Log: $
 */