/*
 * TypeParamAndClassNameIsTheSameItReferAsTypeParam.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.generic;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class TypeParamAndClassNameIsTheSameItReferAsTypeParam
{
    public static void main(String[] args)
    {
        X<String> x = new X("String");
        System.out.println(x.getX());
    }
}

class X<X>
{
    //X x1 =new X();
    private X x; //
    public X(X x)
    {
        this.x = x;
    }
    
    X getX()
    {
        return x;
    }
}

/*
 * Changes:
 * $Log: $
 */