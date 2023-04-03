/*
 * TextBlockTrickiestDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
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
        var text = """
                ant antelope \s \n
                cat "kitten" \
                seal sea lion
                """;
        System.out.print(text);
    }
}

/*
 * Changes:
 * $Log: $
 */