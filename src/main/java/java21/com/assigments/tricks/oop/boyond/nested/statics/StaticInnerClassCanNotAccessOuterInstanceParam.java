/*
 * StaticInnerClassAccessOuterParam.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.nested.statics;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class StaticInnerClassCanNotAccessOuterInstanceParam
{
    String name ="outer";
    static String staticName ="outer";
    static class InnerTest
    {
        public String getName()
        {
           // return name;
            //doST();
            return staticName;
        }
    }
    
    public void doST()
    {
        
    }
    
    public static void main(String[] args)
    {
        final InnerTest innerTest = new InnerTest();
    }
}



/*
 * Changes:
 * $Log: $
 */