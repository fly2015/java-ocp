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
        Map<String, String> m = new HashMap<>();
        final String put = m.put("123", "4566");
        System.out.println(put);//null
        final String put1 = m.put("123", "45667");
        System.out.println(put1);//4566
    }
}



/*
 * Changes:
 * $Log: $
 */