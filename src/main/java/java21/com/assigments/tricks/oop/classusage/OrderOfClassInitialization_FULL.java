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
class Parent5
{
    static StringBuilder sb = new StringBuilder();
    
    {
        sb.append("c");
    }
    static
    {
        sb.append("u");
        System.out.println("At most one !");
    }
    {
        sb.append("r");
    }
    
    Parent5()
    {
        sb.append("x");
    }
}


public class OrderOfClassInitialization_FULL extends Parent
{
    private static String name ="children";
    static
    {
        sb.append("q");
    }
    {
        sb.append("m");
    }
    
    OrderOfClassInitialization_FULL()
    {
        sb.append("y");
    }
    public static void main(String[] args)
    {
        //At most one ! => static of parent will be loaded first
        System.out.print(OrderOfClassInitialization_FULL.name + " ");//children
        System.out.print(OrderOfClassInitialization_FULL.sb + " ");//uq
        System.out.print(OrderOfClassInitialization_FULL.sb + " ");//uq

        OrderOfClassInitialization_FULL orderOfClassInitialization = new OrderOfClassInitialization_FULL();
        System.out.println(orderOfClassInitialization.sb);//uqcrxmy
  
    }
}



/*
 * Changes:
 * $Log: $
 */