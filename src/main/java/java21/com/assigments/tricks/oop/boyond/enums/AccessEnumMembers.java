/*
 * EnumInitalVariable.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.enums;
import static java21.com.assigments.tricks.oop.boyond.enums.Enum1.A;
/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */


enum Enum1
{
    A("A"), B("B"), C("C");
    
    private String title;
    private Enum1(String s){
         title = s;
    }
    
    public String format(String s1, String s2)
    {
        return title + "";
    }
}

enum Enum2
{
    D, F;
    private Enum1 enum1 = Enum1.A;
    public String format(String s1, String s2)
    {
        return enum1.format(s1, s2);
    }
}

public class AccessEnumMembers 
{
    void doIt()
    {
        Enum1.A.format(null, null);
        A.format(null, null);
    }
    
    public static void main(String[] args)
    {
    }
}

/*
 * Changes:
 * $Log: $
 */