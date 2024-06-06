/*
 * Instance_of_a_class_is_also_an_instance_its_superclasses.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.inheritance;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Instance_of_a_class_is_also_an_instance_its_superclasses
{
    public static void main(String[] args)
    {
        // B vs D norelation
        BB obj = new BB();
        if (obj instanceof AA && !(obj instanceof CC))
        {
            
        }
        
        
        //A vs D has relation
        AA obj1 = new BB();
        DD b = (DD)obj1;// class cast exception
    }
    
}

class AA {}
class BB extends AA {}
class CC extends BB {}
class DD extends AA {}

/*
 * Changes:
 * $Log: $
 */