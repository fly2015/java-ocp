/*
 * RantrantLockMethodDoesNotTakeATimeParam.java
 *
 * Copyright by Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class RantrantLockMethodDoesNotTakeATimeParam
{
    private ReentrantLock reentrantLock = new ReentrantLock();
    private static int count = 0;
    
    public static void main(String[] args)
    {
        RantrantLockMethodDoesNotTakeATimeParam instance1 = new RantrantLockMethodDoesNotTakeATimeParam();
        RantrantLockMethodDoesNotTakeATimeParam instance2 = new RantrantLockMethodDoesNotTakeATimeParam();
        
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++)
        {
            executorService.execute(() -> RantrantLockMethodDoesNotTakeATimeParam.performCount(instance1));
            executorService.execute(() -> RantrantLockMethodDoesNotTakeATimeParam.performCount(instance2));
        }
        
        executorService.shutdown();
        while (!executorService.isTerminated())
        {
            System.out.println("Running");
        }
        
        System.out.println(RantrantLockMethodDoesNotTakeATimeParam.count);
    }
    
    public static void performCount(RantrantLockMethodDoesNotTakeATimeParam instance)
    {
        // The Critical Section here does not handle the lock correctly, since the count are lock by diff instances.
        // Intended to do that for demo.
        try
        {
            instance.reentrantLock.lock();
            count++;
        }
        finally
        {
            instance.reentrantLock.unlock();
        }
    }
}



/*
 * Changes:
 * $Log: $
 */