/*
 * PathManipulate_IMPORTANT.java
 *
 * Hien Ng
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
public class PathNormalizeRemoveRedundantPart_IMPORTANT
{
    public static void main(String[] args)
    {
        Path p1 = Path.of("/users/joe");
        Path p2 = Path.of("/users/bob");
        System.out.println(p1.relativize(p2));//..\bob
        Path p3 = p1.resolve(p1.relativize(p2));
        System.out.println(p3);// \\users\joe\..\bob
        Path p4 = p3.normalize();// Remove redundant
        System.out.println(p4);
        System.out.println(p3.getName(1) + " " + p4.getName(1)); //joe bob
    }
}



/*
 * Changes:
 * $Log: $
 */