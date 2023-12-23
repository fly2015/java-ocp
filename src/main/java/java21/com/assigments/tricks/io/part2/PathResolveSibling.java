/*
 * PathResolveSibling.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.io.part2;
import java.nio.file.*;
/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class PathResolveSibling
{
    public static void main(String[] args) {

        Path earth = Path.of("/", "planets", "earth");
        System.out.println(earth);
        System.out.println(earth.getParent());//NULL
        Path moonOrbit = earth.resolve(Path.of("moon", "orbit.param"));
      
        Path mars = earth.resolveSibling("mars"); //mars
        System.out.println(mars);
        Path fromMarsToMoon = mars.relativize(moonOrbit);
        System.out.println(fromMarsToMoon);
      }
}



/*
 * Changes:
 * $Log: $
 */