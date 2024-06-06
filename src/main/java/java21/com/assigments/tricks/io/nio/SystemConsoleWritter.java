/*
 * SystemConsoleWritter.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.io.nio;

import java.io.PrintWriter;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SystemConsoleWritter
{
    public static void main(String[] args)
    {
       // System.console().writer().write("hello");
        PrintWriter p = new PrintWriter(System.out);
        p.write("hello");
        p.flush();
    }
}



/*
 * Changes:
 * $Log: $
 */