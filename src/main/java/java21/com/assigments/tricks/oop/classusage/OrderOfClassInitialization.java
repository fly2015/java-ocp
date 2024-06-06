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
class Parent
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
}


public class OrderOfClassInitialization extends Parent
{
    private static String name ="children";
    static
    {
        sb.append("q");
    }
    {
        sb.append("m");
    }

    public static void main(String[] args)
    {
        //At most one ! => static of parent will be loaded first
        System.out.print(OrderOfClassInitialization.name + " ");//children
        System.out.print(OrderOfClassInitialization.sb + " ");//uq
        System.out.print(OrderOfClassInitialization.sb + " ");//uq
        Parent parent = new Parent();
        System.out.println(parent.sb);//uqcr
        parent = new Parent();
        System.out.println(parent.sb);//uqcr
        OrderOfClassInitialization orderOfClassInitialization = new OrderOfClassInitialization();
        System.out.println(orderOfClassInitialization.sb);//uqcrm
        System.out.print(OrderOfClassInitialization.sb);
    }
}



/*
 * Changes:
 * $Log: $
 */