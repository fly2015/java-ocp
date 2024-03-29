# SEALED
## Sealing Classes
	- A sealed class is a class that restricts which other classes may directly extend it. 
	These are brand new to Java 17
	
	*** A sealed class MUST/optionally declares a list of classes that can extend it WHILE the subclasses MUST declare that they extend the sealed class.

## Sealed Class Keywords	
#### sealed
	- Indicates that a class or interface may only be extended/implemented by named classes or interfaces.
#### permits
	-  Used with the sealed keyword to list the classes and interfaces allowed 
#### non-sealed
	- Applied to a class or interface that extends a sealed class, indicating that itcan be extended by unspecified classes.

## Example
> **SealedClassDemo.java**

	*** Sealed classes are commonly declared with the abstract modifier, although this is certainly not required.
	
## Compiling Sealed Classes
	- The answer is that a sealed class needs to be declared (and compiled) in the same package as its direct subclasses.
	- Named modules, which allow sealed classes and their direct subclasses in different packages, provided they are in the same named module.
	
## Specifying the Subclass Modifier
	- Every class that directly extends a sealed class must specify exactly one of the following three modifiers: final, sealed, or non-sealed
	- A final Subclass -> prevents the subclass from being extended further.
	- A sealed Subclass ->  support transitive permit, allow expand sealed chain.
	- A non-sealed Subclass -> to open a sealed parent class to potentially unknown subclasses.
	
## Omitting the permits Clause
	- The permits clause is optional if
    	+ Nested inside of the sealed class -> optional
    	+ In the same file as the sealed class -> optional
	- In a different file from the sealed class -> required 
	
## Sealing Interfaces
	- The sealed interface must appear in the same package or named module as the classes or interfaces that directly extend or implement it
	
	- A sealed interface can only be marked sealed or non-sealed. 
	They cannot be marked final.
	
## Reviewing Sealed Class Rules
### Sealed Class Rules
	- Sealed classes are declared with the sealed and permits modifiers.
	- Sealed classes must be declared in the same package or named module as their direct subclasses.
	- Direct subclasses of sealed classes must be marked final, sealed, or non-sealed
	- The permits clause is optional if the sealed class and its direct subclasses are declared
	within the same file or the subclasses are nested within the sealed class.
	- Interfaces can be sealed to limit the classes that implement them or the interfaces that extend them.

### Example 
> **SealedInterfaceDemo.java**