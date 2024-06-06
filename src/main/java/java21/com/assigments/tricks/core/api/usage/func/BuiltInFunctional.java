/*
 * BuiltInFunctional.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.api.usage.func;

import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class BuiltInFunctional
{
    public static void main(String[] args)
    {
        // IntFunction: return R, input int
        IntFunction<String> intFunction = i -> i + "";
        System.out.println(intFunction.apply(0));
        
        // ToIntFunction: retur int, input R
        ToIntFunction<String> toIntFunction = s -> Integer.parseInt(s);
        System.out.println(toIntFunction.applyAsInt("1"));
        
        // ToIntBiFunction
        ToIntBiFunction<String, Integer> toIntBiFunction = (s, i) -> Integer.parseInt(s) + i;
        System.out.println(toIntBiFunction.applyAsInt("1", 2));
        
        //
        IntUnaryOperator intUnaryOperator = n -> n + 1;
        System.out.println(intUnaryOperator.applyAsInt(1));
        
        IntBinaryOperator intBinaryOperator = (n1, n2) -> n1 + n2;
        System.out.println(intBinaryOperator.applyAsInt(1,2));
        
        ObjIntConsumer<String> objIntConsumer = (s, n) -> System.out.println(s + n);
        objIntConsumer.accept("1", 0);
    }
}



/*
 * Changes:
 * $Log: $
 */