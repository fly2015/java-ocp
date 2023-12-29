/*
 * EnumConstructorMustBePrivate.java
 *
 * Copyright by Da Nang, Viet Nam
 * Hien Ng
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.enums;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class EnumConstructorMustBePrivateAndItIsEmplicitly
{
    enum Season
    {
         SPRING(1),
         SUMMER(2),
         FALL(3),
         WINTER(4);

        private Season(int orderId)
        {
        }
    }
}



/*
 * Changes:
 * $Log: $
 */