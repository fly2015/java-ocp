/*
 * RandomAccess.java
 *
 * Da Nang, VN
 * Da Nang
 * All rights reserved.
 */
package java21.com.assigments.tricks.io;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class RandomAccessFile
{
    public static void main(String[] args) throws IOException
    {
        final String absolutePath = FileSystems.getDefault().getPath("").toAbsolutePath().toString() + "\\src\\main\\java\\java21\\com\\assigments\\tricks\\io";
        System.out.println(absolutePath);
        try(java.io.RandomAccessFile rf = new java.io.RandomAccessFile(absolutePath + "/file2", "rwd");)
        {
            rf.write('a');
            final int read = rf.read();
            System.out.println(read);
        }
        
        try(java.io.RandomAccessFile rf = new java.io.RandomAccessFile(absolutePath + "/file2", "rwd");)
        {
            final int read = rf.read();
            System.out.println(read);
        }
    }
}



/*
 * Changes:
 * $Log: $
 */