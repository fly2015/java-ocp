/*
 * ParternMatchingDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.jse17.patern_matching;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ParternMatchingDemo
{
    public static void main(String[] args)
    {
        Integer x = 123;
        // Limitations of Subtype Enforcement -> Does not compile
        
        /*
         * if (x instanceof Integer data)
         * {
         * }
         */
         
        
        // compile
        if(x instanceof Integer) {}
        
        
        //
        printIntegersGreaterThan5(10);
        
        
    }
    

    static void compareIntegers(Number number)
    {
        if (number instanceof Integer data)
        {
            System.out.print(data.compareTo(5));
        }
    }
    
    
    static void printIntegersGreaterThan5(Number number)
    {
        if (number instanceof Integer data && data.compareTo(5) > 0)
            System.out.print(data);
    }
    

    /*
     * Since the input might not have inherited Integer, data is no longer in scope after the
if statement
     */
    void printIntegersOrNumbersGreaterThan5(Number number)
    {
        // DO NOT COMPILE
        //if (number instanceof Integer data || data.compareTo(5) > 0)
        //    System.out.print(data);
    }
    

    /*
     * It might surprise you to learn this code does compile. Eek! What is going on here? The
method returns if the input does not inherit Integer. This means that when the last line of
the method is reached, the input must inherit Integer, and therefore data stays in scope
even after the if statement ends.
     */
    void printOnlyIntegers(Number number)
    {
        if (!(number instanceof Integer data))
            return;
        System.out.print(data.intValue());
    }
}




/*
 * Changes:
 * $Log: $
 */