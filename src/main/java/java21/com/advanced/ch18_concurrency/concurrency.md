## Introducing Threads
	- A "thread" is the smallest unit of execution that can be scheduled by the operating system
	- A "process" is a group of associated threads that execute in the same shared environment
	* "single-threaded process" is one that contains exactly one thread
	* a "multithreaded process" supports more than one thread.
	
	- "shared environment": we mean that the threads in the same process share the same memory space and can communicate directly with one another.
	
	- A "task" is a single unit of work performed by a thread
	- A thread can complete multiple independent tasks but only one task at a time.
	
## Creating a Thread
	-  Provide a Runnable object or lambda expression to the Thread constructor, then call start method of the Thread
	-  Create a class that extends Thread and overrides the run() method
	
	* Order of thread execution is not often guaranteed
	* Calling run() on a Thread or a Runnable does not start a new thread it will be executed in sequence.
	
### Distinguishing Thread Types
	- A "system thread" is created by the Java Virtual Machine (JVM) and runs in the background of the application
	- A "user-defined thread" is one created by the application developer to accomplish a specific task
	For simplicity, we commonly refer to programs that contain only a single user-defined thread as single-threaded
	applications.
	- A "daemon thread" is one that will not prevent the JVM from exiting when the program finishes
	A Java application terminates when the only threads that are running are daemon threads.
	
### Managing a Thread's Life Cycle
	States:
	NEW 							-> Created but not started yet.
	RUNNABLE 						-> As soon as start() is called, the thread may be running, may not be.
									The RUNNABLE state just means the thread is able to be run.		
	TERMINATED	             		-> Once the work for the thread is completed or an uncaught exception is thrown, and no more work is performed
	BLOCKED/WAITING/TIMED WAITING 	-> transitions between thread states and RUNNABLE
	
	notifyAll() -> WAITING 			-> RUNNABLE
	interrupt() -> TIMED WAITING 	-> RUNNABLE
	wait()		-> X
	notify()	-> X
	join()     	-> X
	
### Polling with Sleep
#### Interrupting a Thread
> ThreadPolling.java
	
	- Calling interrupt() on a thread in the TIMED_WAITING or WAITING state causes the main() thread to become RUNNABLE again, triggering an InterruptedException. 
	The thread may also move to a BLOCKED state if it needs to re-acquire resources when it wakes up.
	
	- Calling interrupt() on a thread already in a RUNNABLE state doesn't change the state.
	In fact, it only changes the behavior if the thread is periodically checking the Thread.isInterrupted() value state
	
### Creating Threads with the Concurrency API
	- Obtain an instance of an ExecutorService interface
	- Send the service tasks to be processed
	* thread pooling/scheduling
	
### Shutting Down a Thread Executor
	- A thread executor creates a non-daemon thread on the first task that is executed, so failing to call shutdown() will result in your application never terminating.
	Process:
	- First rejecting any new tasks submitted to the thread executor while continuing to execute any previously submitted tasks.
	- If a new task is submitted to the thread executor while it is shutting down,
	a RejectedExecutionException will be thrown
	- shutdown() does not stop any tasks that have already been submitted to the thread executor.
	- shutdownNow(), which attempts to stop all running tasks -> It is not guaranteed to succeed -> cos it is possible create thread which never terminate
	
### Submitting Tasks
	execute()  -> take a Runnable -> return void "fire-and-forget"
	submit ()  -> take a Callable -> return Future
	
### Waiting for Results
	- the get() method always returns null when working with Runnable expressions
	
## Introducing Callable
### Waiting for All Tasks to Finish
> WaitingAllTaskFinishDemo.java
	- service.awaitTermination(1, TimeUnit.MINUTES);
	- service.isTerminated()
	
### Scheduling Tasks
	- Use ScheduledExecutorService
	- Schedule
#### scheduleAtFixedRate (1) 
	- Method is useful for tasks that need to be run at specific intervals
	* Bad things can happen with scheduleAtFixedRate() if each task onsistently takes longer to run than the execution interval
#### scheduleWithFixedDelay(2)
	- the scheduleWithFixedDelay() method creates a new task only after the previous task has finished
	The scheduleWithFixedDelay() method is useful for processes that you want to happen repeatedly but whose specific time is unimportant.
	
	(1)(2) The difference is related to the timing of the process and when the next
	task starts.
> SchedulingTasksDemo.java	
	
	*** While these tasks are scheduled in the future, the actual execution may be delayed. 
	For example, there may be no threads available to perform the tasks, at which point they will just wait in the queue. 
	Also, if the ScheduledExecutorService is shut down by the time the scheduled task execution time is reached, then these tasks will be discarded
	
### Increasing Concurrency with Pools
	A "thread pool" is a group of pre-instantiated reusable threads that are available to perform a set of arbitrary tasks.
	
