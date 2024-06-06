/*
 * ProtectedAccessTrickiest.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.classusage;

import java21.com.assigments.tricks.oop.access_modifier.ClassWithProtectedMethod;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ProtectedAccessTrickiest extends ClassWithProtectedMethod
{
    public static void main(String[] args)
    {
        ProtectedAccessTrickiest subInstance = new ProtectedAccessTrickiest();
        subInstance.doTheTrick(subInstance);
    }
    
    public void doTheTrick(ClassWithProtectedMethod classWithProtectedMethod)
    {
        super.getName();//OK
        getName();//OK
        //classWithProtectedMethod.getName(); => Trickiest, can not access from there.
    }
    
    protected void getName()
    {
        System.out.println("ClassWithProtectedMethod Overriden");
    }
    
    
}


/*
 * Changes:
 * $Log: $
 */