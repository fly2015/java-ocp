/*
 * InstanceOfCannotShowCompilationErrWhenCheckInterface.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.classusage;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class InstanceOfCannotShowCompilationErrWhenCheckInterface
{
    public static void main(String[] args)
    {
        Child4 child4 = new Child4();
        if (!(child4 instanceof IParent))// COMPILATION OK
        {    
            System.out.println("Child4 is not a IParent");
        }
        
       // if (!(child4 instanceof Parent3)) {} // COMPILATION ERROR
    }
}

interface IParent
{
    
}

class Parent3
{
    
}

class Child4
{
    
}
/*
 * Changes:
 * $Log: $
 */