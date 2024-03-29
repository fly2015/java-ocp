# FUNDAMENTAL
## Working with Enums
	- An enumeration is like a fixed set of constants
	- a top‐level type / nested type

	- it provides type‐safe checking
	- use snake_case

	- an enum is a type of class that mainly contains static members
	- enum values are like static final
		+ enum value is initialized only once in the Java Virtual Machine (JVM)

	- values()	-> the values are listed in the order in which they are declared.
	- valueOf() -> can throws IllegalArgumentException
	
	- Can not extend an enum
	- can use in switch

### Constructors, Fields, And Methods
	- Should mark field as final -> considered immutable
	* Since enum values are shared by all processes in the JVM, it would be problematic if one of them could change the value inside an enum

## Immutable Objects
	- Immutable objects pattern: OP's design that  object cannot be modified after it is created
	- Immutable objects are invaluable in concurrent applications since the state of the object cannot change or be corrupted by a rogue thread (String, Time)
	- All enum constructors are implicitly private (modifier being optional) 
		+ can not extend enum
	-  The first time that we ask for any of the enum values, Java constructs all of the enum values.
> EnumsConstructing.java
	- Can implement an abstract method or default  method.
	- The list of values always be declared first.

## Nested Classes
### Inner class
	- A non‐static type defined at the member level of a class
### Static Nested
	- A static type defined at the member level of a class
### Local class
	- A class defined within a method body
### Anonymous classes
	- A special case of a local class that does not have a name
	
### Remark	
	- encapsulate helper classes by restricting them to the containing class
	- make the code cleaner and easier to read
	*** The term inner or nested class to apply to other Java types, including interfaces and enums
	
	
### Inner Class (member inner class)
	- is a non‐ static type defined at the member level of a class 
	- public, protected, default, private
	- extend any class and implement interfaces
	- marked abstract or final
	- CAN NOT declare static fields or methods -> cos static members are belong to outer class
	- static final fields(constant variable)

> InnerClassDemo.java
> A constant variable is a final variable of primitive type or type String that is initialized with a constant expression.

	- Access members of the outer class including private members
	- Can have the same variable names as outer classes	 
		+ There is a special way of calling this to say which variable you want to access

> AccessSameNameVariableUsingThis.java

	- Can declare abstract access modifier and mark final
	- Can not access instance of the inner without an instance of enclosing class
	 
### Static Nested Class
	- is a static type defined at the member level of a class
	same top level except: 
	- can be instantiated without an instance of the enclosing class <******* 10 stars>
	- can't access instance variables or methods in the outer class directly
		-> can be done but requires an explicit reference to an outer class variable
	
	- creates a namespace because the enclosing class name must be used to refer to it.
	- can be made private or use one of the other access modifiers
	- The enclosing class can refer to the fields and methods of the static nested class via enclosing nameSpace.
> StaticInnerClassDemo.java
	- can declare abstract access modifier and mark final
	 
### Local Class
	- is a nested class defined within a method
	- it goes out of scope when the method returns	
	- instances can still be returned from the method
	- can be declared inside constructor and initializers

	- do not have an access modifier.
	- cannot be declared static
	- cannot declare static fields or methods

	- Can have static final fields
	- can declare abstract access modifier and mark final

	- access to all fields and methods of the enclosing class (when defined in an instance method)
	- can access local variables if the variables are final or effectively final.

> ** The compiler is generating a .class file from your local class. A separate class has no way to refer to local variables. 
If the local variable is final, Java can handle it by passing it to the constructor of the local class or by storing it in
the .class file. If it weren't effectively final, these tricks wouldn't work because the value could change after the copy
was made.
		
### Anonymous Class
	- anonymous class is a specialized form of a local class that does not have a name. 	
	- It is declared and instantiated all in one statement using the new keyword, a type name with parentheses, and a set of braces {}. 
	Anonymous classes are required to extend an existing class or implement an existing interface
	- CAN NOT implement both an interface and extend a class
		(unless the class to extend is java.lang.Object -> dont count in the rule)
		
	- define them right where they are needed, even if that is an argument to another method
	- can even define anonymous classes outside a method body

## Interface Methods
### Default Interface Method
	- A default method is a method defined in an interface with the default keyword and includes a method body
	- A default method may be overridden by a class implementing the interface.
	 backward compatibility/convenience
	 
	Rules:
	1. A default method may be declared only within an interface.
	2. A default method must be marked with the default keyword and include a method body.
	3. A default method is assumed to be public.
	4. A default method cannot be marked abstract, final, or static.
	5. A default method may be overridden by a class that implements the interface.
	6. If a class inherits two or more default methods with the same method signature, then the class must override the method.
	 	
### Calling a Hidden default Method	
> DefaultMethodDemo.java
	 	
### Static Interface Method 
	1. A static method must be marked with the static keyword and include a method body.
	2. A static method without an access modifier is assumed to be public.
	3. A static method cannot be marked abstract or final.
	4. A static method is not inherited and cannot be accessed in a class implementing the interface without a reference to the interface name.
	5. The static interface methods are not inherited by a class implementing the interface.	
	
### Private Interface Methods
	1. A private interface method must be marked with the private modifier and include a method body.
	2. A private interface method may be called only by default and private (non‐ static) methods within the interface definition.


### Private Static Interface Methods
	1. A private static method must be marked with the private and static modifiers and include a method body.
	1. A private static interface method may be called only by other methods within the interface definition.
	
## Functional Programming
	- A functional interface is an interface that contains a single abstract method (SAM)
	- A lambda expression is a block of code that gets passed around, sort of like an anonymous class that defines one method.
	
### Declaring A Functional Interface With Object Methods
	-  If a functional interface includes an abstract method with the
	same signature as a public method found in Object, then those lmethods do not count toward the single abstract method test
		
### Implementing Functional Interfaces With Lambdas
	- Any functional interface can be implemented as a lambda expression
	- Lambda expressions rely on the notion of deferred execution. Deferred execution means that code is specified now but runs later

## Lambda Expressions	
### Writing Lambda Expressions
	- 	The left side of the lambda expression lists the variables		
	It must be compatible with the type and number of input parameters of the functional interface's single abstract method.
		
	- The right side of the lambda expression represents the body of the expression. 
	It must be compatible with the return type of the functional interface's abstract method
	
	- The parentheses can be omitted only if there is a single parameter and its type is not explicitly stated.
	- Java doesn't require you to type return or use a semicolon when no braces are used
	This special shortcut doesn't work when we have two or more statements
	
	-  If the parameter type is specified for one of the parameters, then it must be specified for all of them.
	
### Working With Lambda Variables
	- the parameter list
	- local variables declared inside the lambda body
	- variables referenced from the lambda body.

	- A lambda infers the types from the surrounding context

### Restrictions on using var in the Parameter List
	- If var is used for one of the types in the parameter list, then it must be used for all parameters in
	the list
	
### Local Variables Inside the Lambda Body
	- Java doesn't let you create a local variable with the same name as one already declared in that scope
	- Beware -> have to look for missing semicolons at end of lamdas declaration.

### Variables Referenced from the Lambda Body
	- Lambda bodies are allowed to use static variables, instance variables, and local variables if they are final or effectively
	final	
	
	
	