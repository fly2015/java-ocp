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
public class MethodOverrideWithMethodParamReferenceType
{
     public static void main(String[] args)
    {
        //Base on the type of caller to determine the overridden method will be called.
        Parent parent = new Parent();
        Parent parent1 = new Child();
        Child child1 = new Child();
        
        parent.accept(parent);
        parent.accept(parent1);
        parent.accept(child1);
        
        parent1.accept(parent);
        parent1.accept(parent1);
        parent1.accept(child1);
        
        // Input param will based on the type of ref
        child1.accept(parent);
        child1.accept(parent1);
        child1.accept(child1);//overload will be used here
    }
}

class Parent{
    void accept(Parent p)
    {
        System.out.println("accept Parent");
    }
}

class Child extends Parent{
    //Not override one
    void accept(Child p)
    {
        System.out.println("accept Child");
    }
    @Override
    void accept(Parent p)
    {
        System.out.println("accept Parent from Child");
    }
}

/*
 * Changes:
 * $Log: $
 */