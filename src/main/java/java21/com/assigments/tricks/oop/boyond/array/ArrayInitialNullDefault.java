/*
 * ArrayInitialNullDefault.java
 *
 * Copyright by Da Nang, Viet Nam
 * Hien Ng
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.array;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ArrayInitialNullDefault
{
    static int[][] game = {{1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
    static int[][] game2;
    public static void main(String args[])
    {
        game2[3][3] = 6;// Null exception
        game[3][3] = 6;
        Object[] obj = game;
        obj[3] = 'X'; //java.lang.ArrayStoreException: java.lang.Character
        System.out.println(game[3][3]);
        
        char i1 = 'A';
        short i2 = 1;
        int i = i1;
    }
}



/*
 * Changes:
 * $Log: $
 */