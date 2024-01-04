/*
 * PracticalUsage.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.api.usage.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PracticalUsage
{
    public static void main(String[] args)
    {
        Path targetPath = getTargetPath();
        writeTextFile(targetPath);
        readTextFile(targetPath);
        writeDataFile(targetPath);
        readDataFile(targetPath);
        
        
        System.out.println("");
        System.out.println("--list--");
        list(targetPath);
        System.out.println("--walk--");
        walk(targetPath);
        System.out.println("--find--");
        find(targetPath, "empty.txt");
        
        copy(targetPath);
        final Path targetFile = targetPath.resolve("sub_folder").resolve("empty_copy.txt");
        System.out.println(Files.exists(targetFile));
        

        System.out.println(Path.of("/a/./b..").normalize());
        //Files.isSameFile(targetPath, targetPath);
        //move();
        //copy();
    }


    public static void copy(Path targetPath)
    {
        try
        {
            Files.copy(targetPath.resolve("sub_folder").resolve("empty.txt"), targetPath.resolve("sub_folder").resolve("empty_copy.txt"), StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    private static void find(Path targetPath, String name)
    {
        try(final Stream<Path> find = Files.find(targetPath, 
                                                 10, 
                                                 (p, a) -> a.isRegularFile()
                                                 && p.endsWith(name), 
                                                 FileVisitOption.FOLLOW_LINKS))
        {
            find.forEach(System.out::println);
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }


    public static void walk(Path targetPath)
    {
        try(final Stream<Path> walk = Files.walk(targetPath, FileVisitOption.FOLLOW_LINKS))
        {
            walk.filter(p -> p.isAbsolute()).filter(p -> Files.isRegularFile(p)).forEach(System.out::println);
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public static void list(Path targetPath)
    {
        try(final Stream<Path> list = Files.list(targetPath))
        {
            list.forEach(System.out::println);
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    

    static void writeDataFile(Path path)
    {
        final File targetFile = new File(path.toFile(), "datafile.txt");
        
        if (!Files.exists(targetFile.toPath()))
        {
            try
            {
                Files.createDirectories(targetFile.toPath());
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        try(BufferedOutputStream w = new BufferedOutputStream(new FileOutputStream(targetFile)))
        {
            byte [] bytes = new String("123abcd").getBytes();
            w.write(bytes);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    static void readDataFile(Path path)
    {
        final File targetFile = new File(path.toFile(), "datafile.txt");
        try (BufferedInputStream r = new BufferedInputStream(new FileInputStream(targetFile)))
        {
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = r.read(bytes)) != -1)
            {
                PrintStream printStream = new PrintStream(System.out);
                printStream.write(bytes, 0, len);
                printStream.flush();
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    static void writeTextFile(Path path) 
    {
        try
        {
            Files.createDirectories(path);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
        final String line = "This is line";
        
        // Use OutputStreamWriter
        final File targetFile = new File(path.toFile(), "textfile.txt");
        try(Writer w = new OutputStreamWriter(new FileOutputStream(targetFile)))
        {
            w.write(line + "1");
            w.write("\n");
            w.write(line + "2");
            w.write("\n");
            w.write(line + "3");
            w.write("\n");
            w.flush();
        }
        catch (FileNotFoundException e1)
        {
            e1.printStackTrace();
        }
        catch (IOException e1)
        {
            e1.printStackTrace();
        }

        
        // Use OutputStreamWriter
        try(BufferedWriter w = new BufferedWriter(new FileWriter(targetFile, true)))
        {
            w.write(line + "4");
            w.newLine();
            w.write(line + "5");
            w.newLine();
            w.write(line + "6");
            w.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    static void readTextFile(Path path) 
    {
        try(BufferedReader r = new BufferedReader(new FileReader(new File(path.toFile(), "textfile.txt"))))
        {
            String line = null;
            while((line = r.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    static Path getTargetPath()
    {
        // Path currentAbsolutePath = Path.of("").toAbsolutePath();
        Path currentAbsolutePath = FileSystems.getDefault().getPath("").toAbsolutePath();
        System.out.println("currentAbsolutePath: " + currentAbsolutePath);
        Path workingPath = Path.of("data/io_test"); 
        Path fullPath = currentAbsolutePath.resolve(workingPath);
        System.out.println("fullPath: " + fullPath);
        return fullPath;
    }
}



/*
 * Changes:
 * $Log: $
 */