/*
 * SameDeclaredParamOnSuperAnSubBaseOnTheReferenceType.java
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
public class SameDeclaredParamOnSuperAnSubBaseOnTheReferenceType
{
    public static void main(String[] args)
    {
        Parent1 parent1 = new Child1();
        System.out.println(parent1.name); //Parent1
        Child1 child1 = new Child1();
        System.out.println(child1.name); //Child1
        
        parent1.getName();//Child1
        child1.getName();//Child1
        
        Parent1 parent2 = new Parent1();
        parent2.getName();//Parent1
    }
}

class Parent1
{
    String name = "Parent1";
    
    public void getName()
    {
        System.out.println(this.name);
    }
}

class Child1 extends Parent1
{
    String name = "Child1";
    public void getName()
    {
        System.out.println(this.name);
    }
}


/*
 * Changes:
 * $Log: $
 */