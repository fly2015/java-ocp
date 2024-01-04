/*
 * InheritProtectedInDiffPakage.java
 *
 * Copyright by Da Nang, Viet Nam
 * Hien Ng
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.inheritance;

import java.io.Serializable;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class InheritProtectedInDiffPackage extends InheritProtected
{
    public static void main(String[] args)
    {
        final InheritProtected myClass1 = new InheritProtected();
        //myClass1.value = 1; // This will not compile
        // because X does not own MyClass's value.
        
        new InheritProtectedInDiffPackage().value = 1; // This will compile fine
        // because X inherits value.
    }
    
   
}


   
    // in different package



/*
 * Changes:
 * $Log: $
 */