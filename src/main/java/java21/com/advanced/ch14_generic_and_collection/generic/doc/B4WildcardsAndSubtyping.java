/*
 * B4WildcardsAndSubtyping.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.advanced.ch14_generic_and_collection.generic.doc;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class B4WildcardsAndSubtyping
{
    public static void main(String[] args)
    {
        List<?> lAny = new ArrayList<>();
        lAny.add(null);// only add null with ? wildcard
        
        List<Number> lNumberAlone = new ArrayList<Number>();
        lNumberAlone.add(null);
        List<Integer> lIntegerAlone = new ArrayList<Integer>();
        
        List<Object> lObject1 = new ArrayList<Object>();
        
        // upper bound
        List<? extends Number> lNumberUpper = new ArrayList<Number>();
        lNumberUpper.add(null);
        List<? extends Integer> lIntegerUpper = new ArrayList<Integer>();
        lIntegerUpper.add(null);
        
        lAny = lNumberUpper;
        lAny = lNumberAlone;
        lAny = lIntegerUpper;
        lAny = lIntegerAlone;
        lAny = lObject1;
        
        lNumberUpper = lNumberAlone; 
        lNumberUpper = lIntegerUpper;
        lNumberUpper = lIntegerAlone;

        lIntegerUpper = lIntegerAlone; 
        
        // lower bound
        List<Object> lObject = new ArrayList<Object>();
        List<? super Integer> lIntegerSupper = new ArrayList<Integer>();
        lIntegerSupper.add(10_00); //tricky can only add lowest
        
        List<? super Number> lNumberSupper = new ArrayList<Number>();
        lNumberSupper.add(new Double(10.00)); //tricky can only add lowest
        
        lAny = lIntegerSupper;
        lAny = lNumberSupper;
        lIntegerSupper = lNumberSupper;
        lIntegerSupper = lNumberAlone;
        lIntegerSupper = lIntegerAlone;
        lNumberSupper = lNumberAlone;
        lIntegerSupper = lObject;
        lNumberSupper = lObject;

        // more example
        List<? extends A> lAUpper = new ArrayList<A>();
        List<A> lAAlone = new ArrayList<A>();
        
        lAUpper = lAAlone;
        //lAAlone = lAUpper; DO NOT COMPILE
    }
    
    class A {
        
    }
    
    class B extends A
    {
        
    }
}



/*
 * Changes:
 * $Log: $
 */