/*
 * AccessNestedClassFromOutsideClassFile.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.access_modifier;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class AccessNestedClassFromOutsideClassFile extends NestedNonPublic
{
    public static void main(String[] args)
    {
        final Diet diet = new NestedNonPublic().new Diet();
        diet.getFavoriteProtected();
    }
}



/*
 * Changes:
 * $Log: $
 */