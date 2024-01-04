/*
 * BasicInitialization.java
 *
 * Copyright by Hien Ng
 * Hien Ng
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.classusage;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class BasicInitialization
{
    int doIt() {
        return 0;
    }
    public static void main(String[] args)
    {
        final int doIt = new BasicInitialization().doIt();
    }
}



/*
 * Changes:
 * $Log: $
 */