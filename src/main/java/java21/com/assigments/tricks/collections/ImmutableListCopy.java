/*
 * ImmutableListCopy.java
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
public class ImmutableListCopy
{
    public static void main(String[] args)
    {
        List<Integer> one = List.of(8, 16, 2);
        var copy = List.copyOf(one);
        var copyOfCopy = List.copyOf(copy);
        var thirdCopy = new ArrayList<>(copyOfCopy);
        
        

       // one.replaceAll(x -> x * 2);
        copy.replaceAll(x -> x * 2); //Immutable
        System.out.println(thirdCopy); //Mutable
    }
}



/*
 * Changes:
 * $Log: $
 */