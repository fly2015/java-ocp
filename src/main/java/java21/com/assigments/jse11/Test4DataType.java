/*
 * Test4DataType.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.assigments.jse11;

import java.io.IOException;
import java.io.Writer;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Test4DataType
{
    public static void main(String[] args)
    {
        char x = 'a';
        testNumber(x);
        testNumber(Integer.valueOf(1));
        testNumber(1l);
        
        testNumber2(Integer.valueOf(1));
        testNumber2(1L);
        
        testNumber3(0.0); //Must be a double
    }
    

    public static void testNumber2(Number x)
    {
    }


    public static void testNumber3(Double x)
    {
    }


    public static void testNumber(double x)
    {
    }
       
    
    public static void main1(String[] args) throws IOException
    {
        String line;
        String line2;
        var c = System.console();
        Writer w = c.writer();
        try (w)
        {
            if ((line = c.readLine("Enter your name:")) != null)
                w.append(line);
            w.flush();
        }
       // System.out.println(line2);
    }
    
}



/*
 * Changes:
 * $Log: $
 */