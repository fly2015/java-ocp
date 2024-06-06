/*
 * AnonymousInnerClass.java
 *
 * Copyright by Hien Ng
 * Hien Ng
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.nested.inner;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class AnonymousInnerClass
{
    Inner inner = new Inner()
    {
        public void doIt()
        {
            System.out.println("Local access");
        }
    };
    
    public void doIt()
    {
        inner.doIt(); // Inner does not have doIt();
    }
    
    public static void main(String[] args)
    {
        new AnonymousInnerClass().doIt();
    }
}
class Inner
{
    public void doIt()
    {
        
    }
}


/*
 * Changes:
 * $Log: $
 */