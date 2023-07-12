/*
 * ExceptionTricks.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.basic.chr10_exception;

import java.io.FileNotFoundException;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
abstract class ExceptionTricks
{
    abstract Number doSomething() throws Exception;
}

class Children extends ExceptionTricks
{

    /**
     * @see java21.com.basic.chr10_exception.ExceptionTricks#doSomething()
     */
    @Override
    public Integer doSomething() throws FileNotFoundException
    {
        return null;
        
    }
    
    
    // Override rules for child class:
    // access modifiers can be identical or broader
    // Return type must be identical or sub type(covariant)
    // Exception must be identical or narrower
}

/*
 * Changes:
 * $Log: $
 */