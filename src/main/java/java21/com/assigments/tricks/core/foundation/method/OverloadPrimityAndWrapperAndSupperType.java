/*
 * OverloadPrimityAndWrapperAndSupperType.java
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
public class OverloadPrimityAndWrapperAndSupperType
{
    
    
    static void printFirst(int... n)
    {
        System.out.println("int...: " + n[0]);
    }

    static void printFirst(int n)
    {
        System.out.println("int ...: " + n);
    }

    static void printFirst(float n)
    {
        System.out.println("float...: " + n);
    }
     

    static void printFirst(Long n)
    {
        System.out.println("Long...: " + n);
    }

    
      static void printFirst(Number n)
      {
      System.out.println("Number...: " + n);
      }


      static void printFirst(Double objs)
      {
          System.out.println("Double...: " + objs);
      }


      static void printFirst(Object objs)
      {
          System.out.println("Object...: " + objs);
      }


    public static void main(String[] args)
    {
        printFirst((byte) 1);   //int...: 1
        printFirst(2);          //int...: 2
        
        //int-> long -> float -> double -> 
        // -> wrapper(not promoted) -> supper -> object -> vargs
        
        printFirst(3L); // float...: 3.0
        printFirst(3.0f); // float...: 3.0
        printFirst(Float.valueOf(0)); // Number...: 0.0
        printFirst(3.0); // Double...: 3.0
        printFirst(Long.valueOf(10));//Long...: 10
    }
}



/*
 * Changes:
 * $Log: $
 */