/*
 * ObjectOutputStreamCanWitePrimitiTyes.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ObjectOutputStreamCanWitePrimitiTyes
{
    public static void main(String[] args)
    {
        try
        {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(""));
            os.write(1);
        }
        catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
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