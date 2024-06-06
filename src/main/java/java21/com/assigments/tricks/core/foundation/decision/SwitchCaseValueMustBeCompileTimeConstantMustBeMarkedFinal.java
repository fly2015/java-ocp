/*
 * SwitchCaseValueMustBeCompileTimeConstantMustBeMarkedFinal.java
 *
 * Hien Ng
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
public class SwitchCaseValueMustBeCompileTimeConstantMustBeMarkedFinal
{
    public static void main(String[] args)
    {
        enum Type{
            A, B, C
        }
        
        switch (Type.A)
        {
            
        }
        
    }
}



/*
 * Changes:
 * $Log: $
 */