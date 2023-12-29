/*
 * AndThen.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.functional.lamdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class AndThen
{
    public static void main(String[] args)
    {
        Consumer<String> s1 = System.out::println;
        s1.andThen(s1);
        
        Function<String, String> f = (s) -> s + s;
        f.andThen(f);
        
        Predicate<String> p = s3 -> s3.isEmpty();
        p.and(p);
        
        
        
    }
  
}


abstract interface a{}
/*
 * Changes:
 * $Log: $
 */