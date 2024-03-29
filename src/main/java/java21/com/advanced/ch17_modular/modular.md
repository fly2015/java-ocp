## MODULE
### Comparing Types of Modules
#### CLASSPATH VS. MODULE PATH
	- Java runtime is capable of using class and interface types from both the classpath and the module path
	- the classpath -> access modifiers
	- module path -> access modifiers + module directives
	
#### NAMED MODULES
	- A named module is one containing a module‐info file this file appears in the root of the JAR along side one or more packages
	- Named modules appear on the module path rather than the classpath
	 * a named module has the name inside the module‐info file and is on the module path
	 
#### AUTOMATIC MODULES
	- An automatic module appears on the module path but does not contain a module‐info file.	
	- A regular JAR file that is placed on the module path and gets treated as a module.
	- Automatic modules will have full read access to every other module loaded 
	
	- automatically exports all packages.
	- determines the module name	
	 
	Java9: authors of Java libraries were encouraged to declare the name they intended to use for the module in the future
	- property called Automatic‐Module‐Name in the MANIFEST.MF file.
	
	If the JAR file does not specify an automatic module name, Java will still allow you to use it in the module path.
	In this case, Java will determine the module name for you.
		
		
#### ** The algorithm in a list for determining the name of an automatic module.	
	1. If the MANIFEST.MF specifies an Automatic‐Module‐Name, use that.
	Otherwise, proceed with the remaining rules
	2. Remove the file extension from the JAR name
	3. Remove any version information from the end of the name
	4. Replace any remaining characters other than letters and numbers with dots.
	5. Replace any sequences of dots with a single dot.
	6. Remove the dot if it is the first or last character of the result.
	e.g 
	commons2‐x‐1.0.0‐ SNAPSHOT.jar -> commons2.x
	mod_$‐1.0.jar -> mod
	
#### UNNAMED MODULES
	- An unnamed module appears on the classpath	
	- it is a regular JAR
	- an unnamed module is treated like old code and a second‐class citizen to modules	
	
	* An unnamed module does not usually contain a module‐info file. 
	If it happens to contain one, that file will be ignored since it is on the classpath.
	
	- Unnamed modules do not export any packages to named or automatic modules
	- The unnamed module can read from any JARs on the classpath or module path
	** You can think of an unnamed module as code that works the way Java worked before modules
		
### Analyzing JDK Dependencies
#### IDENTIFYING BUILT‐IN MODULES
 	- Prior to Java 9: the whole JDK had to be available at runtime because a program could potentially need anything.	
	
	- Directives in the module‐info file specifies which modules need to be present at both compile time and runtime
	
#### Common modules
	- java.base -> it is available to all modular, no need to explicitly requires
	- java.desktop
	- java.logging
	- java.sql
	- java.xml

	* Java modules prefixed with java
	* Java modules prefixed with jdk

#### USING JDEPS
	- The jdeps command gives you information about dependencies
	jdeps  x.jar
	jdeps -s x.jar
	jdeps --jdk-internals/‐‐jdk‐internals x.jar
	
	
## Migrating an Application
	- Java 8 and earlier were not designed to use the Java Platform Module System
	
	- Overview of strategies for migrating an existing application to use modules. 
	- bottom‐up migration
	- top‐down migration
	- split up an existing project

### DETERMINING THE ORDER
	- Projects that do not have any dependencies are at the bottom.
	- Projects that do have dependencies are at the top.	
	
### EXPLORING A BOTTOM‐UP MIGRATION STRATEGY
	- This approach works best when you have the power to convert any JAR files that aren't already modules:

	1. Pick the lowest‐level project. (ordered them by dependencies)
	2. Add a module‐info.java file to that project
	- exports to expose any package used by higher‐level JAR files.
	- requires directive for any modules it depends on.
	3. Move this newly migrated named module from the classpath to the module path
	4. Ensure any projects that have not yet been migrated stay as unnamed modules on the classpath.
	5. Repeat with the next‐lowest‐level project until you are done.
	
	- Mix of named modules and unnamed modules
	** The named modules are the lower‐level -> on the module path -> not allowed to access any unnamed modules.
	** The unnamed modules are the higher level-> on the classpath -> can access JAR files on both the classpath and the module path.

### EXPLORING A TOP‐DOWN MIGRATION STRATEGY	
	- It is most useful when you don't have control of every JAR file used by your application
	1. Place all projects on the module path.
	2. Pick the highest‐level project that has not yet been migrated.
	3. Add a module‐info file to that project to convert the automatic
	module into a named module
	4. Repeat with the next‐highest‐level project until you are done

	- Mix of named modules and automatic modules	
	* The named modules are the higher‐level -> on the module path -> can access to the automatic modules in the module path

### SPLITTING A BIG PROJECT INTO MODULES

#### Creating a Service
	- Java 6, the ServiceLoader -> make extensible ->  add functionality without recompiling
	- the service provider interface and service locator could be in the same module.

#### DECLARING THE SERVICE PROVIDER	
	- service provider interface 
		+ it specifies what behavior our service will have
		+ module definition exports the package containing the interface
		+ can be an abstract class rather than an actual interface.
	- the service includes:
    	+ the service provider interface 
    	+ supporting classes it references. 
    	+ The service also includes the lookup functionality

#### CREATING A SERVICE LOCATOR
	- A service locator is able to find a any classes that implement a service
	provider interface.
	- Java provide ServiceLocator.load()
	- it is best to cache ServiceLocator.load().
		
	* both requires and uses are needed, one for compilation and one for lookup.

#### INVOKING FROM A CONSUMER
	- A consumer (or client) refers to a module that obtains and uses a service
	- consumer does not need to know about implementations cos the other module are lookup
	
	
#### ADDING A SERVICE PROVIDER
	- A service provider is the implementation of a service provider
	interface
	- at runtime it is possible to have multiple implementation classes or modules
	- not exported the package containing the impementation
	- made the implementation available to a service provider using the
	interface	
	
	* Relying on a loosely coupled structure allows service modules to be
	easily extensible at runtime. (dont need to recompile the others module when change the provider, ServiceLocator will handle and find from module-path)

	Java allows only one service provider for a service provider interface in a module
	If you wanted to offer another provider, you would need to create a separate module
	
	
#### MERGING SERVICE LOCATOR AND CONSUMER
	We need requires because we depend on the service provider interface.
	We still need provides so the ServiceLocator can look up the service impl.
	Additionally, we still need uses since we are looking up the service interface from another module.
	
	
*** The ServiceLoader sees all service providers
>TourLengthCheck.class
