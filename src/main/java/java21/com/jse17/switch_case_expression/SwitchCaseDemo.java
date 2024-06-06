/*
 * SwitchCaseDemo.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.jse17.switch_case_expression;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SwitchCaseDemo
{
    public static void main(String[] args)
    {
        int key = 1;
        
        // block
        switch (key)
        {
            case 1:
            case 2:
                System.out.println("OK men");
        }
        
        // expression
        switch (key)
        {
            case 1, 2 ->
                System.out.println("OK men");
        }
    }
}



/*
 * Changes:
 * $Log: $
 */