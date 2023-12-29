/*
 * SwitchWithThisKeyWordEnum.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.foundation.decision;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SwitchWithThisKeyWordEnum
{
    
}
 enum Scale5 {
    GOOD, BETTER, BEST;

    public char getGrade() {
      return switch (this) {
        case GOOD   -> 'C';
        case BETTER -> 'B';
        case BEST   -> 'A';
      };
    }

    public static void main (String[] args) {
      System.out.println(GOOD.getGrade());
    }
  }


/*
 * Changes:
 * $Log: $
 */