/*
 * NormalizePath.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.io.nio;

import java.nio.file.Path;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class NormalizePath
{
    public static void main(String[] args)
    {
       Path path1 = Path.of("/a/../b/./c");
       System.out.println(path1.normalize());// \b\c => Just remove the redundant parts
    }
}



/*
 * Changes:
 * $Log: $
 */