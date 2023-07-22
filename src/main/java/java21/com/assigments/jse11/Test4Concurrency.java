/*
 * Test4Concurrency.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package java21.com.assigments.jse11;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class Test4Concurrency
{
    public static void main(String[] args) throws InterruptedException
    {
        AtomicLong value1 = new AtomicLong(0);
        final long[] value2 = {0};
        IntStream.iterate(1, i -> 1).limit(100).parallel().forEach(i -> value1.incrementAndGet());
        IntStream.iterate(1, i -> 1).limit(100).parallel().forEach(i -> ++value2[0]);
        System.out.println(value1 + " " + value2[0]);
        
        //Predicate<AtomicLong> p = (p1) -> p1.incrementAndGet();
        
        
        System.out.print(List.of("duck","flamingo","pelican")
                         .parallelStream().parallel() // q1
                         .reduce(0,
                         (c1, c2) -> c1 + c2.length(), // q2
                         (s1, s2) -> s1 + s2)); // q3
        
        
        
        System.out.println("----------------");
        var cats = Stream.of("leopard", "lynx", "ocelot", "puma").parallel();
        var bears = Stream.of("panda", "grizzly", "polar").parallel();
        
        Stream<Stream<String>> of = Stream.of(cats, bears);
        Stream<String> flatMap = of.flatMap(s -> s);
        ConcurrentMap<Boolean, List<String>> data = flatMap.collect(Collectors.groupingByConcurrent(s -> !s.startsWith("p")));
        
        System.out.println(data.get(false).size() + " " + data.get(true).size());
        
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

        queue.offer(103);
        queue.offer(20, 1, TimeUnit.SECONDS);
        queue.offer(85, 7, TimeUnit.HOURS);
        System.out.print(queue.poll(200, TimeUnit.NANOSECONDS));
        System.out.print(" " + queue.poll(1, TimeUnit.MINUTES));
        
        
        
        var s = Executors.newScheduledThreadPool(10);
        DoubleStream.of(3.14159, 2.71828) // b1
                    .forEach(c -> s.submit( // b2
                                           () -> System.out.println(10 * c))); // b3
        
        
        s.execute(() -> System.out.println("Printed"));
        // b4
        
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
        
        var r = new ArrayList<Future<?>>();
        r.add(new Future<String>()
        {

            @Override
            public boolean cancel(boolean mayInterruptIfRunning)
            {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public boolean isCancelled()
            {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public boolean isDone()
            {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public String get() throws InterruptedException, ExecutionException
            {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public String get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException
            {
                // TODO Auto-generated method stub
                return null;
            }});
        r.add(new Future<Integer>()
        {

            @Override
            public boolean cancel(boolean mayInterruptIfRunning)
            {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public boolean isCancelled()
            {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public boolean isDone()
            {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public Integer get() throws InterruptedException, ExecutionException
            {
                // TODO Auto-generated method stub
                return null;
            }

            @Override
            public Integer get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException
            {
                // TODO Auto-generated method stub
                return null;
            }});
    }
}


class Flavors
{
    private static int counter;

    public static void countIceCreamFlavors()
    {
        counter = 0;
        
        Runnable task = () -> counter++;
        LongStream.range(1, 500).forEach(m -> new Thread(task).run());
        System.out.println(counter);
    }
}





/*
 * Changes:
 * $Log: $
 */