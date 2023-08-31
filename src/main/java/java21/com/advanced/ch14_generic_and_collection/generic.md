# GENERIC
## Working with Generics
    - type parameter  -> formal type parameter
    - type argument   ->  parameterized type parameter
    - type inference

## Generic Classes	
### Type Erasure
	 - After the code compiles, your generics are actually just Object types.
	 The process of removing the generics syntax from your code is referred to as type erasure.
	 - Type erasure allows your code to be compatible with older versions of Java that do not contain generics.
	 - The compiler adds the relevant casts for your code to work with this type of erased class.	

### Generic Interfaces
	There are 2 ways a class can approach implementing the interface
	-  specify the generic type in the implementation class
	-  create a generic class implement the interface
	
### Raw Types
	- The final way is to not use generics at all
	
### What You CAN NOT Do With Generic Types
	- Calling a constructor
	- Creating an array of that generic type
	- Calling instanceof
	- Using a primitive type as as a generic type parameter
	- Creating a static variable as a generic type parameter
	
	* Most of the limitations are due to type erasure
	- A reifiable type is a type whose type information is fully available at runtime
	
	
## Generic Methods
	Optional Syntax For Invoking A Generic Method	
	- A method declare a generic parameter type, it is independent of the class generics. 	 
> GenericMethodTricky.java

## Bounding Generic Types
	- A bounded parameter type is a generic type that specifies a bound for the generic.
	- A wildcard generic type is an unknown generic type represented with a question mark (?)
	
### Unbounded wildcard
    - [?]
### Upper bound 
    - <? extends -> point out the biggest>	
### lower bound
    - <? super   -> point out the lowest>
	
## Passing Generic Argument
	- Could not use wildcard as a return type of method.
	- A wildcard must have a [?] in it.	