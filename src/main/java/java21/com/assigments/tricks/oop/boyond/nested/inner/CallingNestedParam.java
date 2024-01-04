/*
 * CallingNestedParam.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.nested.inner;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CallingNestedParam
{
    public static void main(String[] args)
    {
        Level1.Level2.Level3 level3 = new Level1().new Level2().new Level3();
        level3.getNames();
        
        Level1.Level2 level2 = new Level1().new Level2();
    }
}

class Level1
{
    private String name ="Level1";
    class Level2
    {
        private String name ="Level2";
        class Level3
        {
            private String name ="Level3";
            
            public void getNames()
            {
                System.out.println(name);
                System.out.println(this.name);
                System.out.println(Level3.this.name);
                System.out.println(Level2.this.name);
                System.out.println(Level1.this.name);
            }
        }
    }
}


/*
 * Changes:
 * $Log: $
 */