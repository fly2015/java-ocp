/*
 * EnumConstructorWithoutDeclareField.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.enums;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class EnumConstructorWithoutDeclareField
{

}

enum Enum
{
    A(1),
    B(2);
    
    private Enum(int i)
    {
        
    }
}

/*
 * Changes:
 * $Log: $
 */