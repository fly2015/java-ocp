/*
 * ReferenceTypeToInnerClassWithoutImport.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.nested.inner;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ReferenceTypeToInnerClassWithoutImport
{
    class Inner1
    {
        class Inner2{}
        static class Inner4{}
    }
    
    static class Inner3{}
    public static void main(String[] args)
    {
        Inner1 inner1 = new ReferenceTypeToInnerClassWithoutImport().new Inner1();
        ReferenceTypeToInnerClassWithoutImport.Inner1 inner12 = new ReferenceTypeToInnerClassWithoutImport().new Inner1();//Outer ref type is optional
        
        Inner1.Inner2 inner2 = new ReferenceTypeToInnerClassWithoutImport().new Inner1().new Inner2();
        ReferenceTypeToInnerClassWithoutImport.Inner1.Inner2 inner21 = new ReferenceTypeToInnerClassWithoutImport().new Inner1().new Inner2();//Outer ref type is optional
        
        Inner3 inner3 = new Inner3();
        Inner3 inner31 = new ReferenceTypeToInnerClassWithoutImport.Inner3();//Outer class is optional
        
        Inner1.Inner4 inner4 = new Inner1.Inner4();
    }
}



/*
 * Changes:
 * $Log: $
 */