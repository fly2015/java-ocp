/*
 * Test4IO.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.assigments.jse11;

import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Test4IO
{
    public static void main(String[] args) throws IOException
    {
        String initialString = "PEACOCKS";
        Reader reader = new StringReader(initialString);
        var sb = new StringBuilder();
        
        char read = (char)reader.read();
        System.out.println("read: " + read); //P
        
        sb.append(read);
        reader.mark(10);
        for (int i = 0; i < 2; i++)
        {
            read = (char)reader.read();
            System.out.println("read: " + read);
            sb.append(read);
            reader.skip(2);
        }
        reader.reset();
        reader.skip(0);
        read = (char)reader.read();
        System.out.println("read: " + read);
        sb.append(read);
        
        System.out.println(sb.toString());
        
        
        java.nio.file.FileSystems.getDefault().getPath("").toAbsolutePath();
        reader = new InputStreamReader(new FileInputStream(new File( java.nio.file.FileSystems.getDefault().getPath("").toAbsolutePath() + "/data/file1.txt")));
        try (var writer = new FileWriter(new File(java.nio.file.FileSystems.getDefault().getPath("").toAbsolutePath() + "/data/file2.txt")))
        {
            char[] buffer = new char[10];
            int numberOfChar;
            while ((numberOfChar = reader.read(buffer)) != -1)
            {
                writer.write(buffer, 0, numberOfChar);
                // n1
            }
        }
        
        Console console = System.console();
        String color = console.readLine("Favorite color?");
        //console.fo ("Your favorite color is %s",color);
    }
}



/*
 * Changes:
 * $Log: $
 */