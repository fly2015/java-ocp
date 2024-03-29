## FUNCTIONAL 
### Built‐in Functional
	- UnaryOperator and BinaryOperator are a special case of a Function.
	All type parameters to be the same type
	 
### Optional
	- Think of an Optional as a box that might have something in it or might instead be empty
	- Returning an Optional is a clear statement in the API that there might not be a value in there.
	- There wasn't a clear way to express that null might be a special value
	
	- DEALING WITH AN EMPTY OPTIONAL
	- OPTIONAL WITH PRIMITIVE

## SUMMARIZING STATISTICS
## LEARNING THE FUNCTIONAL INTERFACES FOR PRIMITIVES	
	- Common functional interfaces for primitives
	- Primitive‐specific functional interfaces
	
## Stream
	- A stream in Java is a sequence of data. 
	A stream pipeline consists of the operations that run on a stream to produce a result
	- lazy evaluation
	- Have only one termination operation
	- can perform terminal operation without any intermediate
	
### Source
###	Intermediate
	-> do not run until terminal operation runs
### Terminal
#### reduce
	- go through all items
	- combines a stream into a single object
	
	+ identity: is the initial value of the reduction
	+ accumulator: combines the current result with the current value in the stream
	+ combiner: which combines any intermediate totals
	
	+ When you don't specify an identity, an Optional is returned because there might not be any data. 
	There are three choices for what is in the Optional.
		+ stream is empty ->  empty Optional is returned
		+ stream has one element ->  it is returned.
		+ stream has multiple elements -> the accumulator is applied to combine them
		
#### collect
	- mutable reduction: use the same mutable object while accumulating
	
	* accumulator
	* combiner	
		
>	Streams are lazily evaluated, run when there is a termination operation.	
	

## CHECKED EXCEPTIONS AND FUNCTIONAL INTERFACES
	2 approaches:
	- Catch the exception and turn it into an unchecked exception.
	- Create a wrapper method with the try/catch.
		-> CheckedExceptionHandler.java
		
## COLLECTING RESULTS
	Basic
	To Maps
	Grouping -> does not allow null keys. pair[key, collection]
	Partitioning 
		-> only two possible group(keys) true and false
		-> we cannot change the type of Map that gets returned
		
	Mapping
		-> MappingDemo.java
		
## DEBUGGING COMPLICATED GENERICS tips
	- simple statement,  tiny change
	- separate statements
	- generic wildcards for the return type to detect type correction.
	