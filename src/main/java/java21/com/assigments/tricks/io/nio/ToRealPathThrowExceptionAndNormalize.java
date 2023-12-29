/*
 * NormalizePath.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.io.nio;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ToRealPathThrowExceptionAndNormalize
{
    public static void main(String[] args) throws IOException
    {
       Path path1 = Path.of("/a../b/./c");
       System.out.println(path1.toRealPath()); //normalize and find the real path in the file system
    }
}



/*
 * Changes:
 * $Log: $
 */