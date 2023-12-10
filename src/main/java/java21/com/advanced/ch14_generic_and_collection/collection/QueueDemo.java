/*
 * QueueDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class QueueDemo
{
    public static void main(String[] args)
    {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("1");
        queue.add("2");
        
        System.out.println(queue.peek());//1
        System.out.println(queue.poll());//1
        System.out.println(queue);//[2]
       
    }
}



/*
 * Changes:
 * $Log: $
 */