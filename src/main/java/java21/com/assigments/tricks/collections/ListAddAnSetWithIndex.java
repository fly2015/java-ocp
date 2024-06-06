/*
 * ListAddAnSet.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ListAddAnSetWithIndex
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(2019);
        list.add(2020);
        list.add(2021);
       // int index1 = list.indexOf(2020);
       // System.out.println(index1);
        
        System.out.println("Before: " + list);
        for (int i : list)
        {
            
            System.out.println(i);
            int index = list.indexOf(i);
           // System.out.println(index);
            list.set(index, ++i);
            System.out.println(index + ": " + list);
        }
        System.out.println("After:  " + list);
    }
}



/*
 * Changes:
 * $Log: $
 */