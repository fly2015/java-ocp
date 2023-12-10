/*
 * VariableMustBeFinalOrEffectiveFinalInTryBlock.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class VariableMustBeFinalOrEffectiveFinalInTryBlock
{
    public static void main(String[] args) throws FileNotFoundException
    {
        var x = 0;
        final int y = 1;
        // int e = 0; //e already declared
        FileInputStream fis = new FileInputStream("");
        try(fis;)
        {
            x = 10;
        }
        catch (Exception e)
        {
            x = 8;
        }
        
        x = 1;
        //fis = null; must be final or effective final
    }
}



/*
 * Changes:
 * $Log: $
 */