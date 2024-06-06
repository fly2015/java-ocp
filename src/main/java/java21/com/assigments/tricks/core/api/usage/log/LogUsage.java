/*
 * LogUsage.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.api.usage.log;

import java.lang.System.Logger;
import java.util.logging.LogManager;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class LogUsage
{
    private final static java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LogUsage.class.getName());
    public static void main(String[] args)
    {
        logger.info("Text");
        logger.warning("Text warning");
    }
}



/*
 * Changes:
 * $Log: $
 */