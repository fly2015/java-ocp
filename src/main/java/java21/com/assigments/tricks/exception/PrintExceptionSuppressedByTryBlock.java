/*
 * TryWithResourceDemoTrick.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.assigments.tricks.exception;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PrintExceptionSuppressedByTryBlock
{
    public static void main(String[] args) 
    {
       try(A a = new A())
       {
           
       }
       catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
    
    static class A implements AutoCloseable
    {
        /**
         * @see java.lang.AutoCloseable#close()
         */
        @Override
        public void close() throws Exception
        {
            System.out.println("A");
            throw new RuntimeException("Test Suppressed");
        }
        
    }

}

/*
 * Changes:
 * $Log: $
 */