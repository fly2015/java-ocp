/*
 * MethodOverload.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.foundation.method;

import java21.com.assigments.tricks.core.api.usage.oop.ComparableUsage;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class MethodOverload
{
    public static void main(String[] args)
    {
        // Object o = choose(991, "800"); // (1)
        // Number n1 = choose(991, 3.14); // (2)
        Number n2 = MethodOverload.<Double> choose((double)991, 3.14); // (3)
        //int k = (int)choose(1.3, 3.14); // (4) Can not cast to double
        int l = (int)(double)choose(1.3, 3.14); // (5)
        
        choose("800", "800");
        choose(800, 800);
        
        choose(new A(), new A());
    }

    
    public static <T extends Comparable<T>> T choose(T t1, T t2)
    {
        System.out.println("Generic compare");
        return t1.compareTo(t2) >= 0 ? t1 : t2;
    }
    
    public static Double choose(Double t1, Double t2)
    {
        System.out.println("Double compare");
        return t1.compareTo(t2) >= 0 ? t1 : t2;
    }
}

class A implements Comparable<A>
{

    /**
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(A o)
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
}

class B implements Comparable<B>
{

    /**
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(B o)
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
/*
 * Changes:
 * $Log: $
 */