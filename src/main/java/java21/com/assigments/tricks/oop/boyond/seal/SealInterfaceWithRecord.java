/*
 * SealInterfaceWithRecord.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.seal;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SealInterfaceWithRecord
{

}

record Level9() implements Level8 //implicitly final
{
}

sealed interface Level8 
{

}
/*
 * Changes:
 * $Log: $
 */