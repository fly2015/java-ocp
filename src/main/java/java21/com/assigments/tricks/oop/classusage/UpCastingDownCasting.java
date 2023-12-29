/*
 * UpCastingDownCasting.java
 *
 * Hien Ng
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
public class UpCastingDownCasting
{
    public static void main(String[] args)
    {
        Parent7 p = new Children7();//Up casting
        Children7 c = (Children7)p; //Down casting
        IParent7 ip = (IParent7)c; //ClassCastException
        //Parent8 p8 = (Parent8)c; can not do this
    }
}

class Parent7 
{
    Parent7()
    {
        var x = 1;
    }
}

class Children7 extends Parent7
{
    
}

interface IParent7
{
    
}

class Parent8 
{
    
}

/*
 * Changes:
 * $Log: $
 */