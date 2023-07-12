/*
 * TextBlockDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.jse17.textblock;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class TextBlockDemo
{
    public static void main(String[] args)
    {
        // Normal case, mutiple lines
        String block1 = """
                Hello!
                I'm here.
                """;
        System.out.println(block1);
        System.out.println("Here");
        
        // The contents do not need to be escaped
        String block2 = """
                Hello! ""
                I'm here.
                """;
        System.out.println(block2);
        
        // Essentical whitespace
        String block3 = """
                    Hello! ""
                I'm here.      a
                """;
        System.out.println(block3);
        
        // Do not add new line
        String block4 = """
                    Hello! "" \
                I'm here.      a
                """;
        System.out.println(block4);


        // Keep trailing space at the end of the line with \s
        String block5 = """
                    Hello! "" 
                    ABC    \s
                I'm here.      a
                """;
        System.out.println(block5);
    }
}



/*
 * Changes:
 * $Log: $
 */