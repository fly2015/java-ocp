/*
 * TrickiestString.java
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
public class TrickiestString
{
    public static void main(String[] args)
    {
        
        //
        String curious = "     \s";
        System.out.println(curious.isEmpty());
        System.out.println(curious.isBlank());
        
        // ref before finishing init;
        /*
         * var sb = new StringBuilder("radical")
         * .insert(sb.length(), "robots");
         * System.out.println(sb);
         */

        // adds the normalizing line break while indent 0 or a negative
        var phrase = "prickly \nporcupine";
        System.out.println(phrase.length());
        System.out.println(phrase.indent(1));
        System.out.println(phrase.indent(1).length());
        System.out.println(phrase.indent(0).length());
        System.out.println(phrase.indent(0));
        System.out.println(phrase.indent(-1).length());
        
        //translate escape -> remove escape
        System.out.println("cheetah\ncub".translateEscapes());
    }
}



/*
 * Changes:
 * $Log: $
 */