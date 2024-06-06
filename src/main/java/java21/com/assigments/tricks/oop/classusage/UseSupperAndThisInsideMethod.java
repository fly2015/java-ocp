/*
 * UseSupperInsideMethod.java
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
public class UseSupperAndThisInsideMethod extends ParentDemo
{
    int x = 5;

    void test()
    {
        System.out.println(super.x);
    }
}

class ParentDemo
{
    int x = 10;
}

/*
 * Changes:
 * $Log: $
 */