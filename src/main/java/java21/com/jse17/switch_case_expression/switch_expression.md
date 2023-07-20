## SWITCH EXPRESSION
### News
	- Switch multiple cases with comma
	- Returning Consistent Data Types
	
### Rules
	1. All of the branches of a switch expression that do not throw an exception must return
	a consistent data type (if the switch expression returns a value).

	2. If the switch expression returns a value, then every branch that is not an expression must
	yield a value.

	3. A default branch is required unless all cases are covered or no value is returned.


### Applying a case Block
	- Use YIELD
	- Semicolons are required for case expressions but cannot be used with case blocks.
	
### Covering All Possible Values
	- Add a default branch.
	- If the switch expression takes an enum value, add a case branch for every possible
	enum value.	