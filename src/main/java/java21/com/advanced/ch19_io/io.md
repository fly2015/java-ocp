## IO
### Understanding Files and Directories
### files
	- A file is a record within the storage device that holds data
	- Files are organized into hierarchies using directories
	
### directories
	- A directory is a location that can contain files as well as other directories.
	Java often treat directories like files

### file systems	
	** The file system is in charge of reading and writing data within a computer.

	- Different operating systems use different file systems to manage their data.
	- The JVM will automatically connect to the local file system, allowing you to perform the same operations across multiple platforms.
	- The root directory is the topmost directory in the file system,from which all files and directories inherit
    	+ Windows: C:/
    	+ Linux : ./
	
### path
	- Path is a String representation of a file or directory within a file system

### The absolute path of a file or directory
	- It is the full path from the root directory to the file or directory, including all sub-directories that contain the file or directory.

### The relative path of a file or directory
	- It is the path from the current working directory to the file or directory
	
	- Unix‐based systems use the forward slash: /
	- Windows‐based systems use the backslash: \
	- System.getProperty("file.separator") and a static variable defined in the File to set system characters.
	
## Introduce the File class
### java.io.File 
	- The File class is used to read information about existing files and directories, list the contents of a directory, and create/delete files and directories
	
	- An instance of a File class represents the path to a particular file or directory on the file system
	
	- The File class cannot read or write data within a file, although it can be passed as a
	reference to many stream classes to read or write data

### The File Object vs. the Actual File
	- A File only represents a path to a file
	it is not connected to an actual file within the file system.
	- The JVM and underlying file system will read or modify the file using the methods you call on the File class

## Working with a File Object
### Understandng I/O stream Fundermental
	- List of data elements presented sequentially
	- Have a pointer to our current position in the stream and read data one block at a time.
	** ALL JAVA I/O STREAMS USE BYTES -> for convenience and performance, reducing the round‐trips and drastically
	- Although streams are commonly used with file I/O, they are more generally used to handle the reading/writing of any sequential data source
		
### I/O STREAMS CAN BE BIG
	- Very large file -> When read and written by a program with very little memory, since the stream allows
	the application to focus on only a small portion of the
	overall stream at any given time.

### LEARNING I/O STREAM NOMENCLATURE
	* Common terminology and naming conventions used with streams	
	- Byte Streams vs. Character Streams
		+ Byte streams: read/write binary data ( 0s and 1s) and have class names that end in InputStream or OutputStream.
		+ Character streams: read/write text data and have class names that end in Reader or Writer.
	
### Byte Streams vs. Character Streams
	- InputStream and Reader
	- OutputStream and Writer 

### CHARACTER ENCODING IN JAVA
	- Charset.forName()
	- Just remember that using a character stream is better for working with text data than a byte stream.	
	
### Input vs. Output Streams
	InputStream/OutputStream
	FileInputStream/FileOutputStream
	FileReader/FileWriter
	
### There are exceptions to this rule
	- PrintWriter without PrintReader
	- PrintStream is an OutputStream has no corresponding InputStream  

### Low‐Level vs. High‐Level Streams
	- A low‐level stream connects directly with the source of the data
	- A high‐level stream is built on top of another stream using wrapping.
	
	* BufferedReader -> FileReader
	* ObjectInputStream -> BufferedInputStream ->FileInputStream

### USE BUFFERED STREAMS WHEN WORKING WITH FILES
	- Buffered classes read or write data in groups, rather than a single byte or character at a time.
	- The performance gain from using a Buffered class to
	access a low‐level file stream cannot be overstated (sequential file systems)
	* More sequential bytes you read at a time -> the fewer round‐trips between the Java process and the file system

## Stream Base Classes	
	- 4 abstract classes
		+ InputStream
		+ OutputStream
		+ Reader
		+ Writer.
	- The constructors of high‐level streams often take a reference to the abstract class
	which allows it to take any subclass of that abstract class.
	- You only wrap a stream with another stream if they share the same abstract parent. 

