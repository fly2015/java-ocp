/*
 * MapContainKeyOrContainValueMethod.java
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
public class MapOnlyContainKeyOrContainValueMethod
{
    public static void main(String[] args)
    {
        Map m = new HashMap();
        m.put(123, "456");
        m.put("abc", "def");
        //System.out.println(m.contains("123"));
    }
}



/*
 * Changes:
 * $Log: $
 */