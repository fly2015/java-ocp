/*
 * NormalizePath.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.io.nio;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.LinkOption;
import java.nio.file.Path;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ToAbsolutePathResolvingCurrentDirectoryWithoutNormalize
{
    public static void main(String[] args)
    {
       Path path1 = Path.of("./a../b/./c");
       System.out.println(path1.toAbsolutePath()); // resolve with working directory without normalize
       
       Path path = FileSystems.getDefault().getPath(".").toAbsolutePath();
       System.out.println(path.resolve(path1));
    }
}



/*
 * Changes:
 * $Log: $
 */