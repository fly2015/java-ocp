/*
 * EnumPrintValue.java
 *
 * Hien Ng
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

public class EnumPrintValue
{
    
    enum Format {
        JPEG { public String toString() {return "Jpeggy"; }},
        GIF  { public String toString() {return "Giffy"; }},
        TIFF { public String toString() {return "Tiffy"; }};
      }
    
    public static void main(String[] args)
    {
        print(Format.JPEG);
        print(java21.com.assigments.tricks.oop.boyond.enums.EnumPrintValue.Format.JPEG);
    }
    
    static <T> void print(T t)
    {
        System.out.println(t);
    }
}

 


/*
 * Changes:
 * $Log: $
 */