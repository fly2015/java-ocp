/*
 * DefenceInDepth.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.foundation.block.package_management.p2;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class DefenceInDepth
{
    public enum March {LEFT, RIGHT;                 // (2)
        public String toString() {
          return "Static enum";
        }
      }
      public enum Military { INFANTRY, AIRFORCE;
        public static enum March {LEFT, RIGHT;        // (3)
          public String toString() {
            return "Statically nested enum";
          }
        }
      }
}



/*
 * Changes:
 * $Log: $
 */