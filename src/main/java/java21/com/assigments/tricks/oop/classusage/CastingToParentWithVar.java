/*
 * OrderOfClassInitialization.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.classusage;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
class Parent6
{
    
}


public class CastingToParentWithVar extends Parent
{
    public static void main(String[] args)
    {
        var x = (Parent) new CastingToParentWithVar();// OK since var can inference
        
        //CastingToParentWithVar x1 = (Parent) new CastingToParentWithVar(); // CAN NOT
  
    }
}



/*
 * Changes:
 * $Log: $
 */