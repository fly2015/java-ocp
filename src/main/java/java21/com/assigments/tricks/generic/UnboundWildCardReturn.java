/*
 * UnboundWildCardReturn.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.generic;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class UnboundWildCardReturn
{
    public static void main(String[] args)
    {
        
    }
    
    public <T> T getT(T t)
    {
        return t; 
    }
   
    
    public <T> Class<? extends String> getT2(T t)
    {
        return "".getClass(); 
    }
    
    
    
}



/*
 * Changes:
 * $Log: $
 */