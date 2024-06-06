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
import java.util.Stack;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class StackDemo
{
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        System.out.println(stack.peek());//1
        System.out.println(stack.pop());//1
        System.out.println(stack);//[2]
        
        
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.push("1");
        linkedList.push("2");
        System.out.println(linkedList.peek());// 2
        System.out.println(linkedList.pop());// 2
        System.out.println(linkedList);// [1]
    }
}



/*
 * Changes:
 * $Log: $
 */