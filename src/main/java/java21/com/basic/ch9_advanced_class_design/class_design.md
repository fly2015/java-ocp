# ADVANCED CLASS DESIGN

## Introducing Abstract Classes
	- An abstract class is a class that cannot be instantiated and may contain abstract methods.
	- As part of the instantiation of a non-abstract subclass.
	- An abstract method is a method that does not define an implementation when it is declared
	- An abstract method must be overridden if there is sub class are extend the abstract class.

## Override Vs. Implement
	- when an abstract method is overridden in a subclass, it is referred to as implementing the method
	- we tend to use the terms implement and override interchangeably for abstract methods, the term override is more accurate	
	- you can declare new unchecked exceptions but not checked exceptions in the overridden method

## Defining Abstract Methods
	- An abstract class can include all of the same members as a nonabstract class, including variables, static
	and instance methods, and inner classes.
	- Also include constructors
	- Not actually required to include any abstract methods
	
	* The abstract modifier cannot be placed after the class keyword in a class declaration,
	nor after the return type in a method declaration

## Constructors in Abstract Classes
	- Even though abstract classes cannot be instantiated, 
	they are still initialized through constructors by their subclasses. 

	** Abstract classes are initialized with constructors in the same way as nonabstract classes.
	If an abstract class does not provide a constructor, the compiler will automatically insert a default no-argument constructor
	** A constructor in abstract class can be called only when it is being initialized by a nonabstract subclass
		
## Invalid Abstract Method Declarations
###  Invalid Modifiers
	- abstract and final modifiers: Neither the class or method declarations will compile because they are marked both abstract and final.
	- abstract and private modifiers: A method cannot be marked as both abstract and private
	- abstract and static modifiers:  static method cannot be overridden so it can not go with abstract
	** While it is not possible to declare a method abstract and private, it is possible (albeit redundant) to declare a
	method final and private.

## Creating A Concrete Class
	- A concrete class is a nonabstract class
	- The first concrete subclass that extends an abstract class is required to implement all inherited abstract methods.
	- An abstract class can extend a nonabstract class, and vice versa
	- It is not required to provide an implementation when an abstract extend an abstract class.
	
## Abstract Class Definition Rules
	1. Abstract classes cannot be instantiated.
	2. All top-level types, including abstract classes, cannot be marked protected or private.
	3. Abstract classes cannot be marked final.
	4. Abstract classes may include zero or more abstract and nonabstract methods.
	5. An abstract class that extends another abstract class inherits all of its abstract methods.
	6. The first concrete class that extends an abstract class must provide an implementation for all of the inherited abstract methods.
	7. Abstract class constructors follow the same rules for initialization as regular constructors, except they can be called only as part of the initialization of a subclass.

## Abstract Method Definition Rules
	1. Abstract methods can be defined only in abstract classes or interfaces.
	2. Abstract methods cannot be declared private or final.
	3. Abstract methods must not provide a method body/implementation in the abstract class in which they are declared.
	4. Implementing an abstract method in a subclass follows the same rules for overriding a method, including covariant return types, exception declarations, etc.


## Implementing Interfaces
	- It does allow a class to implement any number of interfaces
	- An interface is an abstract data type are that declares a list of abstract methods that any class implementing the interface must provide
	- An interface can also include final variables.
	- Abstract methods and constant variables are implicitly assumed to be public

	** With Java 8, interfaces were updated to include static and default methods.
	** Backward compatibility: To use a new version, that contains a new method, without having to modify

### Default method
	- Method has body in the interface, called by implementation

### Diamond problem 
	- Override the default method without default.

### Static method
	- Cannot override, can hidden

	*** In Java 9, interfaces were updated to support private and private static methods
	It is for code reusability, cannot be called outside.

## Defining An Interface
	- Interface variables are referred to as constants because they are assumed to be public, static, and final
	- They can be used outside the interface declaration without requiring an instance of the interface
	- Abstract method assumed to be public
	- An interface is always considered to be abstract, even if it is not marked so.
	- Interfaces are not required to define any methods	
	- An interface cannot be instantiated
	- Cannot be marked as final
	- Implement class must explicitly declare public access modifier
	- An interface can extend another interface using the xtends keyword
	- An interface can extend multiple interfaces
	- Do not contain constructors and are not part of instance initialization.
	
### Inserting Implicit Modifiers
	Interfaces are assumed to be abstract.
	Interface variables are assumed to be public, static, and final
	Interface methods without a body are assumed to be abstract and public.
	
### Conflicting Modifiers
	
### Differences between Interfaces and Abstract Classes
	- Only interfaces make use of implicit modifiers

### Inheriting An Interface
	- An interface can extend another interface.
	- A class can implement an interface.
	- A class can extend another class whose ancestor implements an interface.
	- A class can implement an interface, a class cannot extend an interface

### Mixing Class and Interface Keywords
	- class1 extends class2
	- interface1 extends interface2, interface3, ...
	- class1 implements interface2, interface3, ...
		
### Duplicate Interface Method Declarations
	If two abstract interface methods have identical behaviors or in this case the same method declaration you just need to be able to create a single method that overrides both inherited abstract methods at the same time.
	
	What if the duplicate methods have different signatures? If the
	method name is the same but the input parameters are
	different, there is no conflict because this is considered a
	method overload. 

	What if the duplicate methods have the same signature but
	different return types?
	-> the return types must BE covariant -> else compile errors

	The compiler would also throw an exception if you define an
	abstract class or interface that inherits from two conflicting
	abstract types
	
## Polymorphism And Interfaces
### Abstract Reference Types
### Casting Interfaces
	Let's say you have an abstract reference type variable, which has been instantiated by a concrete subclass. If you need access to a method that is only declared in the concrete subclass, then you will need to cast the interface reference to that type, assuming the cast is supported at runtime.
		
	- Throws a ClassCastException at runtime if 2 object are not relate but implement the same interface
	- The compiler does not allow a cast from an interface reference to an object reference if the object type does not implement the interface
		
### Interfaces and the instanceof Operator
	- The compiler will only report an unrelated type error for an
	instanceof operation with an interface on the right side if the
	reference on the left side is a final class that does not inherit
	the interface.
	
	* Compare to abstract class: include implicit modifiers, do not contain constructors, do not participate in the instance initialization process, and support multiple inheritance.
		
	* Inner or nested interfaces as inner classes
	
## Inner Classes
	- Member inner class
	- It cannot be declared unless it is inside another class.
	- 4 types:  member inner classes, local classes, anonymous classes, and static nested classes
	- A member inner class can be declared with all of the same access modifiers as a class member
	- Static members are disallowed(allowed from Java 17) in member inner classes unless go with final(constant).

	The advantage of using a member inner class in this example is that the outer class completely manages the life cycle of the inner class
	
	**** InnerClass cannot have static members because it belongs to an instance (of OuterClass)
	and a static members means that this variable belongs to the entire class and not any particular instance.