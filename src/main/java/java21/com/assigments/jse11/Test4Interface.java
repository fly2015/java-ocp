/*
 * Test4Interface.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.assigments.jse11;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public interface Test4Interface
{
    public List move();
}

interface Walk { public List move(); }
interface Run extends Walk { public ArrayList
move(); }


/*
 * Changes:
 * $Log: $
 */