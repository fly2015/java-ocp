/*
 * Instance_of_a_class_is_also_an_instance_its_superclasses.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Instance_of_a_class_is_also_an_instance_its_superclasses
{
    public static void main(String[] args)
    {
        // B vs D norelation
        B obj = new B();
        if (obj instanceof A && !(obj instanceof C))
        {
            
        }
        
        
        //A vs D has relation
        A obj1 = new B();
        D b = (D)obj1;// class cast exception
    }
    
}

class A {}
class B extends A {}
class C extends B {}
class D extends A {}

/*
 * Changes:
 * $Log: $
 */