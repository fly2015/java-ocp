/*
 * SwitchExpressionDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.jse17.switch_case_expression;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SwitchExpressionDemo
{
    public void printSeason(int month)
    {
        // No need to have default since no return
        switch (month)
        {
            case 1, 2, 3 -> System.out.print("Winter");
            case 4, 5, 6 -> System.out.print("Spring");
            case 7, 8, 9 -> System.out.print("Summer");
            case 10, 11, 12 -> System.out.print("Fall");
        }
        
        // must be have default if return value
        int bear = 0;
        var result = switch (bear)
        {
            case 30 -> "Grizzly";
            default -> "Panda";
        };
        
        // YIELD to return in case block
        int fish = 5;
        int length = 12;
        var name = switch (fish)
        {
            case 1 -> "Goldfish";
            case 2 ->
            {
                yield "Trout";
            }
            case 3 ->
            {
                if (length > 10)
                    yield "Blobfish";
                else
                    yield "Green";
            }
            default -> "Swordfish";
        };
    }
    
    /*
     * If the switch expression takes an enum value, add a case branch for every possible
    enum value. 
     */
    enum Season
    {
     WINTER,
     SPRING,
     SUMMER,
     FALL
    }

    String getWeather(Season value)
    {
        return switch (value)
        {
            case WINTER -> "Cold";
            case SPRING -> "Rainy";
            case SUMMER -> "Hot";
            case FALL -> "Warm";
        };
    }
}

/*
 * Changes:
 * $Log: $
 */