/*
 * OrderOfClassInitianlization_IMPORTANT.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.classusage;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class OrderOfClassInitianlization_IMPORTANT
{
    public static void main(String[] args)
    {
        bogo(new Extension());
    }


    static void bogo(Base b)
    {
        b.add(8);
        b.print();
    }
}


class Base
{
    protected int i;

    Base()
    {
        System.out.println("call constructor Base");
        add(1);
    }


    void add(int v)
    {
        System.out.println("call add Base");
        i += v;
    }


    void print()
    {
        System.out.println(i);
    }
}


class Extension extends Base
{
    Extension()
    {
        System.out.println("call constructor Extension");
        add(2);
    }


    void add(int v)
    {
        i += v * 2;
        System.out.println("call add Extension");
    }
}


/*
 * Changes:
 * $Log: $
 */