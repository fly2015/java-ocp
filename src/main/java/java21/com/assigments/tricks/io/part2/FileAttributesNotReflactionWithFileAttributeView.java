/*
 * FileAttributesNotReflactionWithFileAttributeView.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.io.part2;

import static java.nio.file.attribute.PosixFilePermission.*;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.Set;


/**
 * @author nhqhien
 * @version $Revision: $
 */
public class FileAttributesNotReflactionWithFileAttributeView
{
    public static void main(String[] args)
    {
        try
        {
            Path file = Path.of("/test/data/info.txt");
            Set<PosixFilePermission> perms = PosixFilePermissions.fromString("---------");
            Files.setPosixFilePermissions(file, perms);

            PosixFileAttributeView pfaView = Files.getFileAttributeView(file, PosixFileAttributeView.class);
            PosixFileAttributes pfa = pfaView.readAttributes();

            perms = Set.of(OWNER_READ, GROUP_WRITE, OTHERS_READ);
            pfaView.setPermissions(perms);

            perms = pfa.permissions();
            perms.add(OWNER_WRITE);
            pfaView.setPermissions(perms);

            perms = pfa.permissions();
            perms.remove(GROUP_WRITE);
            pfaView.setPermissions(perms);

            perms = pfa.permissions();
            System.out.println(perms);

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