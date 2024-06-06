/*
 * CastingTricks.java
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
public class CastingTricks
{
    public static void main(String[] args)
    {
        Complex complex = new Complex();
        complex.convert();
    }
}


class Complex
{
    class Building
    {
    }

    final class House extends Building
    {
    }

    public void convert()
    {
        Building b1 = new Building();
        House h1 = new House();
        Building b2 = new House();
        //Building b3 = (House)b1;// cast exception
       // House h2 = (Building)h1; // compile error, a children ref can not ref to a parent object.
        Building b4 = (Building)b2;
        House h3 = (House)b2;
        
        if (b1 instanceof House)
        {
            System.out.println("true");
        }
        
    }
}

/*
 * Changes:
 * $Log: $
 */