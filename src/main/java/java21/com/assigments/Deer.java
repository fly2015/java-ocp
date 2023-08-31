/*
 * C718.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package java21.com.assigments;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Deer
{

    enum Food
    {
     APPLES,
     BERRIES,
     GRASS
    }
    
    protected class Diet
    {
        private Food getFavorite()
        {
            return Food.BERRIES;
        }
    }

    public static void main(String[] seasons)
    {
        System.out.print(switch (new Deer().new Diet().getFavorite())
        {
            case APPLES -> "a";
            case BERRIES -> "b";
            default -> "c";
        });
        
        //
        /*
         * System.out.print(switch (new Diet2().getFavorite())
         * {
         * case APPLES -> "a";
         * case BERRIES -> "b";
         * default -> "c";
         * });
         */
    }
}


class Test
{
    public static void main(String[] args)
    {
        /*
         * System.out.print(switch (new Deer().new Diet().getFavorite())
         * {
         * case APPLES -> "a";
         * case BERRIES -> "b";
         * default -> "c";
         * });
         */
    }
}


/*
 * Changes:
 * $Log: $
 */