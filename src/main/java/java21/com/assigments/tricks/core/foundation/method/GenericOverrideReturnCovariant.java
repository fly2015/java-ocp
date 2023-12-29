/*
 * GenericOverride.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.foundation.method;

import java.util.List;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class GenericOverrideReturnCovariant
{
    //The method header signature of the corresponding methods is the same after erasure—that is, List fuddle() and List scuddle(Object).
    // The return type of overriding methods can be a raw type or a parameterized type.
}

 class SupA<T> {
    public List<?> fuddle() { return null; }
    public List scuddle(T t) { return null; }
  }
   class SubB<U> extends SupA<U> {
    @Override
    public List fuddle() { return null;}
    @Override
    public List<Exception> scuddle(U t) { return null; }
  }

class SubC<V> extends SupA<V> {
    @Override
    public List<V> fuddle() { return null;}
    
    @Override
    public List<? extends Object> scuddle(V t) { return null; }
}
/*
 * Changes:
 * $Log: $
 */