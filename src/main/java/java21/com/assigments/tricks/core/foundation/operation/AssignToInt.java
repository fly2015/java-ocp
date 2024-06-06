/*
 * AssignToInt.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.foundation.operation;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class AssignToInt
{
    public static void main(String[] args)
    {
        int note = 1;
        short melody = (byte)(double)(note *= 2);//OK
        //short zebra = (byte) weight * (byte) height;//NOT OK
    }
}



/*
 * Changes:
 * $Log: $
 */