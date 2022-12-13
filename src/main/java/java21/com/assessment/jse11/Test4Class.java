/*
 * Test4Class.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.assessment.jse11;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Test4Class
{
   private void test()
   {
       
   }
   Test4Class(int x)
   {
   }
   Test4Class()
   {
   }
}

class Test4Inherited extends Test4Class
{
    Test4Inherited(int x)
    {
        super(x);
        // TODO Auto-generated constructor stub
    }
    Test4Inherited(long x) 
    {
        
    }
    Test4Inherited()
    {
        
    }
    public static void test() throws Danger
    {
        
    }
    
    public static void main(String[] args)
    {
        test();
    }
}

class Danger extends RuntimeException {
public Danger(String message) {
super();
}
public Danger(int value) {
super((String) null);
}
}
class Catastrophe extends Exception {
public Catastrophe(Throwable c) throws
RuntimeException {
super(new Exception());
c.printStackTrace();
}
}
class Emergency extends Danger {
//public Emergency() {}
public Emergency(String message) {super(message);
}
}


/*
 * Changes:
 * $Log: $
 */