## Common I/O Stream Operations
### READING AND WRITING DATA
	- use byte instead of int -> need to store a value to indicate the end of a stream
	- Most I/O stream methods declare a checked IOException.
	- using offset when read/write

    // InputStream and Reader
	public int read() throws IOException
	// OutputStream and Writer
	public void write(int b) throws IOException
	 // InputStream 
	public int read(byte[] b) throws IOException
	public int read(byte[] b, int offset, int length) throws
	IOException
	// OutputStream
	public void write(byte[] b) throws IOException
	public void write(byte[] b, int offset, int length) throws
	IOException

### CLOSING THE STREAM 
	- I/O stream need to close to avoid resource leaks
	- Closeable
	- try‐with‐resources statement
	- use var to shorten the declarations
	
### CLOSING WRAPPED STREAMS
	- you only need to use close() on the topmost object

### MANIPULATING INPUT STREAMS
	// InputStream and Reader
	public boolean <b>markSupported()</b>
	public void void mark(int readLimit)
	public void reset() throws IOException
	public long skip(long n) throws IOException

	- using mark and reset	
	- should call the markSupported() before call mark() and reset()
	- It instructs the stream that we expect to call reset() after at most readLimit(in this range) -> if reset after this range -> throw exceptions

#### mark() and reset() 
	- storing the data in a temporary buffer in memory to be read again should not call the mark() operation with too large a value.

#### using skip

### FLUSHING OUTPUT STREAMS	
#### flush() 
	- ensure data is written to disk(file system) from buffer/cache between each iteration.
	- reduce the amount of data lost if the application terminates unexpectedly serialVersionUID -> helps inform the JVM that the
	- should be used only intermittently, when data is critical
	the close() will automatically flush().

## Working with I/O Stream Classes
### READING AND WRITING BINARY DATA
	- FileInputStream/FileOutputStream -> read/write bytes from/to a file.
	-> CopyFilePerByte.java
		
### BUFFERING BINARY DATA
	- the Buffered classes contain a number of performance improvements for managing data in memory.
	- buffer size: power of 2 from 1,024 to 65,536
	
	BufferedInputStream/BufferedOutputStream
	
### READING AND WRITING CHARACTER DATA	
	FileReader/FileWriter
	-> CopyTextFilePerCharacter.java

### BUFFERING CHARACTER DATA
	-> CopyFileWithBuffer.java

## SERIALIZING DATA
	- Serialization is the process of converting an in‐memory object to a byte stream
	- Deserialization is the process of converting from a byte stream into an object.
	- Serialization often involves writing an object to astored or transmittable format, while deserialization is the reciprocal process
	
### Serializable Interface
	- Serializable is a marker interface with no abstract members	
	- should only mark data‐oriented classes serializable
	- All Java primitives and many of the built‐in Java classes are Serializable
	- Any field that is marked transient will not be saved to a stream when the class is serialized

	- It's a good practice to declare a static serialVersionUID variable in every class that implements Serializable.	
	- The serialVersionUID helps inform the JVM that the stored data may not match the new class definition. If an older version of the class is encountered during deserialization, a java.io.InvalidClassException may be thrown

### Marking Data transient
	- transient on deserialization: It reverts to its default Java values, such as 0.0 for double, or null for an object.
	
### How to Make a Class Serializable
	- The class must be marked Serializable.
	- Every instance member of the class is serializable marked transient, or has a null value at the time of serialization.

### Storing Data with ObjectOutputStream and ObjectInputStream
	public ObjectInputStream(InputStream in) throws IOException
	public ObjectOutputStream(OutputStream out) throws IOException	
	public Object readObject() throws IOException, ClassNotFoundException
	public void writeObject(Object obj) throws IOException
	
	- we need to use an infinite loop to process the data, which throws an EOFException when the end of the stream is reached.
	
	- If your program happens to know the number of objects in the stream, then you can call readObject() a fixed number of times, rather than using an infinite loop.

	- EOFException -> when the end of the stream is reached when de-serialization
	
	- available() -> the number of blocks that can be read without blocking
	another thread. In other words, it can return 0 even if there are more bytes to be read.

