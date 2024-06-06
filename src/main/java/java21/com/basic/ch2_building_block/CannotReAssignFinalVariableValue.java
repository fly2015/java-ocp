/*
 * CannotReAssignFinalVariableValue.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.basic.ch2_building_block;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class CannotReAssignFinalVariableValue
{

}

class Husky
{
    {
        //this.food = 10;
    }
    {
        this.toy = 2;
    }
    private final int toy;
    private static final int food = 0;// constant must be initialize at declaration.

    public Husky(int friend)
    {
        //this.food += friend++;
        //this.toy -= friend--;
    }


    public static void main(String... unused)
    {
        var h = new Husky(2);
        System.out.println(h.food + "," + h.toy);
    }
}

/*
 * Changes:
 * $Log: $
 */