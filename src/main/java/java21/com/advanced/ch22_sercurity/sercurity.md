# SECURITY
## Designing a Secure Object
### Limiting Accessibility
	- A key security principle is to limit access as much as possible
	- Principle of least privilege
	- Use access control (Methods and Encapsulation)
	- Make private fields
		
### Restricting Extensibility
	- Final prevents any subclasses.
	
## Creating Immutable Objects
	1. Mark the class as final.
	2. Mark all the instance variables private
	3. Don't define any setter methods and make fields final
	4. Don't allow referenced mutable objects to be modified.
	5. Use a constructor to set all properties of the object, making a copy if needed.
	
	- Copy constructor/ defensive copy 
	- Return copy referenced object
	- Using delegate methods to read the data
	
	
## Cloning Objects
	- Cloneable interface with method clone
	Shallow copy: 
    	- Only the top‐level object references and primitives are copied
    	- No new objects from within the cloned object are created
	
	Deep copy:
		- Override the clone() method to make a deep copy
		
		
## Introducing Injection and Input Validation	
	- user input 
	- reading from files
	- retrieving data from a database
	
### Preventing Injection With A Preparedstatement
	- Statement : sql injection
	- PreparedStatement + bind variables
	A PreparedStatement isn't magic.
	It gives you the capability to be safe, but only if you use it properly.
	 
	 
	- SQL injection is often caused by a lack of properly sanitized user input
	 
### Invalidating Invalid Input With Validation 
	- Command injection
	- Use whitelist: that allows us to specify which values are allowed
	
	When validation fails, you can 
	- throw an exception
	- log a message
	- take any other action of your choosing
	
## WHITELIST VS. BLACKLIST
	- The problem with a blacklist is that you have to be cleverer than the bad guys. There are a lot of ways to cause harm.
	
	-  Whitelisting is preferable to blacklisting for security because a whitelist doesn't need to foresee every possible problem.
	Security decisions are often about trading convenience for lower risk.	

## Working with Confidential Information
### Guarding Sensitive Data From Output
	-  To avoid putting confidential information in a toString() method
	Such sensitive contexts include the following:
	- Writing to a log file
	- Printing an exception or stack trace
	- System.out and System.err messages
	- Writing to data files
	
	* It is important to make sure it is being shared only per the requirements.
	
### Protecting Data In Memory
	- If her application crashes, it may generate a dump file. That contains values of everything in memory.
	- When calling the readPassword() on Console, it returns a char[] instead of a String. This is safer for two reasons.
    	+  It is not stored as a String, so Java won't place it in the String pool, where it could exist in memory long after the code that used it is run.
    	- You can null out the value of the array element rather than waiting for the garbage collector to do it.

	* The idea is to have confidential data in memory for as short a time as possible
	
### Limiting File Access
	- Use a security policy to control what the program can access(read/write) defense in depth
	 
## Serializing and Deserializing Objects
	- Java skips calling the constructor when deserializing an object	
	
### Specifying Which Fields To Serialize
	- Transient to prevent field being serialized
	- Specify fields to be serialized in an array.	
	
	* If you go with the array approach, make sure you remember to use the private, static, and final modifiers. 
	Otherwise, the field will be ignored.
	
### Customizing The Serialization Process
	- writeObject()
	- readObject()
	
### Working With Passwords
	- salt (initial random value) and one‐way hashing algorithm	
	
### Pre/Post‐Serialization Processing
	- readResolve(): Replacing the reference of the object returned by deserialization -> run after readObject()	
	- writeReplace(): Allows us to replace the object that gets serialized -> run before writeObject()
	
## Constructing Sensitive Objects
	- When constructing sensitive objects, you need to ensure that subclasses can't change the behavior.	
	- Making Methods Final For Sensitive Method
	In general, you should avoid allowing your constructors to call any methods that a subclass can provide its own implementation for.
	
	- Making Classes Final ->  can't create a malicious subclass to begin
	- Making The Constructor Private
	
	
## How To Protect The Source Code
	- Can decompile your code and get source code security by obscurity.
	
## Preventing Denial of Service Attacks
	DoS -> denial of service
	DDoS	
	
	LEAKING RESOURCES fix 			-> close rc after using
	READING VERY LARGE RESOURCES 	-> check size before process
	INCLUDING POTENTIALLY LARGE RESOURCES
	- Inclusion attack: Any file that you didn't create is suspect
		+ "zip bomb" -> where the file is heavily compressed on disk.
		+ “billion laughs attack”(XML bomb) in the Extensible Markup Language (XML) -> the file gets expanded exponentially
		
	- Includes a script on another website (risk)
		
## Overflowing Numbers
## Wasting Data Structures
	- He creates a class where hashCode() always returns 42 and puts a million of them in
	your map.	
	- Beware of code that attempts to create a very large array or other data structure		
	
## Learning More
	Open Web Application Security Project (OWASP):  Publishes a top 10 list of security issue
	The Cloud Security Alliance (CSA) 
	Please read
	Iron‐Clad Java, Jim Manico and August Detlefsen
	(Oracle Press, 2014)