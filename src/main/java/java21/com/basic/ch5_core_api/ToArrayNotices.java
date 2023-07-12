/*
 * ToArrayNotices.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.basic.ch5_core_api;

import java.util.Arrays;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ToArrayNotices
{
     public static void main(String[] args)
    {
         List<String> list1 = Arrays.asList("one", "two");
         
         Object[] objectArray = list1.toArray();
         String[] stringArray = list1.toArray(new String[1]);
         
         System.out.println(Arrays.toString(stringArray));
         System.out.println(stringArray.length);
         
         
         String[] stringArray3 = list1.toArray(new String[3]);
         System.out.println(stringArray3[2]);
    }   
}



/*
 * Changes:
 * $Log: $
 */