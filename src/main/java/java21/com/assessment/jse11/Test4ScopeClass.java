/*
 * TestScopeClass.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.assessment.jse11;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public abstract class Test4ScopeClass
{
    protected abstract void testScope();
    static final void test()
    {
        System.out.println(1 + "a");
    }
}



/*
 * Changes:
 * $Log: $
 */