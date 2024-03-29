# MODULE
	- Since Java 9, packages can be grouped into modules
	- JAR hell
		+ Chain of dependencies
		+ the same package is in two JARs
		
	- The Java Platform Module System (JPMS)
	The main purpose of a module is to provide groups of related packages to offer a particular set of functionality to developers. 
	It's like a JAR file except a developer chooses which packages are accessible outside the module.


## Exploring A Module
	- packages
	- moduleinfo.java
	
## Benefits Of Modules
	- Better Access Control
		+ acting as a fifth level of access control.
		+ They can expose packages within the modular JAR to specific other packages
		
	- Clearer Dependency Management
		+ projects would specify their dependencies in the module-info.java file
		+ Java would complain if the path are not correct
		
	- Custom Java Builds
		compact profile: mobile/embedded
		+ The Java Platform Module System allows developers to specify what modules they actually need.
		to create a smaller runtime image that is customized to what the application needs and nothing more
		can run that image without having Java installed at all
		+ JLINK is used to create this runtime image.
		+ In addition to the smaller scale package, this approach improves security
		
	- Improved Performance
		+ knows which modules are required to load class
		+ improves startup time for big programs and requires less memory to run
		
	- Unique Package Enforcement
		- clever developers using a package name that is already taken, and having two versions of the same JAR on the classpath.
	
## Modules For Existing Code
	- https://github.com/sormuras/modules/blob/master/README.md

## Creating and Running a Modular Program
	- create, compile, run, and package
	
	- Can A Module-Info.Java File Be Empty?
	Yes.
	As a bit of trivia, it was legal to compile any empty file with a .java
	extension even before modules. The compiler sees there isn't a class in
	there and exits without creating a .class file.	
	
### Order Matters!
	- A package must have at least one class in it in order to be exported.

## Directives inside module-info.java
### exports
	- exports a package to other modules
### exports ... to
	- export a package to a specific module	
#### Exported Types	
	- public classes, interfaces, and enums are exported
	- public and protected fields and methods
	- private/ package-private  are not visible
		 
### requires
	- current module depends on a specified module
#### requires transitive
	- A depend on B and B depend on C then A depend on C
	Effects of requires transitive: A, B can not compiled or executed without access to C
> The requires transitive keyword is used when specifying a module to be used by the requesting module and any other modules that use the .

#### Duplicate requires Statements
	- Java doesn't allow you to repeat the same module in a requires clause
	
### provides ... with
	- Ppecifies that a class provides an implementation of a service
	Syntax: provides INTERFACE with IMPL
	
### uses
	- specifies that a module is relying on a service
	Syntax: use INTERFACE
	- Java allows callers to inspect and call code at runtime with a technique called reflection
	reflection:  It can even be used to subvert access control!
	
### open/opens/opens ..to
	- allow full reflection as older versions of Java did
	open module my.module {}
	- the module system requires developers to explicitly allow reflection
	Syntax: opens PACKAGE
	- opens com.my.package to moduleOne, moduleTwo, etc.;

### Remark	 
	- The java.base module is special.
	It is automatically added as a dependency to all modules

	- Oracle recommends using JAR files for most modules
	- jmod is only for working with the JMOD files
				