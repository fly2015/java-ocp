/*
 * NioMethodsDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch20_nio.methods;

import java.io.IOException;
import java.nio.file.Path;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class NioMethodsDemo
{
    public static void main(String[] args) throws IOException
    {
        // =====================================
        Path path1 = Path.of("./how");
        Path path2 = Path.of(".././data/symbolicDemo/symbolicTarget");
        
       // System.out.println(path1.toRealPath());
        //System.out.println(path2.toRealPath());
        //System.out.println(path1.resolve(path2));
        System.out.println(path1.resolve(path2).toRealPath());
    }
}



/*
 * Changes:
 * $Log: $
 */