/*
 * MethodOverrideWithMethodParamReferenceType.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.overload;

import java.util.function.Predicate;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class MethodOverLoadTheInheritWithMethodParamReferenceType
{
    /*
     * For overloaded methods, the method to be executed is determined at compile time, 
     * depending on the type of the reference used to invoke the method, and the type of the actual parameters
     * 
     * 
     */
    public static void main(String[] args)
    {
       Child1 child1 = new Child1();
       System.out.println(child1.compareTo(child1));// call overloaded method
       
       Parent1 parent1 = new Child1();
       System.out.println(child1.compareTo(parent1));// call inherited method
       
       System.out.println(parent1.compareTo(parent1));
       
    }
}

class Parent1 implements Comparable<Parent1>{

    /**
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Parent1 o)
    {
        // TODO Auto-generated method stub
        return 1;
    }

}

class Child1 extends Parent1{
    String name = "Child1";
    public int compareTo(Child1 o)
    {
        // TODO Auto-generated method stub
        return 2;
    }

}

/*
 * Changes:
 * $Log: $
 */