/*
 * EnumComparable.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.boyond.enums;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class EnumComparable
{
    enum FrequentFlyer {
        PLATINUM(20), GOLD(10), SILVER(5), BASIC(0);
        private double extra;

        FrequentFlyer(double extra) {
          this.extra = extra;
        }

        public static FrequentFlyer max(FrequentFlyer c1, FrequentFlyer c2) {
          return c1.compareTo(c2) < 0 ? c2 : c1;
        }

        public static FrequentFlyer max2(FrequentFlyer c1, FrequentFlyer c2) {
          return c1.extra < c2.extra ? c2 : c1;
        }

        public static void main (String[] args) {
          System.out.println(GOLD.ordinal() > SILVER.ordinal());//False
          System.out.println(max(GOLD, SILVER)); // SILVER
          System.out.println(max2(GOLD, SILVER));// GOLD
        }
      }
    
    public static void main(String[] args)
    {
        FrequentFlyer.main(args);
    }
}
 


/*
 * Changes:
 * $Log: $
 */