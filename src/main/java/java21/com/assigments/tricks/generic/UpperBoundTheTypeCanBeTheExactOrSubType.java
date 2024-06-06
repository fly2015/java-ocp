/*
 * UpperBoundTheTypeCanBeTheExactOrSubType.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.generic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class UpperBoundTheTypeCanBeTheExactOrSubType
{
    public static void main(String[] args)
    {
        List<? extends Exception> exceptionList1 = new ArrayList<Exception>();
        List<? extends Exception> exceptionList2 = new ArrayList<IOException>();
        exceptionList2.add(null);//Upper bound only can add null
        final Exception exception = exceptionList2.get(0);
        List<? extends RuntimeException> exceptionList3 = new ArrayList<IllegalArgumentException>();
    }
}



/*
 * Changes:
 * $Log: $
 */