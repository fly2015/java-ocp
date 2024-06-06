/*
 * AccessNestedClassFromOutsidePakage.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.nested.inner;

import java21.com.assigments.tricks.oop.access_modifier.NestedNonPublic;
import java21.com.assigments.tricks.oop.access_modifier.NestedNonPublic.Diet2;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class AccessNestedClassFromOutsidePakage extends NestedNonPublic
{
    public static void main(String[] args)
    {
        final Diet1 access1 = new NestedNonPublic(). new Diet1();//need public constructor of Diet1
        final Diet2 access2 = new NestedNonPublic(). new Diet2();
    }
}



/*
 * Changes:
 * $Log: $
 */