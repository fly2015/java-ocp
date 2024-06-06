/*
 * TraversalPath.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.io.part2;
import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;
/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class TraversalPath
{
    public static void main(String[] args) throws IOException {
        Path dirPath = Path.of(".", "wrk");
        printFiles1(dirPath);
        printFiles2(dirPath);
        printFiles3(dirPath);
      }

      public static void printFiles1(Path dirPath) throws IOException {
        try (Stream<Path> paths = Files.list(dirPath)) {
          paths.forEach(System.out::println);
        }
        System.out.println();
      }

      public static void printFiles2(Path dirPath) throws IOException {
        try (Stream<Path> paths = Files.walk(dirPath)) {
          paths.forEach(System.out::println);
        }
        System.out.println();
      }

      public static void printFiles3(Path dirPath) throws IOException {
        try (Stream<Path> paths = Files.find(dirPath, Integer.MAX_VALUE,
                                             (p, a) -> true)) {
          paths.forEach(System.out::println);
        }
        System.out.println();
      }
}



/*
 * Changes:
 * $Log: $
 */