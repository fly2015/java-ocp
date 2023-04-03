/*
 * InstanceOfDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.basic.ch9_advanced_class_design;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class InstanceOfDemo
{
    public static void main(String[] args)
    {
        X x1 = new A();
        X x2 = new B();
        
        
        check(x1);
        check(x2);
        
        C c = new C();
        if (c instanceof X)
        {
            System.out.println("C");
        }
    }
    
    public static void check(X x)
    {
        if (x instanceof A)
        {
            System.out.println("A");
        }
        else
        {
            System.out.println("B");
        }
    }
    
}

interface X
{
    
}

class A implements X
{
    
}

class B implements X
{
    
}


//final
class C
{
    
}



/*
 * Changes:
 * $Log: $
 */