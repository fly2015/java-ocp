/*
 * ChangeValueOfEnumInstance.java
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
public class ChangeValueOfEnumInstance
{
    public static void main(String[] args)
    {
        Type typeA = Type.A;
        System.out.println(typeA.getValue());
        typeA.setValue(10);
        System.out.println(typeA.getValue());
    }
}

enum Type
{
    A(1),
    B(2);
    
    private int value;
    Type(int v)
    {
        this.value = v;
    }
    
    public void setValue(int newValue)
    {
        this.value = newValue;
    }
    
    public int getValue()
    {
        return value;
    }
}

/*
 * Changes:
 * $Log: $
 */