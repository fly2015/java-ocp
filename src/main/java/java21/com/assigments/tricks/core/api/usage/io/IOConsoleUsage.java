/*
 * ConsoleUsage.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.api.usage.io;

import java.io.Console;
import java.io.Reader;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class IOConsoleUsage
{
    public static void main(String[] args)
    {
        System.out.println("Java Console Program.");
        System.out.println("=======================");
        final Console console = System.console();
        
        if (console != null)
        {
            System.out.print("Enter your name: ");
            final String readLine = console.readLine();
            System.out.println(readLine.format("Name is %s", readLine));
            System.out.print("Enter your password:");
            final char[] readPassword = console.readPassword("*******", new char[10]);
            
            final Reader reader = console.reader();//support a reader
            console.writer();//support a writter
        }
        else
        {
            System.out.println("Console is not supported");
        }
    }
}



/*
 * Changes:
 * $Log: $
 */