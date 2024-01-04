/*
 * Partern_Matching_subtype_must_be_on_the_right_hand_side.java
 *
 * Copyright by Hien Ng
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
public class Partern_Matching_subtype_must_be_on_the_right_hand_side
{
    public static void main(String args[])
    {
      B111 b = new C();
      A111 a = b;

      if (a instanceof A111 a1) a1.a();

    }
}

class A111 {
    void a(){ System.out.println("a"); }
}
class B111 extends A111 {
    void b(){ System.out.println("b"); }
}
class C extends B111 {
    void c(){ System.out.println("c"); }
}


/*
 * Changes:
 * $Log: $
 */