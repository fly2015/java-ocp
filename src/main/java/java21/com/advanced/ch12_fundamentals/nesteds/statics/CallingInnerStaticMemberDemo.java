/*
 * CallingInnerStaticMemberDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch12_fundamentals.nesteds.statics;

import java21.com.advanced.ch12_fundamentals.nesteds.statics.StaticNestedInterfaces.ClassDemo;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CallingInnerStaticMemberDemo
{
    public static void main(String[] args)
    {
        ClassDemo classDemo = new StaticNestedInterfaces.ClassDemo();
        ClassDemo classDemo2 = new ClassDemo(); 
    }
}



/*
 * Changes:
 * $Log: $
 */