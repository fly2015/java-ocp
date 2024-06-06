/*
 * PosixFilePermissionCustom.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.io.part2;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.*;
/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PosixFilePermissionCustom
{
    /**
     Only permissions explicitly added to the set are applied, all other permissions are removed. 
     In order to be able to access files inside a directory, the directory needs to have execute permission.
      However, the permissions for the /test/data directory are changed to read-only in the code. 
      Therefore, an attempt to access the info.txt file in this directory by the walk() method will throw an AccessDeniedException,
       that will terminate the stream processing.
     */
    public static void main(String[] args)
    {
        Path directory = Path.of("/test/data");
        Path file = Path.of("/test/data/info.txt");
        try
        {
            Set<PosixFilePermission> permissions = new HashSet<>();
            permissions.add(PosixFilePermission.OWNER_READ);
            Files.setPosixFilePermissions(directory, permissions);

            permissions.add(PosixFilePermission.OWNER_WRITE);
            Files.setPosixFilePermissions(file, permissions);
            try (var stream = Files.walk(directory))
            {
                stream.forEach(System.out::println);
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}



/*
 * Changes:
 * $Log: $
 */