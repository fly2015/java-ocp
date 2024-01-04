/*
 * Cannot_access_a_non_final_static_field_from_an_enum_constructor.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.enums;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Cannot_access_a_non_final_static_field_from_an_enum_constructor
{
    
}


enum Pets
{
 DOG("D"),
 CAT("C"),
 FISH("F");

    static String prefix = "I am ";
    String name;

    Pets(String s)
    {
        //name = prefix + s; //prefix is not final
    }


    public String getData()
    {
        return name;
    }
}

/*
 * Changes:
 * $Log: $
 */