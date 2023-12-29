/*
 * CallSuperDefaultMethod.java
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
public class CallSuperDefaultMethod
{
    public static void main(String[] args)
    {
      A a =  new X();
      a.manipulate();
    }
}

class X implements A, B
{
    @Override
    public void manipulate()
    {
        System.out.println("Manipulate instance X");
        A.super.manipulate();
        B.super.manipulate();
    }
    
}

interface A
{
    default void manipulate()
    {
        System.out.println("Manipulate A");
    }
}


interface B
{
    default void manipulate()
    {
        System.out.println("Manipulate B");
    }
}

/*
 * Changes:
 * $Log: $
 */