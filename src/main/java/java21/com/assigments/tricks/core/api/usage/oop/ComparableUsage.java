/*
 * ComparableUsage.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.api.usage.oop;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ComparableUsage implements Comparable<ComparableUsage>
{
    public static void main(String[] args)
    {
        ComparableUsage comparableUsage1 = new ComparableUsage();
        ComparableUsage comparableUsage2 = new ComparableUsage();
        
        System.out.println(comparableUsage1.compareTo(comparableUsage2));
    }

    /**
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(ComparableUsage o)
    {
        // TODO Auto-generated method stub
        return 0;
    }
}



/*
 * Changes:
 * $Log: $
 */