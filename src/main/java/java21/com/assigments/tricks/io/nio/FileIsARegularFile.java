/*
 * FileIsARegularFile.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.io.nio;

import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class FileIsARegularFile
{
    public static void main(String[] args)
    {
        System.out.println(Files.isRegularFile(Path.of("/a.txt")));
    }
}



/*
 * Changes:
 * $Log: $
 */