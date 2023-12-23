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
public class LowerBoundTheTypeCanBeTheExactOrSupperType
{
    public static void main(String[] args)
    {
        List<? super Exception> exceptionList1 = new ArrayList<Exception>();
        List<? super Exception> exceptionList2 = new ArrayList<Throwable>();
        List<? super RuntimeException> exceptionList3 = new ArrayList<Exception>();
        
        final Object runtimeException = exceptionList3.get(0);
        
        exceptionList3.add(new IllegalArgumentException());
        exceptionList3.add(new RuntimeException());
        exceptionList3.add(null);
    }
}



/*
 * Changes:
 * $Log: $
 */