/*
 * OverridenCovariantReturn.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.basic.ch8_class_design;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class OverridenCovariantReturn
{

}


class Rhino
{
    protected CharSequence getName()
    {
        return "rhino";
    }


    protected String getColor()
    {
        return "grey, black, or white";
    }
}


class JavanRhino extends Rhino
{
    public String getName()
    {
        return "javan rhino";
    }


    /*
     * CharSequence getColor()
     * { // DOES NOT COMPILE
     * return "grey";
     * }
     */
}

/*
 * Changes:
 * $Log: $
 */