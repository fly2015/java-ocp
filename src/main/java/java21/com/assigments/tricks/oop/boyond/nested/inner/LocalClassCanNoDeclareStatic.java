/*
 * LocalClassCanNoDeclareStatic.java
 *
 * Copyright by Da Nang, Viet Nam
 * Hien Ng
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.nested.inner;

import java.io.Serializable;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class LocalClassCanNoDeclareStatic
{
    private static int i;
    private int x;
    
    static class NestedClass
    {
        private int privateInnerParam = 0;
        public void getX()
        {
            System.out.println(i);// can access X
        }
    }
    
    public void test()
    {
        // can not mark with static
        // can implements multiple inf
        class LocalClass implements  Serializable, Runnable 
        {
            void getX()
            {
                x = 1;
                System.out.println(x);// can access X
            }

            /**
             * @see java.lang.Runnable#run()
             */
            @Override
            public void run()
            {
                // TODO Auto-generated method stub
                
            }
        }
        
        new LocalClass().getX();
        System.out.println(x);
    }
    
    public static void main(String[] args)
    {
        new LocalClassCanNoDeclareStatic().test();
        class LocalClass // can not mark with static
        {
            void getI()
            {
                System.out.println(i);// can access i
            }
        }
        
        // Access private member nested
        final LocalClassCanNoDeclareStatic.NestedClass nestedClass = new LocalClassCanNoDeclareStatic.NestedClass();
        System.out.println(nestedClass.privateInnerParam);
        
    }
}



/*
 * Changes:
 * $Log: $
 */