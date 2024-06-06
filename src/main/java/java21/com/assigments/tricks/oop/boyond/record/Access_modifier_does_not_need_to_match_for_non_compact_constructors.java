/*
 * access_modifier_does_not_need_to_match_for_non_compact_constructors.java
 *
 * Copyright by Da Nang, Viet Nam
 * Hien Ng
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.record;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Access_modifier_does_not_need_to_match_for_non_compact_constructors
{
    protected record Bee(boolean gender, String species)
    {
        // Bee // must be proteced
       // {
            //this.gender = gender;
           // this.species = species;
      //  }


        Bee(boolean gender)
        {
            this(gender, "Honeybee");
        }


        public String getSpecies()
        {
            return species;
        }


        @Override
        public String toString()
        {
            return species;
        }
    }
}



/*
 * Changes:
 * $Log: $
 */