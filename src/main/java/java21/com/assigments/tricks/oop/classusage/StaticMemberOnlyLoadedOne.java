/*
 * StaticMemberOnlyLoadedOne.java
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
public class StaticMemberOnlyLoadedOne
{
    private static String name1 = "Static field is only loaded one";
    private static String name2;
    static
    {
        name2 = "Static block is only loaded one";
        System.out.println(name1);
        System.out.println(name2);
    }
    
    public static void main(String[] args)
    {
        new StaticMemberOnlyLoadedOne();// Load 1
        new StaticMemberOnlyLoadedOne();// Load 2
        new StaticMemberOnlyLoadedOne();// Load 3
        new StaticMemberOnlyLoadedOne();// Load 4
    }
}



/*
 * Changes:
 * $Log: $
 */