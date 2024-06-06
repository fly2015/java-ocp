/*
 * InheritProtected.java
 *
 * Copyright by Da Nang, Viet Nam
 * Hien Ng
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.inheritance;

/**
 * @author nhqhien
 * @version $Revision: $
 */
public class InheritProtected
{
    protected int value = 10;
}




class X extends InheritProtected
{
    public void getValue()
    {
        int i = super.value;
        final InheritProtected myClass1 = new InheritProtected();
        final int value2 = myClass1.value;
    }


    public static void main(String[] args)
    {
        final InheritProtected myClass1 = new InheritProtected();
        myClass1.value = 1; // This will not compile
        // because X does not own MyClass's value.
System.out.println(myClass1.value);
        int a1 = new X().value; // This will compile fine
        // because X inherits value.
    }
    // in different package

}

/*
 * Changes:
 * $Log: $
 */