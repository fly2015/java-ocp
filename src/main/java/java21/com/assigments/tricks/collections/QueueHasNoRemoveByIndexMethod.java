/*
 * QueueHasNoRemoveByIndexMethod.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.collections;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class QueueHasNoRemoveByIndexMethod
{
    public static void main(String[] args)
    {
        Queue<String> queue = new ArrayDeque<String>();
        queue.remove(1);//remove object not by index
        //queue.set(1, o) //not support
    }
}


/*
 * Changes:
 * $Log: $
 */