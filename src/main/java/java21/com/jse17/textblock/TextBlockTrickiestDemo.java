/*
 * TextBlockTrickiestDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.jse17.textblock;

/**
 * @author nhqhien
 * @version $Revision: $
 */
public class TextBlockTrickiestDemo
{
    public static void main(String[] args)
    {
        // Keep the trailing spaces and add a space with \s, avoid line break with \  and line break with \n
        var text = """
                ant antelope \s \n
                cat "kitten" \
                seal sea lion
                """;
        System.out.print(text);

        // Refer variables
        var text1 = """
                ant antelope \s \n
                cat "kitten" \
                seal sea lion
                """;
        System.out.print(text1);
    }
}

/*
 * Changes:
 * $Log: $
 */