/*
 * VavidRecord.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.record;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public record ValidRecord(int age)
{
    //static int age =10; //age already declare
    public void setAge(int age)
    {
       // this.age = age; //age is final
    }
    
    @Override
    public int age()
    {
        return this.age;
    }
    
   // @Override
    public int getAge()
    {
        return this.age;
    }
    public static void main(String... arg)
    {
        new ValidRecord(0).age();
    }
    
}



/*
 * Changes:
 * $Log: $
 */