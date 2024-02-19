/*
 * MethodOverrideWithMethodParamReferenceType.java
 *
 * Hien Ng
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
public class MethodOverrideAndOverloadInheritMethodWithMethodParamReferenceType
{
     public static void main(String[] args)
    {
        //Base on the type of caller to determine the overridden method will be called.
        Parent15 parent = new Parent15();
        Parent15 parent1 = new Child15();
        Child15 child1 = new Child15();
        
        parent.accept(parent);//accept Parent
        parent.accept(parent1);//accept Parent from Child
        parent.accept(child1);//accept Parent from Child
        
        parent1.accept(parent);//accept Parent from Child
        parent1.accept(parent1);//accept Parent from Child
        parent1.accept(child1);//accept Parent from Child
        
        // Input param will based on the type of ref
        child1.accept(parent);
        child1.accept(parent1);
        child1.accept(child1);//overload will be used here
    }
}

class Parent15{
    void accept(Parent15 p)
    {
        System.out.println("accept Parent");
    }
}

class Child15 extends Parent15{
    //Not override one
    void accept(Child15 p)
    {
        System.out.println("accept Child");
    }
    @Override
    void accept(Parent15 p)
    {
        System.out.println("accept Parent from Child");
    }
}

/*
 * Changes:
 * $Log: $
 */