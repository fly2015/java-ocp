/*
 * GenericOverride.java
 *
 * Copyright by Da Nang, Viet Nam
 * Hien Ng
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.override;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
class GenericParent
{
    void testA(Set<Integer> set)
    { 
    }
    
    void testB(Set set)
    {
    }
    
    void testC(List<String> list)
    {
    }
    
    List<Integer> testD(){
        return null;
    }
    
    List testE(){
        return null;
    }
    
    
    List<? extends Number> testF(){
        return null;
    }
    
    List<? super Number> testG(){
        return null;
    }
}

public class GenericOverride extends GenericParent
{
    @Override
    void testA(Set set) //raw type is valid param, consider same signature
    {
        
    }
    
    //@Override
    //void testB(Set<Integer> set){} // Invalid override and overload
    
    //@Override
    void testC(ArrayList<String> list) // only overloaded
    {
    }
    
    
    @Override
    List testD(){
        return null;
    }
    
    @Override
    List<Integer> testE(){
        return null;
    }
    
    @Override
    List<Number> testF(){
        return null;
    }
    
    @Override
    List<Object> testG(){
        return null;
    }
    
    public static void main(String[] args)
    {
        GenericOverride genericOverride = new GenericOverride();
        genericOverride.testA(Set.of("1"));
    }
}


/*
 * Changes:
 * $Log: $
 */