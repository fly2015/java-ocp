/*
 * CallingNestedParam.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.classusage;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class AccessNestedParam
{
    public static void main(String[] args)
    {
        Level4 level4 = new Level4();
    }
}

class Level4
{
    private String name ="Level4";
    class Level5
    {
        private String name ="Level5";
        class Level6
        {
            private String name ="Level6";
        }
    }
    
    public Level5 getLevel5()
    {
        return new Level5(); //Level4 is implicitly
    }
}


/*
 * Changes:
 * $Log: $
 */