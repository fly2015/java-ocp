/*
 * SwitchBlockTricky.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.basic.ch4_making_decisions;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SwitchBlockTricky
{
    public static void main(String[] args)
    {
        int i = 0;
        
        /*
         * switch (0)
         * {
         * case 1,2: return 0;
         * default:
         * }
         */
         
        
        int x = switch (i)
        {
            case 1, 2 -> 0;
            default -> 10;
            case 3 -> {yield 10;}
        };
        
        
        System.out.println(x);
        
        
    }
}



/*
 * Changes:
 * $Log: $
 */