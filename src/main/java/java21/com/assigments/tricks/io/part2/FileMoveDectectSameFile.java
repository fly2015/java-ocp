/*
 * FileMoveDectectSameFile.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.io.part2;
import java.io.*;
import java.nio.file.*;
/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class FileMoveDectectSameFile
{
    public static void main(String[] args) {

        try {
          Path p1 = Path.of("/users/joe/test/a.jpg");
          Path p2 = Path.of("/users").resolve(p1.getName(1).resolve("test/a.jpg"));
          Files.move(p1, p2);
        } catch (IOException ex) {
          ex.printStackTrace();
        }
      }
}



/*
 * Changes:
 * $Log: $
 */