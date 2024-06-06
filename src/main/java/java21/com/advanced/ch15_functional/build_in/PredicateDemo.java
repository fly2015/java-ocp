/*
 * PredicateDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch15_functional.build_in;

import java.util.function.Predicate;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PredicateDemo
{
    public static void main(String[] args)
    {
        Predicate<String> pre0 = (s) -> !s.equals("");
        Predicate<String> pre1 = s -> s.length() > 2;
        Predicate<String> pre2 = (s) -> {return !s.equals("");};
        
        //
        Predicate<String> preAnd = pre0.and(pre1);
        System.out.println(preAnd.test(""));
        
        //
        Predicate<String> pre4 = Predicate.isEqual("AB");
        System.out.println(pre4.equals("AB"));
        
        
    }
}



/*
 * Changes:
 * $Log: $
 */