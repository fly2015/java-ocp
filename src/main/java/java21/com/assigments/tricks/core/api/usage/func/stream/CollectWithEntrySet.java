/*
 * CollectWithEntrySet.java
 *
 * Copyright by Da Nang, Viet Nam
 * Hien Ng
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.api.usage.func.stream;
import static java.util.stream.Collectors.*;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */

public class CollectWithEntrySet
{
    record Goat(String food) {
    }
    public static void main(String[] args)
    {
        var goats = List.of(
                            new Goat("can"),
                            new Goat("hay"),
                            new Goat("shorts"),
                            new Goat("hay"));
                           
                            goats.stream()
                            .collect(groupingBy(Goat::food))
                            .entrySet()
                            .stream()
                            .filter(e -> e.getValue().size() == 2)
                            .map(e -> e.getKey())
                            .collect(partitioningBy(e -> e.isEmpty()))//partition with key only
                            .get(false)
                            .stream()
                            .sorted()
                            .forEach(System.out::print);
                            }
}




/*
 * Changes:
 * $Log: $
 */