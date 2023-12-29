/*
 * OverloadVarargs.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.foundation.method;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class OverloadVarargs
{
    static void printFirst(Integer... ints) {
        System.out.println("Integer...: " + ints[0]);
      }

      static void printFirst(Number... nums) {
        System.out.println("Number...: " + nums[0]);
      }

      static void printFirst(Object... objs) {
        System.out.println("Object...: " + objs[0]);
      }

      public static void main(String[] args) {
        printFirst(10);                                 //Integer 10
        printFirst((byte)20);                           //Number 20
        printFirst('3', '0');                           //Object 3
        printFirst("40");                               //Object 40
        printFirst((short)50, 55);                      //Number 50
        printFirst((Number[])new Integer[] {70, 75});   //Number 70
      }
}



/*
 * Changes:
 * $Log: $
 */