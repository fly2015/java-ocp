/*
 * TextBlockSkipLineBreak.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.string;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class TextBlockSkipLineBreak
{
    public static void main(String[] args)
    {
        String text = """
                abc \
                bcd"
                """;
        
        System.out.println(text);
        System.out.println("end");
    }
}



/*
 * Changes:
 * $Log: $
 */