### Writing Thread-Safe Code
	- Thread-safety is the property of an object that guarantees safe execution by multiple threads at the same time. Since threads run in a shared environment and memory space, how do we prevent two threads from interfering with each other? 
	We must organize access to data so that we don't end up with invalid or unexpected results.
	
	- How to use a variety of techniques to protect data
    	+ atomic classes
    	+ synchronized blocks
    	+ the Lock framework
    	+ cyclic barriers
	
### Understanding Thread-Safety	
	- "a race condition" -> the unexpected result of two tasks executing at the same time is referred to as a race condition.
	
### Accessing Data with volatile
	- The volatile attribute ensures that only one thread is modifying a variable at one time(visibility not atomicity) and that data read among multiple threads is consistent.

### Protecting Data with Atomic Classes
	- Atomic is the property of an operation to be carried out as a single unit of execution
	without any interference from another thread.
	- Any thread trying to access the "shared" variable while an atomic operation is in process 
	will have to wait until the atomic operation on the variable is complete.
> CountUsingAtomic.java
	
### Improving Access with synchronized Blocks
	- The most common technique is to use a monitor to synchronize access. 
	A monitor, also called a lock, is a structure that supports mutual exclusion
	***
	To synchronize access across multiple threads, each thread must have access to the same Object. 
	If each thread synchronizes on different objects, the code is not thread-safe.
> CountUsingSynchronizatiInDifferentObject.java
	
	Each thread that arrives will first check if any threads are already running the block. 
	If the lock is not available, the thread will transition to a BLOCKED state until it can acquire the lock.
	If the lock is available (or the thread already holds the lock), the single thread will enter the block,preventing all other threads from entering. 
	Once the thread finishes executing the block, it will release the lock, allowing one of the waiting threads to proceed.

### Synchronizing on Methods
	- can user for both static & instance method

## Understanding the Lock Framework
### Applying a ReentrantLock
	- Each thread then calls lock() before it enters the protected code and calls unlock() before it exits the protected code.
	- The ReentrantLock class is a simple monitor that implements the Lock interface and supports mutual exclusion
	
	*** While certainly not required, it is a good practice to use a try/finally block with Lock instances.
	Doing so ensures that any acquired locks are properly released.
	
	- The ReentrantLock class ensures that once a thread has called lock() and obtained the lock, all other threads that call lock() will wait until the first thread calls unlock()
	
	- Have constructor to set "fairness" = true 
    	+ The lock will usually be granted to each thread in the order in which it was requested
		+ It is false by default when using the no-argument constructor
	- You should enable fairness only when ordering is absolutely required, as it could lead to a significant slowdown.											
	
	- Making sure to release a lock
	- Need to be sure that you only release a lock that you have -> // IllegalMonitorStateException

### Attempting to Acquire a Lock
	- Problem same synchronize block: A thread could end up waiting forever to obtain a lock
	* Two additional methods that make the Lock interface a lot safer to use than a synchronized block
    	- boolean tryLock()
			+ Requests lock and returns immediately. 
    		+ Returns boolean indicating whether lock was successfully acquired.

		-  boolean tryLock(long timeout, TimeUnit unit)
			+ Requests lock and blocks for specified time or until lock is acquired.
			+ Returns boolean indicating whether lock was successfully acquired
		 
### Acquiring the Same Lock Twice
	- The ReentrantLock class maintains a counter of the number of times a lock has been successfully granted to a thread. 
	To release the lock for other threads to use, unlock() must be called the same number of times the lock was granted
	
	** It is critical that you release a lock the same number of times it is acquired! 
	For calls with tryLock(), you need to call unlock() only if the method returned true.

### Reviewing the Lock Framework
	- Improvement compare to Synchronization block
		+ Ability to request a lock without blocking. (tryBlock)
		+ Ability to request a lock while blocking for a specified amount of time. (tryBlock with timeout)
		+ A lock can be created with a fairness property, in which the lock is granted to threads in
		the order in which it was requested.(create instance with fairness = true)	
		
### ReentrantReadWriteLock	
	While not on the exam, ReentrantReadWriteLock is a really useful class.
	It includes separate locks for reading and writing data and is useful on data structures where reads are far more common than writes.
	For example, if you have a thousand threads reading data but only one thread writing data, this class can help you maximize concurrent access.	

### Orchestrating Tasks with a CyclicBarrier
	- The CyclicBarrier takes in its constructors a limit value, indicating the number of threads to wait for. 
	As each thread finishes, it calls the await() method on the cyclic barrier. 
	Once the specified number of threads have each called await(), the barrier is released, and all threads can continue.
	
	- CyclicBarriers are useful in programs involving a fixed sized party of threads that must occasionally wait for each other. 
	The barrier is called cyclic because it can be re-used after the waiting threads are released.
	
### Using Concurrent Collections
#### Understanding Memory Consistency Errors
	- A "memory consistency error" occurs when two threads have inconsistent views of what should be the same data.
	
	- The concurrent classes were created to help avoid common issues in which multiple threads are adding and removing objects from the same collections
