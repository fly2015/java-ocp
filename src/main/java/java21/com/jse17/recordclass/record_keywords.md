# RECORD
## Members Automatically Added to Records
	- Constructor: A constructor with the parameters in the same order as the record declaration
	- Accessor method: One accessor for each field
	- equals()
	- hashCode()
	- toString()
	
> Fun fact: it is legal to have a record without any fields. It is simply declared with the record keyword and parentheses	

## Understanding Record Immutability
	- records don't have setters
	- every field is inherently final
	- records are also implicitly final -> can not extend
	- The final modifier is optional but assumed.

## Declaring Constructors
### Compact Constructors
	- A special type of constructor used for records to process validation and transformations succinctly
	- It takes no parameters and implicitly sets all fields

### Transforming Parameters
	- Java calls the full constructor after the compact constructor but with the modified constructor parameters
	- While compact constructors can modify the constructor parameters, they cannot modify the fields of the record

### Overloaded Constructors
   	- The first line of an overloaded constructor must be an explicit call to another constructor via this()		
   	- You can only transform the data on the first line. After the first line, all of the fields will already be assigned, and the object is immutable.

### The Long Constructor
	- Since each field is final, the constructor must set every field.

## Customizing Records
	- Overloaded and compact constructors
	- Instance methods including overriding any provided methods (accessors, equals(), hashCode(), toString())
	- Nested classes, interfaces, annotations, enum, and records
	- Overrides instance methods using the optional @Override annotation
	
	- Can add methods, static fields, and other data types
	- Cannot add instance fields outside the record declaration, even if they are private
	- Do not support instance initializers
	