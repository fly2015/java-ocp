/*
 * MarkIOStream.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.io.nio;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class MarkIOStream
{
    public int getPrize(byte[] luck) throws Exception
    {
        try (InputStream is = new ByteArrayInputStream(luck))
        {
            is.read(new byte[2]);//1,2
            if (!is.markSupported())//ByteArrayInputStream does support mark for sure
                return -1;
            is.mark(5);// marked from 3,4,5,6,7
            is.read();//3
            is.read();//4
            is.skip(3);//5,6,7
            is.reset();// back to 3
            return is.read();//3
        }
    }

    public static void main(String[] sticky) throws Exception
    {
        final MarkIOStream p = new MarkIOStream();
        final var luck = new byte[] {1, 2, 3, 4, 5, 6, 7};
        System.out.print(p.getPrize(luck));
    }
}

   



/*
 * Changes:
 * $Log: $
 */