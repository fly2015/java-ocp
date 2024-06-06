/*
 * OverrideWithPolymophism.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.override;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class OverrideWithPolymophism extends ParentDemo3
{
    @Override
    int getNumber(Number x)
    {
        return 0;
    }
    
    int getNumber(ArrayList<String> x) //overloaded not override
    {
        return 0;
    }
}

class ParentDemo3
{
    int getNumber(Number x)
    {
        return 0;
    }
    
    int getNumber(List<String> x)
    {
        return 0;
    }
}


/*
 * Changes:
 * $Log: $
 */