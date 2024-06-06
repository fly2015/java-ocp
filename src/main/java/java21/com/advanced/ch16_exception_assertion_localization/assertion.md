## ASSERTIONS
### Declaring Assertions
	- assertion is a boolean expression that you place at a point in your code where you expect something to be true
	- An assert statement contains this statement along with an optional message.
	
	* three possible outcomes of an assert:
  	- 	assertions are disabled -> skip and goes on
  	-  assertions are enabled and the boolean expression is true -> validated and nothing happen
  	-  assertions are enabled and the boolean expression is false -> invalid and an AssertionError is thrown
	 
	- an assertion is a shorter way of writing:
	if (!boolean_expression) throw new AssertionError(error_message);
	 
### ENABLING ASSERTIONS
	<java -enableassertions>
	<java -ea>
	java -ea:com.demos… my.programs.Main
	- Using the ‐enableassertions or ‐ea flag without any arguments enables assertions in all classes (except system classes)
	- can enable assertions for a specific class or package
	- ellipsis ( …) means any class in the specified package or subpackages.
	- can also enable assertions for a specific class.
	
### DISABLING ASSERTIONS
	<java ‐disableassertions>
	<java ‐da>
	By default, all assertions are disabled.