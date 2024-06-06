/*
 * FilesCopyDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class FilesCopyDemo
{
    public static void main(String[] args) throws IOException
    {
        Path source = Paths.get(System.getProperty("user.dir"), "how/module.txt");
        Files.copy(source, Path.of("how", "copiedTest", "module.txt"));
    }
}



/*
 * Changes:
 * $Log: $
 */