/*
 * SubPath.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio.path;

import java.nio.file.Paths;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SubPath
{
    public static void main(String[] args)
    {
        var p = Paths.get("/mammal/omnivore/raccoon.image");
        System.out.println("Path is: " + p);
        for (int i = 0; i < p.getNameCount(); i++)
        {
            System.out.println(" Element " + i + " is: " + p.getName(i));
        }
        System.out.println();
        System.out.println("subpath(0,3): " + p.subpath(0, 3));
        System.out.println("subpath(1,2): " + p.subpath(1, 2));
        System.out.println("subpath(1,3): " + p.subpath(1, 3));
        
        var p1 = Paths.get("./mammal/omnivore/raccoon.image");
        System.out.println("subpath(0,3): " + p1.subpath(0, 3));
        
        var q = p.subpath(0, 4); // IllegalArgumentException
        var x = p.subpath(1, 1); // IllegalArgumentException
    }
}



/*
 * Changes:
 * $Log: $
 */