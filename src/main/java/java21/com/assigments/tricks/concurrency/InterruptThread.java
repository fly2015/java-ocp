/*
 * InterruptThread.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class InterruptThread
{
    public static void main(String[] args)
    {
        Thread currentThread = Thread.currentThread();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++)
        {
            newFixedThreadPool.submit(() -> {System.out.println("Running"); currentThread.interrupt();});
        }
        try
        {
            Thread.sleep(50000);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
           // e.printStackTrace();
        }
        System.out.println("Done");
    }
}



/*
 * Changes:
 * $Log: $
 */