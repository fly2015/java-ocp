/*
 * Scorpion.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.assigments.jse11;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
class Arachnid
{
    static StringBuilder sb = new StringBuilder();
    {
        sb.append("c");
    }
    static
    {
        sb.append("u");
        System.out.println("At most one !");
    }
    {
        sb.append("r");
    }
}


public class Scorpion extends Arachnid
{
    static
    {
        sb.append("q");
    }
    {
        sb.append("m");
    }

    public static void main(String[] args)
    {
        System.out.print(Scorpion.sb + " ");//uq
        System.out.print(Scorpion.sb + " ");//uq
        new Arachnid();//uqcr
        new Scorpion();//uqcrm
        System.out.print(Scorpion.sb);
    }
}



/*
 * Changes:
 * $Log: $
 */