/*
 * SubpathWithAbsoluteDoesNotCountTheRoot.java
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
public class SubpathWithAbsoluteDoesNotCountTheRoot
{
    public static void main(String[] args)
    {
        Path path1 = Path.of("/lv1/lv2");
        System.out.println(path1.subpath(0, 1)); //lv1
    }
}



/*
 * Changes:
 * $Log: $
 */