### Understanding the Deserialization Creation Process 
	- When you deserialize an object, the constructor of the serialized class, along with any instance initializers, is not called when the object is created. Java will call the no‐arg constructor of the first non-serializable parent class it can find in the class hierarchy.

## PRINTING DATA
### PrintStream/PrintWriter
	- operates on an OutputStream and the other a Writer.
 	- the only I/O stream classes we cover that do not have corresponding input stream classes
 	public PrintStream(OutputStream out)
	public PrintWriter(Writer out)
	
	- these classes also include constructors that automatically wrap the print stream around a low‐level file stream class
	public PrintStream(File file) throws FileNotFoundException
	public PrintStream(String fileName) throws FileNotFoundException
	public PrintWriter(File file) throws FileNotFoundException
	public PrintWriter(String fileName) throws FileNotFoundException
	
	- the PrintWriter class even has a constructor that takes an OutputStream as input
	public PrintWriter(OutputStream out)
	
	- Both System.out and System.err are PrintStream objects
	- System.in, often useful for reading user input, is an InputStream
	
	- the methods in the print stream classes do not throw any checked exceptions
	- The stream classes do provide a method, checkError(), that can be used to check for an error
	after a write.
	print()
	println()
	
	
	// PrintStream
	public PrintStream format(String format, Object args…)
	public PrintStream format(Locale loc, String format, Object args…)
	// PrintWriter
	public PrintWriter format(String format, Object args…)
	public PrintWriter format(Locale loc, String format, Object args…)
	
	format()
	printf() - to make C developers feel more at home, interchangeable with format()
	- the parameters are inserted and formatted via symbols in the order that they are provided in the vararg
	%s any type, commonly String values
	%d  integer values like int and long
	%f  float and double
	%n a line break
	
	- Mixing data types may cause exceptions at runtime
	
### USING FORMAT() WITH FLAGS
	- By default, %f displays exactly six digits past the decimal	
	- display only one digit after the decimal, you could use %.1f instead of %f.
	- The format() method relies on rounding, rather than truncating when
	shortening numbers 
	
	- You can specify the total length of output by using a number before the decimal symbol. By default, the method will fill the empty space with blank spaces. You can also fill the empty space with zeros, by placing a single zero before the decimal symbol	
	* FormatDemo.java
	
### INPUTSTREAMREADER AND OUTPUTSTREAMWRITER	
	InputStreamReader_OutputStreamWriter.java
	- Mixing Stream In/Out and Reader/writer
	
## Interacting with Users	
### PRINTING DATA TO THE USER
	- PrintStream instances for providing information to the user: System.out and System.err
	
### READING INPUT AS A STREAM
	- The System.in returns an InputStream and is used to retrieve text input from the user.
	
### CLOSING SYSTEM STREAMS 
	- these are static objects, the System streams are share by the entire application
	- closing them is not recommended
	- Closing System.err is a particularly bad idea, since the stack traces from all exceptions will be hidden.
	- Unlike the PrintStream class, most InputStream implementations will throw an exception if
	you try to operate on a closed stream
		
## ACQUIRING INPUT WITH CONSOLE	
	- The Console class is a singleton
	- it is accessible only from a factory method and only one instance of it is created by
	the JVM

	- It is imperative that you check for a null value before attempting to use a Console
	object!
	- reader() and writer()
	- support for format()
	

### USING CONSOLE WITH A LOCALE
	- Console does not include an overloaded format() method that takes a Locale
	instance
	- can use via writer()
		
#### readLine() and readPassword()	
	* The readPassword() methods are similar to the readLine() method with two important differences.
	- The text the user types is not echoed back and displayed on the
	screen as they are typing
	- The data is returned as a char[] instead of a String.
	ReviewConsoleMethod.java
	
# Keywords:
### Byte vs. character streams
### Input vs. output streams
### Low‐level vs. high‐level streams
	
> A common practice is to start with a low‐level resource or file stream and wrap it in a buffered stream to improve performance. You can also apply a high‐level stream to manipulate the data, such as an object or print stream. 
	