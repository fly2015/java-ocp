/*
 * CallingMethodNotOverrideFromOverrideOne.java
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
public class CallingMethodNotOverrideFromOverrideOne
{
    public static void main(String[] args)
    {
        var demo1 = new Demo1();
        demo1.printSomethingElse();//Demo1
        
        var demo = new Demo();
        demo.printSomethingElse();//Demo
        
        Demo demo2 = new Demo1();
        demo2.printSomethingElse();//Demo1
    }
}

class Demo{
    
    private void printSomething()
    {
        System.out.println(Demo.class.getCanonicalName());
    }
    
    public void printSomethingElse()
    {
        printSomething();
        System.out.println("Something Else Demo");
    }
}

class Demo1 extends Demo{
    
    private void printSomething()
    {
        System.out.println(Demo1.class.getCanonicalName());
    }
    
    public void printSomethingElse()
    {
        printSomething();
        System.out.println("Something Else Demo1");
    }
}


/*
 * Changes:
 * $Log: $
 */