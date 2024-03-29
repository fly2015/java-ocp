ArithmeticException## EXCEPTION
### Exception
	- Checked/unchecked
	- Swallowing an exception -> when handle exception with an empty catch-block
	- throw/throws
	- try-with-resources
	- listing subclass and parent class exception in a multi-catch expression are redundant
	- Ordering of exceptions in consecutive catch blocks matter too.
	
### Custom Exception
	3 ways to construct
	- just extend (Exception for checked, RuntimeException for unchecked)
	- wrap an exception in your exception
	- with custom message
	
### Stack traces
### Automatic resource management

### try-with-resources 
	- statements require resources that implement AutoCloseAble/CloseAble interface
	- implicit finally block
	- can include multiple resources, separating by comma, which are closed in the reserver order in which they are declared
	- resources declared within a try-with-resources are in scope only within the try block.
	
	- could not access resources after it closed
	(Code will compile but throw exception at runtime) -> *TryWithResourceDemoTrick.java*
	
### Using effectively final
	From java 9
		- it is possible to use resources declared prior to the try-with-resources if they are marked final or effectively final
		

### UNDERSTANDING SUPPRESSED EXCEPTIONS (triệt tiêu)
	- When multiple exceptions are thrown, all except the first are called suppressed exceptions. 
	- The idea is that Java treats the first exception as the primary one and tacks on any that come up while automatically closing.
		
	- Java remembers the suppressed exceptions that go with a primary exception even if we don't handle them in the code.
		
	- If more than two resources throw an exception, the first one to be thrown becomes the primary exception, with the rest being grouped as suppressed exceptions. And since resources are closed in reverse order in which they are declared, the primary exception would be on the last declared resource that throws an exception.
		
>Bad practices: Throw an exception in the finally will lose all others exception.