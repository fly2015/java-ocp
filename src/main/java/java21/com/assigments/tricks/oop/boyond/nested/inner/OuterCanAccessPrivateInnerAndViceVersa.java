/*
 * OuterCanAccessPrivateInnerAndViceVersa.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.nested.inner;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class OuterCanAccessPrivateInnerAndViceVersa
{
    public static void main(String[] args)
    {
        new Outer().getInnerName();
    }
}

class Outer
{
    private String name = "Outer";
    private class Inner{
        private String name = "Inner";
    }
    
    public void getInnerName()
    {
        Inner inner = new Outer().new Inner();
        System.out.println(inner.name);
        Outer outer = new Outer();
        System.out.println(outer.name);
    }
}

/*
 * Changes:
 * $Log: $
 */