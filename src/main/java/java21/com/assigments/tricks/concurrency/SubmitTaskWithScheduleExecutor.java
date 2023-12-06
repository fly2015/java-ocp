/*
 * SubmitTaskWithScheduleExecutor.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SubmitTaskWithScheduleExecutor
{
    public static void main(String[] args)
    {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.submit(() -> System.out.println(Thread.currentThread().getName()));
        executorService.shutdown();
    }
}



/*
 * Changes:
 * $Log: $
 */