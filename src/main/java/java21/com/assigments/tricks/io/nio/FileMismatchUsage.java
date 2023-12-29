/*
 * FileMismatchUsage.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.io.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class FileMismatchUsage
{
    public static void main(String[] args) throws IOException
    {
        System.out.println(Files.mismatch(Path.of("./a.txt"), Path.of("./a.txt")));// -1 => match in term of Path equal
        System.out.println(Files.mismatch(Path.of("./data/a.txt").toAbsolutePath(), Path.of("./data/b.txt").toAbsolutePath()));// 0 => the first diff byte at index 0
    }
}



/*
 * Changes:
 * $Log: $
 */