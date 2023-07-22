/*
 * Test4Nio1.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.assigments.jse11.nio2;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Test4Nio1
{
    public static void main(String[] args) throws Exception
    {
        var p = Paths.get("sloth.schedule");
        var a = Files.readAttributes(p, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
        
        Files.createDirectory(p.resolve(".backup"));
        if (a.size() > 0 && a.isDirectory())
        {
            //a.setTimes(null, null, null);
        }
        
        //
        
        Path path = Path.of("/animals");
        try (var z = Files.walk(path)) {
        boolean b = z
        .filter(x1 -> Files.isDirectory(x1)) // x
        .findFirst().isPresent(); // ySystem.out.print(b ? "No Sub": "Has Sub");
        }
        
        
        Files.copy(Path.of("data", "file1.txt"), Path.of("how", "dataCopyNoDeep1"));
    }
}



/*
 * Changes:
 * $Log: $
 */