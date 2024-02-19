/*
 * CollectionDeclarationWithoutGeneric.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CollectionDeclarationWithoutGeneric
{
    public static void main(String[] args)
    {
        Map m = new HashMap();
        m.put("", "");
        m.put(1, 1);
        System.out.println(m.containsKey(1));//true
        System.out.println(m.containsKey(""));
    }
}



/*
 * Changes:
 * $Log: $
 */