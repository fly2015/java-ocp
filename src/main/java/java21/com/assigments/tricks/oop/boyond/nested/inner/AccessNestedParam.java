/*
 * CallingNestedParam.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.nested.inner;

import java21.com.assigments.tricks.oop.boyond.nested.inner.Level4.Level5.Level6;

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
        Level4.Level5.Level6 level6 = new Level4().new Level5().new Level6();
        level6.printName();
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
            
            void printName()
            {
                System.out.println(name);//Level6
                System.out.println(this.name);//Level6
                System.out.println(Level6.this.name);//Level6
                System.out.println(Level5.this.name);//Level5
                System.out.println(Level4.this.name);//Level4
            }
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