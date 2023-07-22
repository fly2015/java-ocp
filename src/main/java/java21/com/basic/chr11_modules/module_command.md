# MODULE COMMAND
## Compile and Run Command
	--module-version 
	-p/--module-path
	-m/--module

### Compile a module
	javac -p <module-path> -d <output-directory> <source-directory and files> <module-info.java>

### Run a module
	java -p <module-path> -m <module-name>/<package>.<class name>

### Package A Module
	jar cmfv <manifest-path-file> <jar-file> -C <outside-directory> <class-file>
	jar cmfv <manifest-path-file> <jar-path>/<file-name.jar> -C <path-contain-class-files> <path-of-files-will-be-packed>
	jar cmfv <manifest-path-file> <jar-path>/<file-name.jar> <path-of-class-files>
	jar cmfv <manifest-path-file> <jar-path>/<file-name.jar> -C <path-contain-class-files> <path-of-files-will-be-packed>
	<path-contain-class-files/module-info.class>

	e.g. 
	jar cfv ./jars/zoo.tours.api.jar -C ./mods .
	jar cfv ./jars/zoo.tours.api.jar .
	jar cfv ./mods/zoo.tours.reservations.jar -C ./classes  ./zoo/tours/reservations ./classes/module-info.class
		 
### Run a module from jar without manifest
	java -p <path-jar-file;module-paths> -m <module-name>/<package>.<class name>
	
### Run a module from a runnable jar

### List files that the jar contain
	jar --list --file <jar-file-path>

## Describing Modules

## Java Command
### Describing a Module
	java -p <path-jar-file> -d/--describe-module <module-name>
	
### Listing Available Modules
	java <optional -p <our-modules>> --list-modules	

### Showing Module Resolution
	java --show-module-resolution

### The Jar Command
	jar -f <module-file-path> -d
	jar --file <module-file-path> --describe-module
	- output with module-info.class
	
## The Jdeps Command
	jdeps -s <module-file-path>
	jdeps -summary <module-file-path> (only one dash)
	jdeps <module-file-path>
	
	jdeps -s/-summary --module-path <module-paths> <module-path-file> <module-path-file-dependency>
	* There is not a short form of --module-path in the jdeps command
	
	
## The Jmod Command
	jmod is only for working with the JMOD files
	- create
	- extract
	- describe
	- list
	- hash

## Example
### Compile, Package, Run
	javac -p ./libs/commons-lang3-3.12.0.jar -d ./mods/ocp ./src/ocp/exam/*.java ./src/ocp/study/*.java ./src/ocp/module-info.java
	jar cvf  ./mods/ocp.jar  -C ./mods/ocp .
	java --module-path ./mods/ocp.jar;./libs/commons-lang3-3.12.0.jar -m ocp/ocp.exam.Exam

### Describe, List
	java -p ./mods/ocp.jar -d ocp
	java -p ./mods/ocp.jar --describe-module ocp
	java -p ./mods/ocp.jar --list-modules

### Jlink Testing
	javac -d ./mods/hng ./src/hng/*.java
	java -p ./mods/hng -m hng.test/hng.Test
	jar cvf  ./mods/hng.jar  -C ./mods/ocp .
	java -p ./mods/hng.jar -m hng.test/hng.Test
	jlink --module-path ./mods/hng.jar;D:\jdk-17.0.3.1\jmods --add-modules hng.test,java.base  --output ./jlink_mods --compress none
	jlink --module-path ./mods/hng.jar;D:\jdk-17.0.3.1\jmods --add-modules hng.test,java.base  --output ./jlink_mods --launcher hngrun=hng.test/hng.Test --compress=2
