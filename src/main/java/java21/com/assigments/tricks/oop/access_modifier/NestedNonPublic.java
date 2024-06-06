/*
 * NestedNonPublic.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.oop.access_modifier;


/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class NestedNonPublic
{
    class Diet
    {
        private String getFavoritePrivate()
        {
            return "";
        }
        
        String getFavoriteProtected()
        {
            return "";
        }
    }
    
    protected class Diet1
    {
        /**
         * Constructor
         *
         */
        public Diet1()
        {
            // TODO Auto-generated constructor stub
        }

        private String getFavoritePrivate()
        {
            return "";
        }
        
        protected String getFavoriteProtected()
        {
            return "";
        }
    }
    
    
    public class Diet2
    {
        private String getFavoritePrivate()
        {
            return "";
        }
        
        protected String getFavoriteProtected()
        {
            return "";
        }
    }
}



/*
 * Changes:
 * $Log: $
 */