/*
 * PathDerivingDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio.path;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PathDerivingDemo
{
    public static void main(String[] args)
    {
        var path1 = Path.of("fish.txt");
        var path2 = Path.of("friendly/birds.txt");
        System.out.println(path1.relativize(path2));// ../friendly/birds.txt
        System.out.println(path2.relativize(path1));// ../../fish.txt
        
        Path path3 = Paths.get("E:\\habitat");
        Path path4 = Paths.get("E:\\sanctuary\\raven\\poe.txt");
        System.out.println(path3.relativize(path4)); // ../sanctuary/raven/poe.txt
        System.out.println(path4.relativize(path3)); // ../../../habitat
        
        Path path33 = Paths.get("c:\\primate\\chimpanzee");
        Path path44 = Paths.get("d:\\storage\\bananas.txt");
        path33.relativize(path44); // IllegalArgumentException
    }
}



/*
 * Changes:
 * $Log: $
 */