/*
 * RelativePathMustBeTheSameType.java
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
public class RelativePathMustBeTheSameType
{
    public static void main(String[] args)
    {
        Path path1 = Path.of("./a");
        Path path2 = Path.of("./b");
        Path path3 = Path.of("/c");
        
        System.out.println(path1.relativize(path2));// ../b
        System.out.println(path1.relativize(path3));// EXCEPTION => different type of Path
    }
}



/*
 * Changes:
 * $Log: $
 */