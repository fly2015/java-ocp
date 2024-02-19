/*
 * CollectionWithUnboundWildCard.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.collections;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CollectionWithUnboundWildCard
{
    public static void main(String[] args)
    {
        Collection<?> col = new ArrayList<String>();
        Collection<Object> col1 = new ArrayList<Object>();
        //col.addAll(col1);
        
    }
}



/*
 * Changes:
 * $Log: $
 */