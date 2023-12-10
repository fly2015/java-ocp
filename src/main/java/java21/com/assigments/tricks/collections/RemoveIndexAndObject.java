/*
 * RemoveIndexAndObject.java
 *
 * Copyright by Hien Ng
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
public class RemoveIndexAndObject
{
    public static void main(String[] args)
    {
        List<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(3);
        integers.add(2);
        integers.add(1);
        
        System.out.println(integers);// [4,3,2,1]
        integers.remove(1);//remove index
        System.out.println(integers);//[4,2,1]
        integers.remove(Integer.valueOf(1));//remove object
        System.out.println(integers);//[4,2]
        
        Integer set = integers.set(0, 5);//return the one is replaced
        System.out.println(set);
    }
}



/*
 * Changes:
 * $Log: $
 */