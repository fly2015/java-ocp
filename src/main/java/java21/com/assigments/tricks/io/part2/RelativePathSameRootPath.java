/*
 * RelativePath.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.io.part2;

import java.nio.file.Path;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class RelativePathSameRootPath
{
    public static void main(String[] args)
    {
        Path p1 = Path.of("/planets/mars");
        Path p2 = Path.of("/planets/earth/moon/orbit.param");
        System.out.println(p1.relativize(p2));// ..\earth\moon\orbit.param
        
        System.out.println(p2.relativize(p1));
    }
}



/*
 * Changes:
 * $Log: $
 */