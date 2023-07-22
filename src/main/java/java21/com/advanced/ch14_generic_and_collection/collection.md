# COLLECTION
## Using Wrapper Classes
	autoboxing/unboxing
	- one advantage of a wrapper class over a primitive is that it can hold a null value.
	
## Using Lists, Sets, Maps, and Queues
### List
	- An ordered collection of elements, allows duplicate entries

### Set
	- Does not allow duplicate entries

### Queue
	- It is a collection that orders its elements in a specific order for processing
	A typical queue processes its elements in a first‐in, first‐out order, but other orderings are
	possible.

### Map
	- It is a collection that maps keys to values, with no duplicate keys`` allowed
	- Map doesn't implement the Collection interface
	
## Common Collections Methods
	- boolean add(E element)
	- boolean remove(Object object)
	- boolean isEmpty()
	- int size()
	- void clear()
	- boolean contains(Object object)
	- boolean removeIf(Predicate<? super E> filter)
	- void forEach(Consumer<? super T> action)
	
## Deleting While Looping
	- ConcurrentModificationException
	
## Using List
### List
	- ArrayList
	- LinkedList
	
### Creating a List with a Factory
	- Arrays.asList(varargs)
  		+ Returns fixed size list backed by an array.
  		+ Can replace elem

	- List.of(varargs)
  		+ returns immutable list

	- List.copyOf(collection)
		+ Returns immutablelist with copy of original collection's values

## Using Set
	- HashSet
	- TreeSet

### Create an immutable Set in one line or make a copy of an existing one.
	- Set<Character> letters = Set.of('z', 'o', 'o');
	- Set<Character> copy = Set.copyOf(letters);
	
## Using Queue			
	- FIFO
	- Double‐ended queue
    	+ Can insert and remove elements from both the front and back of the queue.
		
### LinkedList
	- It implements both the List and Queue interfaces
  	- The trade‐off is that it isn't as efficient as a “pure” queue
	
### ArrayDeque
	- It is  pure queue (FIFO)
	
### Queue Methods No Exception
	- offer()	->	add to the back 
	- poll()	->	remove and return next elem (or return null if the queue is empty)
	- peek()	->	return next element (or return null if the queue is empty)
	
### Queue Methods With Exception
	- add() 	->	Add to the back of the queue and return true or throw exception.
	- remove() 	-> 	Removes and returns next element or throws an exception if empty queue.
	- element()	-> 	Returns next element or throws an exception if empty queue.

### Using The Map Interface
  	- HashMap
	- LinkedHashMap
	
	Map.of("key1", "value1", "key2", "value2")
	Map.of("key1", "value1", "key2");  
		+ This code compiles but throws an error at runtime
	Map.ofEntries(
		Map.entry("key1", "value1"),
		Map.entry("key1", "value1"))
	
> The data structures that involve sorting do not allow null values. 
It will compile, but throw exception at Runtime

## Older Collections
	- Vector 	-> List
	- Hashtable -> HashMap
	- Stack 	-> Queue	
	
## Sorting Data
### Remark
	- Comparable
	- Keeping compareTo() and equals() Consistent	
	
### Comparator
#### Comparing Multiple Fields
##### Helper static methods for building a Comparator
	- comparing(function)
	- comparingDouble(function)
	- comparingInt(function)
	- comparingLong(function)
	- naturalOrder()
	- reverseOrder()
			
#### Helper default methods that you can chain to a Comparator to further specify its behavior
	- reversed()
	- thenComparing(Function)
	- thenComparingDouble(Function)
	- thenComparingInt(Function)
	- thenComparingLong(function)
			
## Sorting And Searching			
### Reviewing Binarysearch()
	- One less than the negated index of where the requested value would need to be inserted
	- Undefined result when the sorting is inconsitent.