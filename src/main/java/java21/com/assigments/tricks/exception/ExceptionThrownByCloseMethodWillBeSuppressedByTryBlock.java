/*
 * TryWithResourceDemoTrick.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.assigments.tricks.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ExceptionThrownByCloseMethodWillBeSuppressedByTryBlock
{
    public static void main(String[] args) 
    {
       try(A a = new A())
       {
           
       }
    }
    
    static class A implements AutoCloseable
    {
        /**
         * @see java.lang.AutoCloseable#close()
         */
        @Override
        public void close()
        {
            System.out.println("A");
            throw new RuntimeException("Test"); // Will be suppressed
        }
        
    }

}

/*
 * Changes:
 * $Log: $
 */