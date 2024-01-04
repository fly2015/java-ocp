/*
 * MissingReturnWithIfElseCondition.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.foundation.decision;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class MissingReturnWithIfElseCondition
{
    public int getNumber()
    {
        int i = 10;
        if(i > 1)
        {
            return i;
        }
       
        return 0; //Compilation err if without this line
    }
}



/*
 * Changes:
 * $Log: $
 */