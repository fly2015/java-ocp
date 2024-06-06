/*
 * RecordScopeOfConstructor.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.record;

import java.time.Duration;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class RecordScopeOfConstructor_IMPORTANT
{

}

 record Song(String title, Duration duration) {
     // compact constructor must be the same/broader scope with class
     /*
      * Song
      * {
      * title = title + 1;
      * duration = duration;
      * }
      */

     private Song(String title1)
     {
         this(title1, Duration.ofDays(10));// overload must call this first
     }
    
     // Long constructor can not exist with compact
    public Song(String title, Duration duration) {
        if (title == "")
            throw new IllegalArgumentException();
        this.title = title;
        this.duration = duration;
    }
  }

/*
 * Changes:
 * $Log: $
 */