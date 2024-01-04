/*
 * OverrideTrickiest.java
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
public class OverrideTrickiest
{

}


class MySuperclass
{

    public static String step2()
    {
        return "Hi";
    } 

}


class MyClass extends MySuperclass
{
    // private void step2() { } //can not override
    // private static void step2() { }  //can not hidden
    
    public static String step2() { 
        return "";
    }
}

/*
 * Changes:
 * $Log: $
 */