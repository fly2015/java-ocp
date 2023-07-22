# EXCEPTION
	- A method can handle the exception case itself or make it the caller's responsibility
	- Throwable is that it's the parent class of all exceptions
	- Not all of them have the word exception in their class name

## Return Codes Vs. Exceptions

## Checked Exceptions
	- A checked exception is an exception that must be declared or handled by the application code where it is thrown.
	- In Java, checked exceptions all inherit Exception but not RuntimeException
	- Checked exceptions also include any class that inherits Throwable, but not Error or RuntimeException
	- A class that directly extends Throwable would be a checked exception
	
	** The handle or declare rule means that all checked exceptions that could be thrown within a method are either wrapped in compatible try and catch blocks or declared in the method signature.	
	- The throw keyword tells Java that you want to throw an Exception.
	- The throws keyword simply declares that the method might throw an Exception.

## Unchecked Exceptions
	- An unchecked exception is any exception that does NOT need to be declared or handled by the application code where it is
	thrown.
	-  Unchecked exceptions are often referred to as runtime exceptions.
	-  Unchecked exceptions include any class that inherits RuntimeException or Error.
	-  Runtime exceptions tend to be unexpected but not necessarily fatal.
	
## Runtime Vs. At The Time The Program Is Run
	- The alternative is compile time(checked exception)
## Checked Vs. Unchecked (Runtime) Exceptions

## Throwing An Exception
	* Remember that a Throwable is either an Exception or an Error. 
	You should not catch Throwable directly in your code.
	
	- Runtimeexception -> can catch
	
## Runtimeexception Classes
	- They can be thrown by the programmer or by the JVM
	| Class                                                      | Reason                                             |
	| ---------------------------------------------------------- | -------------------------------------------------- |
	| ArithmeticException                                        | devide by 0                                        |
	| ArrayIndexOutOfBoundsException                             | access illegal index                               |
	| ClassCastException                                         | cast object                                        |
	| NullPointerException                                       | manipulate null                                    |
	| IllegalArgumentException                                   | by programmer to tell illegal or invalid agruments |
	| NumberFormatException subclass of IllegalArgumentException | convert string to numeric                          |

## Checked Exception Classes
	IOException -> relate to read/write files
	FileNotFoundException -> sub of IOException when file not found
	
## Error Classes
	- Errors are unchecked exceptions that extend the Error class.
	- They are thrown by the JVM and should not be handled or declared. 
	
	ExceptionInInitializerError 	-> Thrown when a static initializer throws an exception and doesn�t handle it
	StackOverflowError 				-> infinite recursion method call. Full stack of thread
	NoClassDefFoundError			-> a class that the code uses is available at compile time but not runtime
	
	** If one of the static initializers throws an exception, Java can't start using the class.
	
## Handling Exceptions
	- try/catch
	- The try statements are like methods in that the curly braces are
	- required even if there is only one statement inside the code blocks.
	
## Chaining Catch Blocks
	- Only one catch block is run at a time having an exception.
	- Looks at them in the order they appear.
	- Superclass catch block appears before a subclass catch block 	-> compile error tell unreachable catch block.
	- At most one catch block will run, and it will be the first catch block that can handle it.
	
## Multi-catch block
	- A multi-catch block allows multiple exception types to be caught by the same catch block
	- Java intends multi-catch to be used for exceptions that aren't related, and it prevents you from specifying redundant types in a multi-catch.
	- Parent and sub exist together -> compiler tell duplicate exceptions being caught.
	
	- You can't list the same exception type more than once in the same try statement, just like with regular catch blocks.
	- The more general superclasses must be caught after their subclasses

## Finally Block
	- There must be a catch or finally block with try clause
	- If a try statement with a finally block is entered -> the finally block will always be executed
	regardless of whether the code completes successfully
	
	- The finally block is executed shortly before the method completes, it interrupts the return statement from inside both the try and catch blocks
	- You see that while a finally block will always be executed, it may not finish when the code inside finally throw an exception.

## System.Exit()	
	- It takes an integer parameter that represents the error code that gets returned.
	- End the program right now -> The finally will be skipped.

## Finally Closing Resources
	- Memory leaks
	- Resource leak
	- Multiple resources need to be closed in a particular order.
	- Try-with-resources is also known as automatic resource management -> Java automatically takes care of the closing
		
## Implicit Finally Blocks
	- The compiler replaces a try-with resources block with a try and finally block(implicit)	
	- Can still create a programmer-defined finally block when using a try-with-resources statement 
		-> the implicit one will be called first after right end the try block even before an optionl catch block
	 
## Basics of Try-with-Resources	
	- When there are multiple resources opened, they are closed in the reverse order from which they were created.
	- Try-with-resources statement is still allowed to have catch and/or finally blocks
	 
## Autocloseable
	- Java requires classes used in a try-with-resources implement the AutoCloseable interface includes a void close() method
		
## Declaring Resources		
	- try-with-resources statement does not support multiple variable declarations. 
	- Each resource must include the data type and be separated by a semicolon 
	- can use VAR inside try block-resource
		
## Scope of Try-with-Resources
	- The resources created in the try clause are in scope only within the try block
	- the implicit finally runs before any catch/finally blocks that you code yourself		
	
## Following Order of Operation
	- Resources are closed after the try clause ends and before any catch/finally clauses.
	- Resources are closed in the reverse order from which they were created.

## Try-With-Resources Guarantees
	NO.
	- The try-with-resources statement guarantees only the close() method will be called. 
	- If the close() method encounters an exception of its own or the method is implemented poorly, a resource leak can still occur

## Throwing Additional Exceptions
	Calling Methods That Throw Exceptions
	- When you see a checked exception declared inside a catch block on the exam, check and make sure the code in the associated try block is capable of throwing the exception or a subclass of the exception. 
	If not, the code is unreachable and does not compile.
	- Remember that this rule does not extend to unchecked exceptions or exceptions declared in a method signature.

## Declaring And Overriding Methods With Exceptions
	- An overridden method in a subclass is allowed to declare fewer exceptions than the superclass or interface. 
	This is legal because callers are already handling them.
	- A class is allowed to declare a subclass of an exception type
	
## Printing An Exception
	A stack trace
	- It shows the hierarchy of method calls that were made to reach the line that threw the exception.
	- When an exception is thrown, it goes through the stack until it finds a method that can handle it or it runs out of stack.
	
### Remark 
	- Swallowing Exceptions Is Bad
	
	