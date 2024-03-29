/*
 * StaticInnerClassDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch12_fundamentals.nesteds.statics;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class StaticInnerClassDemo
{
    private int x;
    private static int y;
    private static final int z = 20;
    private static class InnerDemo
    {
        public static int x = 10;
        public int getX()
        {
            return this.x;
        }
        
        public int getY()
        {
            return y;
        }
        
        public int getZ()
        {
            return z;
        }
        
        public static int getF()
        {
            return z;
        }
        
        public static StaticInnerClassDemo init()
        {
            return new StaticInnerClassDemo();
        }
    }
    
    public static void main(String[] args)
    {
        InnerDemo x = new InnerDemo();
        System.out.println(x.getX());

        System.out.println(StaticInnerClassDemo.InnerDemo.getF());
        
        StaticInnerClassDemo init = StaticInnerClassDemo.InnerDemo.init();
    }
}



/*
 * Changes:
 * $Log: $
 */