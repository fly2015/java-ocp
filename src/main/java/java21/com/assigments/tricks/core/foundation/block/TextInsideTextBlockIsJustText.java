/*
 * TextInsideTextBlockIsJustText.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.foundation.block;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class TextInsideTextBlockIsJustText
{
    private int numForks;

    public static void main(String[] args)
    {
        int numKnives = 0;
        System.out.print("""
                "# forks = " + numForks +
                 " # knives = """ + numKnives +
                         
                         """
                         # cups = 0""");
        
    }
}



/*
 * Changes:
 * $Log: $
 */