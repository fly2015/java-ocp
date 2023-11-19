/*
 * ScheduledExecutorAtFixRateHave4Params.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ScheduledExecutorAtFixRateHave4Params
{
    public static void main(String[] args) throws InterruptedException
    {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(() -> System.out.println("Running"), 1, 1, TimeUnit.SECONDS);
        
        Thread.sleep(10000);
        scheduledExecutorService.shutdown();
        System.out.println("Is ScheduledExecutorService shutdown: " + scheduledExecutorService.isShutdown());
    }
}



/*
 * Changes:
 * $Log: $
 */