>ConcurrentHashMap	

### Working with Concurrent Classes
	- You should use a concurrent collection class any time you have multiple threads modify a
	collection outside a synchronized block or method	
	- conccurent_collection_classes.png
	
> CopyOnWriteArrayListDemo.java
	*** These classes create a copy of the collection any time a reference is added, removed, or
	changed in the collection and then update the original collection reference to point to the copy.
	- These classes are commonly used to ensure an iterator doesnt see modifications to the collection

### Obtaining Synchronized Collections
	- They operate on the inputted collection and return a reference that is the same type as the underlying collection.
	If you're writing code to create a collection and it requires synchronization -> concurrent collections
	If you are passed a nonconcurrent collection and need synchronization, use the synchronized collections


## Identifying Threading Problems
### Understanding Liveness
	- Liveness is the ability of an application to be able to execute in a timely manner(kip thoi)
	Liveness problems, then, are those in which the application becomes unresponsive or is in some kind
	of stuck state.
	- More precisely, liveness problems are often the result of a thread entering
	a BLOCKING or WAITING state forever, or repeatedly entering/exiting these states
	
*** There are three types of liveness issues with which you should be familiar: 
### Deadlock
	- Deadlock occurs when two or more threads are blocked forever, each waiting on the other.
	- Both participants are permanently blocked, waiting on resources that will never become available.
> ToyExchangeDeadLockDemo.java	
	
### Starvation
	Starvation occurs when a single thread is perpetually denied access to a shared resource
	or lock. The thread is still active, but it is unable to complete its work as a result of other
	threads constantly taking the resource that it is trying to access.
> ToyPlayingStarvationDemo.java	
	
### Livelock
	Livelock occurs when two or more threads are conceptually blocked forever, although they
	are each still active and trying to complete their task. Livelock is a special case of resource
	starvation in which two or more threads actively try to acquire a set of locks, are unable to
	do so, and restart part of the process.
	- Waiting each others to access to the same resource
> ToyHoldingLiveLock.java	

### Managing Race Conditions
	- A "race condition" is an undesirable result that occurs when two tasks that should be completed sequentially are completed at the same time.
	- That race conditions lead to invalid data if they are not properly handled

## Working with Parallel Streams
	-  A "serial stream" is a stream in which the results are ordered, with only one entry being processed at a time.	
	- A parallel stream is capable of processing results concurrently, using multiple threads
	
	*** The number of threads available in a parallel stream is proportional to the number of available CPUs in your environment.
	
### Creating Parallel Streams
	- The Stream interface includes a method isParallel() that can be used to test whether the instance of a stream supports parallel processing.
	
### Performing a Parallel Decomposition(Phan giai)
	- A "parallel decomposition" is the process of taking a task, breaking it into smaller pieces that can be performed concurrently, and then reassembling the results.
> ParallelDecompositionDemo.java
	
### Processing Parallel Reductions
### Performing Order-Based Tasks
	- findAny():  neither the serial nor the parallel stream is guaranteed to return the first value.
	- findFirst(), limit(), and skip(): Order is still preserved, but performance may "suffer" on a parallel stream as a result of a parallel processing task being forced to coordinate all of its threads in a synchronized-like fashion.

### Creating Unordered Streams
	- All of the streams you have been working with are considered ordered by default.
	It is possible to create an unordered stream from an ordered stream
	- unordered(): it just tells the JVM that if an order-based stream operation is applied, the order can be ignored
	For serial streams, using an unordered version has no effect. But on parallel streams, the results can greatly improve performance.
	
	** Should know when to apply an unordered stream to improve performance
	
### Combining Results with reduce()
	- On parallel streams, the reduce() method works by applying the reduction to pairs of elements within the stream to create intermediate values and then combining those intermediate values to produce a final result	
> ParallelStreamCombiningResultWithReduce.java
	
	-  Have to be concerned about order simple rule: Make sure that the accumulator and combiner produce the same result regardless of the order they are called in.
	- Notice identity parameter that is not truly an identity value.
	
### Combining Results with collect()
> ParallelCombiningResultsWithCollect.java	
	
### Performing a Parallel Reduction on a Collector
	- Requirements for Parallel Reduction with collect()
    	+ The stream is parallel.
    	+ The parameter of the collect() operation has the [Characteristics.CONCURRENT] characteristic.
		+ Either the stream is unordered or the collector has the characteristic [Characteristics.UNORDERED]
		
	** The Collectors class includes two sets of static methods for retrieving collectors
		+ toConcurrentMap()
		+ groupingByConcurrent()
	* Both of which are UNORDERED and CONCURRENT.	
	
	
## Avoiding Stateful Streams
	- "A stateful lambda expression" is one whose result depends on any state that might change during the execution of a pipeline.
> AvoidParallelStatefulStreams.java