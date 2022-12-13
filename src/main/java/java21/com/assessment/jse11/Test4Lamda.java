/*
 * Test4Lamda.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.assessment.jse11;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Test4Lamda
{
    public static void main(String[] args)
    {
        Function<Double, String> function = (e) -> "String ehe";
        System.out.println(function.apply(1.0));
        
        Comparator<Boolean> comparator = (var x, var y) -> x.compareTo(y);
        System.out.println(comparator.compare(true, false));
        
        BinaryOperator<Integer> bi = (i1, i2) -> {return i1 + i2;};
        System.out.println(bi.apply(1, 1));
    }
}



/*
 * Changes:
 * $Log: $
 */