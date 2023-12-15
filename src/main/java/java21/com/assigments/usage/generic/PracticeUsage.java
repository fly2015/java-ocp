/*
 * PracticeUsage.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.usage.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PracticeUsage
{
    public static void main(String[] args)
    {
        List<? super Integer> num1 = new ArrayList<Number>();
        num1.add(1);
        
        List<? extends Number> num2 = new ArrayList<Number>();
    }
}



/*
 * Changes:
 * $Log: $
 */