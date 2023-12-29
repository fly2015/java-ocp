/*
 * FileDeleteMustHandleIOException.java
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
public class FileDeleteMustHandleIOException
{
    public static void main(String[] args) throws IOException
    {
        Files.delete(Path.of("./a"));
    }
}



/*
 * Changes:
 * $Log: $
 */