/*
 * TopLevelSealed.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.seal;

import java.io.Serializable;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public sealed class TopLevelSealed // Permit is optional
{

}

final class ChildOptional extends TopLevelSealed implements Serializable
{
    
}



/*
 * Changes:
 * $Log: $
 */