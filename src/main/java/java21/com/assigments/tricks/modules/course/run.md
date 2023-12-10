###Compile
javac -d ./mods/api ./src/main/java/java21/com/assigments/tricks/modules/course/api/*.java
javac -p ./mods/api -d ./mods/creator ./src/main/java/java21/com/assigments/tricks/modules/course/creator/*.java
javac -p ./mods/api -d ./mods/locator ./src/main/java/java21/com/assigments/tricks/modules/course/locator/*.java
javac -p ./mods/api;./mods/locator -d ./mods/enrollment ./src/main/java/java21/com/assigments/tricks/modules/course/enrollment/*.java

###Runtime
java --module-path ./mods/api;./mods/locator;./mods/creator;./mods/enrollment --module course.enrollment/java21.com.assigments.tricks.modules.course.enrollment.Student

java -p ./mods/api;./mods/locator;./mods/creator;./mods/enrollment -m course.enrollment/java21.com.assigments.tricks.modules.course.enrollment.Student

###Jar
jar cvf ./mods/api.jar -C ./mods/api .
jar cvf ./mods/creator.jar -C ./mods/creator .
jar cvf ./mods/locator.jar -C ./mods/locator .
jar cvf ./mods/enrollment.jar -C ./mods/enrollment .

###Describe module
- the contains means that there is a package in the module that is not exported at all

##Module Dependency
- jdeps does not support the [-p]. Only support [--module-path]
jdeps -s --module-path ./mods ./mods/enrollment.jar

###


D:/Git/java-ocp/src/main/java/java21/com/assigments/tricks/modules/course/api
D:/Git/java-ocp/src/main/java/java21/com/assigments/tricks/modules/course/creator
D:/Git/java-ocp/src/main/java/java21/com/assigments/tricks/modules/course/locator
D:/Git/java-ocp/src/main/java/java21/com/assigments/tricks/modules/course/enrollment




























java -p ./mods/jars -m course.enrollment/java21.com.assigments.tricks.modules.course.enrollment.Student
