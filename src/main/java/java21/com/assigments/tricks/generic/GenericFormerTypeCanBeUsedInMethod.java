/*
 * GenericFormerTypeCanBeUsedInMethod.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.generic;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class GenericFormerTypeCanBeUsedInMethod
{
    public static void main(String[] args)
    {
        Container<String> container = new Container<>();
        container.setT("String Item");
        System.out.println(container.getT());
    }
}

class Container<T>
{
    private T t;
    public void setT(T t)
    {
        this.t = t;
    }
    
    public T getT()
    {
        return this.t;
    }
}

/*
 * Changes:
 * $Log: $
 */