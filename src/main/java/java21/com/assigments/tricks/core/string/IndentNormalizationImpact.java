/*
 * IndentNormalizationImpact.java
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
public class IndentNormalizationImpact
{
    public static void main(String[] args)
    {
        String str1 = "abc\n123";
        System.out.println(str1);
        System.out.println(str1.length());//7
        System.out.println(str1.indent(1).length());//10
        System.out.println(str1.indent(0).length());//8
        System.out.println("abc\\n123".translateEscapes().length());//7
    }
}



/*
 * Changes:
 * $Log: $
 */