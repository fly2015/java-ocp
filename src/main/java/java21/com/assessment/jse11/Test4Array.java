/*
 * Test4Array.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.assessment.jse11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Test4Array
{
    public static void main(String[] args)
    {
        int arrs [][] = new int [5][];
        int arrs1 [] = new int [1];
        
        ArrayList list = new ArrayList<>();
        for(var s : list ) System.out.print(s);
        
        
        String[] s1 = { "Camel", "Peacock", "Llama"};
        String[] s2 = { "Camel", "Llama", "Peacock"};
        System.out.println("Compare: " + Arrays.compare(s1, s2));
        
        System.out.println("P".compareTo("L"));
    }
}



/*
 * Changes:
 * $Log: $
 */