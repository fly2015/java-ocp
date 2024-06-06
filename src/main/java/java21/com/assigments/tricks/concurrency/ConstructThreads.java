/*
 * ConstructThreads.java
 *
 * Hien Ng
 * Da Nang, Viet Nam
 * All rights reserved.
 */
package java21.com.assigments.tricks.concurrency;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class ConstructThreads
{
    public static void main(String[] args)
    {
        Thread thread1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println(Thread.currentThread().getName() +  " Do it");
                
            }
        });
        
        thread1.start();
        
        
        Thread thread2 = new Thread(() -> System.out.println(Thread.currentThread().getName() + " Do it"));
        thread2.start();
        
        
        class Thread3 extends Thread
        {
            @Override
            public void run()
            {
                System.out.println(Thread.currentThread().getName() +  " Do it");
            }
        }
        
        new Thread3().start();
    }
}



/*
 * Changes:
 * $Log: $
 */