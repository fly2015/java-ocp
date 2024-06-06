/*
 * SealPermitNestedClass.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.seal;

import java21.com.assigments.tricks.oop.boyond.seal.SealPermitNestedClass.Level7;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SealPermitNestedClass
{
    sealed class Level5 permits SealPermitNestedClass.Level6, Level7
    {
    }
    
    final class Level6 extends SealPermitNestedClass.Level5
    {
    }
    
    final class Level7 extends Level5
    {
        
    }
}



/*
 * Changes:
 * $Log: $
 */