/*
 * CovariantOverrideReturn.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.override;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CovariantOverrideReturn
{
    public static void main(String[] args)
    {
        Parent2 child2 = new Child2();
        System.out.println(child2.getNumber()); //20
    }
}

class Parent2
{
    Number getNumber()
    {
        return 10;
    }
}

class Child2 extends Parent2
{
    Integer getNumber()
    {
        return 20;
    }
}


/*
 * Changes:
 * $Log: $
 */