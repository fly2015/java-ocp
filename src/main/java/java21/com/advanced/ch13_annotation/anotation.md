# ANNOTATION
	- Annotations are all about metadata
	- Metadata is data that provides information about other data
	- annotations function a lot like interfaces
	- annotations establish relationships that make it easier to manage data about our application.
	- annotations are optional metadata and by themselves do not do anything

## External Metadata Files
### Custom Annotations
	@interface(all lowercase)
	-  as a top‐level type
	-  like an inner class

### Specifying A Required Element
	- annotation element is an attribute that stores values about the particular usage of an annotation
	- need to have the parentheses around the annotation parameters
	
### Providing An Optional Element
	- using default
	- the order of each element does not matter

	** the default value of an annotation must be a non‐ null constant expression.

### Selecting An Element Type
	- an annotation element must be a primitive type, a String, a Class, an enum, another annotation, or an
	array of any of these types.
	- dimension array is not supported

### Applying Element Modifiers
	- annotation elements are implicitly abstract and public

### Adding A Constant Variable
	- annotation variables are implicitly public, static, and final.
	
## Applying Annotations
### Using Annotations In Declarations
	- Classes, interfaces, enums, and modules
	- Variables ( static, instance, local)
	- Methods and constructors
	- Method, constructor, and lambda parameters
	- Cast expressions
	- Other annotations
	* To use an annotation, all required values must be provided	
	
### Creating A Value() Element
	An annotation must adhere(tuân thủ) to the following rules to be used without a name:
    	- The annotation declaration must contain an element named value(), which may be optional or required.
    	- The annotation declaration must not contain any other elements that are required.
    	- The annotation usage must not provide values for any other elements.
	
### Passing An Array Of Values
	- regular form
	- shorthand notation -> , where the array braces ({}) are dropped for convenience
	
### Combining Shorthand Notations
	CombineShorthandNatations.java
	
	
Declaring Annotation‐Specific Annotations	
	LIMITING USAGE WITH @TARGET
	TYPE, FIELD, METHOD
	PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, ANNOTATION_TYPE
	
	PACKAGE * : Packages declared in package‐info.java
	TYPE_PARAMETER
	TYPE_USE
	MODULE*
	
	- can add a package annotation into package that has package‐info.java
	
Understanding the TYPE_USE Value	
	- The TYPE_USE parameter can be used anywhere there is a Java type
	- it can be used only on a method that returns a value.
	Methods that return void would still need the METHOD value defined in the
	annotation
	
	- It also allows annotations in places where types are used, such
	as cast operations, object creation with new, inside type
	declarations, etc
	
STORING ANNOTATIONS WITH @RETENTION	
	SOURCE/CLASS/RUNTIME


GENERATING JAVADOC WITH @DOCUMENTED

NHERITING ANNOTATIONS WITH @INHERITED
	InheritAnotationDemo.java
	
SUPPORTING DUPLICATES WITH @REPEATABLE	
	- without the @Repeatable annotation, an annotation can be applied only once
	- to declare a @Repeatable annotation, you must define a containing annotation type value.
	
	The repeatable annotation must be declared with @Repeatable
	and contain a value that refers to the containing type
	annotation.
	
	The containing type annotation must include an element
	named value(), which is a primitive array of the repeatable
	annotation type.
	
REPEATABLE ANNOTATIONS VS. AN ARRAY OF ANNOTATIONS
	Repeatable annotations were added in Java 8. Prior to
	this, you would have had to use the @Risks containing
	annotation type directly
	
- When @Target is not present, an annotation can be used in any place except
	TYPE_USE or TYPE_PARAMETER scenarios (cast operations, object
	creation, generic declarations, etc.).
	
Common annotations
	@Override -> Compile Error when -> Method signature does not match the signature of an inherited method
	@FunctionalInterface-> Compile Error when	-> Interface does not contain a single abstract method
	@Deprecated
		String since()
		boolean forRemoval()
	@SuppressWarnings
	@SafeVarargs -> Compile Error when ->
		Method or constructor does not contain a
		varargs parameter or is applied to a
		method not marked private, static, or final
	
		