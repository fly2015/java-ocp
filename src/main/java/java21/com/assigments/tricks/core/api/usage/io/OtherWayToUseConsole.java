/*
 * OtherWayToUseConsole.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.api.usage.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class OtherWayToUseConsole
{
    public static void main(String[] args)
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.print("Enter your address: ");
            r.readLine();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}



/*
 * Changes:
 * $Log: $
 */