/*
 * ScheduleExecutorsUsage.java
 *
 * Copyright by Da Nang, Viet Nam
 * Hien Ng
 * All rights reserved.
 */
package java21.com.assigments.tricks.core.api.usage.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ScheduleExecutorsUsage
{
    public static void main(String[] args)
    {
        final ScheduledExecutorService shExecutorService = Executors.newSingleThreadScheduledExecutor();
        shExecutorService.scheduleWithFixedDelay(() -> System.out.println("Done"), 5, 2, TimeUnit.SECONDS);
        //shExecutorService.shutdown();
    }
}



/*
 * Changes:
 * $Log: $
 */