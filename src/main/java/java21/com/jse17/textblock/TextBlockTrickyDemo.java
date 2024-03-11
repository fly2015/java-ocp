/*
 * TextBlockTrickyDemo.java
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
        
        // \s is keep spaces of the line before
        String block5 = """
                Hello5!          \s 
                I'm here.
                """;
        System.out.println("Block5");
        System.out.println(block5);
        
        System.out.print("""
                         "ape"
                         "baboon"
                         "gorilla"
                         """);
        

        //the last three quotes must be escaped -> there are three quotes in a row
        var quotes = """
                "The Quotes that Could"
                \"""
                """;
        System.out.println(quotes);


         // Have to have last space at the closing triple quotes
        var count = 1111;
        var text1 = """
                "ape"   \s""" + count + """
                   \sbaboon"
                "gorilla" """;
         System.out.print(text1);
    }

    
}



/*
 * Changes:
 * $Log: $
 */