/*
 * LocalClassAccessModifier.java
 *
 * Copyright by Hien Ng
 * Hien Ng
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.nested.local;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class LocalClassAccessModifier
{
    public static void main(String[] args)
    {
        // cannot public, static, private, protected, abstract
        Comparable<String> c = new Comparable<String>()
        {
            @Override
            public int compareTo(String o)
            {
                // TODO Auto-generated method stub
                return 0;
            }};
            
            // can have abstract, final
            // cannot public, static, private, protected
            final class Local
            {
                
            }
    }
    
    public void doIt()
    {
        // cannot public, static, private, protected
        Comparable<String> c = new Comparable<String>()
        {
            int x =0;
            @Override
            public int compareTo(String o)
            {
                // TODO Auto-generated method stub
                return 0;
            }};
       
       // can have abstract, final
       // cannot public, static, private, protected
       final class Local
       {
           
       }
    }
}



/*
 * Changes:
 * $Log: $
 */