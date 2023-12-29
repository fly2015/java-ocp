/*
 * LocalClassOnlyAccessEffectiveFinalParam.java
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
public class LocalClassOnlyAccessEffectiveFinalParam
{
    public static void main(String[] args)
    {
        int x = 0;
        final int y = 1;
        class A 
        {
            void printST()
            {
                System.out.println(x);
            }
        }
        
        
        
        var z = new X()
        {
            
            @Override
            public void doSt()
            {
                System.out.println(x);
                
            }
        };
      //x = 1;//compilation error
    }
    
    interface X
    {
        void doSt();
    }
}



/*
 * Changes:
 * $Log: $
 */