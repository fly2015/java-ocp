/*
 * PathManipulation.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.io.part2;

import java.io.IOException;
import java.nio.file.Path;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PathManipulation
{
    public static void main (String[] args) throws IOException {
        Path file = Path.of("./document", "../book/../chapter1");
        System.out.println(file.toAbsolutePath());   // (1)
        System.out.println(file.toRealPath());       // (2)
        System.out.println(file.normalize());        // (3)
        System.out.println(file.toString());         // (4)
        System.out.println(file.getParent());        // (5)
      }
}



/*
 * Changes:
 * $Log: $
 */