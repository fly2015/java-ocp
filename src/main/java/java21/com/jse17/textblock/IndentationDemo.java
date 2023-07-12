/*
 * IndentationDemo.java
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
public class IndentationDemo
{
    public static void main(String[] args)
    {
        String text1 = """
                Hien   
                 Nguyen""";
        
        System.out.println("---------------------");
        System.out.println(text1.indent(0));
        System.out.println(text1.indent(-1));
        //System.out.println(text1.indent(-2));
        //System.out.println(text1.stripIndent());
        //System.out.println(text1.translateEscapes());
        System.out.println("---------------------");
        System.out.println("Done");
        
        var concat = " a\n"
                + " b\n"
                + " c";
        
        System.out.println(concat.stripIndent()); 
    }
}



/*
 * Changes:
 * $Log: $
 */