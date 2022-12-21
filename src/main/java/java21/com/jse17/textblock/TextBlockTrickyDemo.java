/*
 * TextBlockTrickyDemo.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.jse17.textblock;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class TextBlockTrickyDemo
{
    public static void main(String[] args)
    {
        // Normal case, mutiple lines, do not manipulate escaped
        String block1 = """
                Hello! \"
                I'm here.
                """;
        System.out.println(block1);
        
        String block2 = """
                Hello! \"""
                I'm here.
                """;
        System.out.println(block2);
        
        String block3 = """
                Hello! \"\"\"
                I'm here.
                """;
        System.out.println(block3);
        
        // Ignore space at the end of the line
        String block4 = """
                Hello! \"\"\"
                I'm here.                      
                """;
        System.out.println(block4);
        
        // \s is space
        String block5 = """
                Hello!\s 
                I'm here.
                """;
        System.out.println(block5);
        
        System.out.print("""
                         "ape"
                         "baboon"
                         "gorilla"
                         """);
    }
}



/*
 * Changes:
 * $Log: $
 */