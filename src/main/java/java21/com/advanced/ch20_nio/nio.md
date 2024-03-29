# NIO
	- NIO.2 is a replacement for the legacy java.io.File
	- The goal of the API is to provide a more intuitive, more feature‐rich API for working
	with files and directories.

> Java includes an NIO library that uses buffers and channels

## PATH
### Introducing Path
	- The cornerstone of NIO.2
	- A Path instance represents a hierarchical path on the storage system to a file or directory
	
### File and Path
	- May refer to an absolute path or relative path within the file system
	- Refer to a file or a directory
	
	***  The Path interface contains support for symbolic links
	- A symbolic link is a special file within a file system that serves as a reference or pointer to another file or directory

### Creating Paths
	- Since Path is an interface
	- When a Path is created, the JVM returns a file system–specific implementation, such as a Windows or Unix Path class.
	
### Obtaining a Path with the Path Interface		
> PathDemo.java

	- Path.of() new to Java 11
	
### Absolute Vs. Relative Paths
	- Determining whether a path is relative or absolute is actually file‐system dependent
		+ starts with a forward slash (/)
		+ with a drive letter ( c:)
	Otherwise, it is a relative path.
	
	- The Path.of() method also includes a varargs to pass additional path element
	- The varargs is that it is more robust, as it inserts the proper operating system path
	separator for you.

### Obtaining a Path with the Paths Class
>  PathDemo.java
	
### Obtaining a Path with a URI Class
	- A uniform resource identifier (URI) is a string of characters that identify a resource.
	It begins with a schema that indicates the resource type
		+ file://
		+ https://
		+ ftp://
> PathDemo.java

### Obtaining a Path from the FileSystem Class
> PathDemo.java
	
### Connecting To Remote File Systems	
	- The FileSystems class does give us the freedom to connect to a remote file system
	NIO.2 gives us the power to connect to both local and remote file systems
> FileSystemDemo.java

### Obtaining a Path from the java.io.File Class
> PathDemo.java
	
## Reviewing NIO.2 Relationships
	- Files is an NIO.2 helper class. 
	- Files operates on Path instances, not java.io.File instances.
	
## Understanding Common Nio.2 Features
### Applying Path Symbols
	- Absolute and relative paths can contain path symbols. 
	- A path symbol is a reserved series of characters that have special
	meaning within some file systems.
	- [.] -> A reference to the current directory
	- [..]-> A reference to the parent of the current directory
	
### Providing Optional Arguments
    | ENUM               | INTERFACE INHERITED  | ENUM VALUE        | DETAILS                                                                    |
    | ------------------ | -------------------- | ----------------- | -------------------------------------------------------------------------- |
    | LinkOption         | CopyOptionOpenOption | NOFOLLOW_LINKS    | Do not follow symbolic links.                                              |
    |                    |                      |                   |                                                                            |
    | StandardCopyOption | CopyOption           | ATOMIC_MOVE       | Move file as atomic file system operation.                                 |
    | StandardCopyOption | CopyOption           | COPY_ATTRIBUTES   | Copy existing attributes to new file.                                      |
    | StandardCopyOption | CopyOption           | REPLACE_EXISTING  | Overwrite file if it already exists.                                       |
    |                    |                      |                   |                                                                            |
    | StandardOpenOption | OpenOption           | APPEND            | If file is already open for write, then append to the end                  |
    | StandardOpenOption | OpenOption           | CREATE            | Create a new file if it does not exist                                     |
    | StandardOpenOption | OpenOption           | CREATE_NEW        | Create a new file only if it does not exist, fail otherwise                |
    | StandardOpenOption | OpenOption           | READ              | Open for read access.                                                      |
    | StandardOpenOption | OpenOption           | TRUNCATE_EXISTING | If file is already open for write, then erase file and append to beginning |
    | StandardOpenOption | OpenOption           | WRITE             | Open for write access                                                      |
	|                    |                      |                   |                                                                            |
    | FileVisitOption    | N/A                  | FOLLOW_LINKS      | Follow symbolic links.                                                     |


### Handling Methods That Declare IOException
	- Path interface or Paths class, often do not throw any checked exceptions.
	- Files.exists() does not declare IOException

### Interacting with Paths
	- NIO.2 provides a rich plethora of methods and classes that operate on Path objects
	- Path instances are immutable
	- As rule of thumb, if the method declares an IOException, then it usually requires the paths it
	operates on to exist.
	
	public String toString()
	public int getNameCount()
	public Path getName(int index)
	- throws an exception if invalid indices are provided.
> PathViewDemo.java
	- the root element is not included in the list of names.

### Creating A New Path With Subpath()
	public Path subpath(int beginIndex, int endIndex)
	- The references are inclusive of the beginIndex, and exclusive of
	the endIndex
	- subpath() throws an exception if invalid indices are provided.
> SubPath.java

### Accessing Path Elements With Getfilename(), Getparent(), And Getroot()
#### GETFILENAME()
	- public Path getFileName() 
    	+ returns the Path element of the current file or directory
#### GETPARENT()  
	- public Path getParent()
		+ returns the full path of the containing directory
		+ returns null if operated on the root path or at the top of a relative path
    	* The getParent() does not traverse relative paths outside the current working directory

#### GETROOT()	
	- public Path getRoot()
		+ Returns the root component of this path as a Path object,or null if this path does not have a root component.
	
> PathAccessingDemo.java
	
### Checking Path Type With Isabsolute() And Toabsolutepath()
	System.getProperty("user.dir"). 
	* This is the value that toAbsolutePath() will use when applied to a relative path.
		
	public boolean isAbsolute()
	public Path toAbsolutePath()
	
>  PathCheckingTypeDemo.java
	
### Joining Paths With Resolve()
	public Path resolve(Path other)
	public Path resolve(String other)

  	- resolve() does not clean up path symbols
	- If an absolute path is provided as input to the method, then that is the value that is returned.
	Simply put, you cannot combine two absolute paths using resolve().


### Deriving A Path With Relativize()
	public Path relativize()
	* How to access input from the current path.

  	- If both path values are relative, then the relativize() method computes the paths as if they are in the same current working directory
  	- If both path values are absolute, then the method computes the relative path from one absolute
  	location to another, regardless of the current working directory
	
	- On Windows‐based systems, it also requires that if absolute paths are used, then both paths must have the same root directory or drive letter

> PathDerivingDemo.java
	
### Cleaning Up A Path With Normalize()	
	public Path normalize()
	- Does not remove all of the path symbols; only the ones that can be reduced.
	- Allows us to compare equivalent paths
> PathCleaning.java

### Retrieving The File System Path With Torealpath()
	public Path toRealPath(LinkOption… options) throws IOException
	- Eliminates any redundant path symbols
	- Join the path with the current working directory if the path is relative
	* Throw Exception

## Operating on Files and Directories
### CHECKING FOR EXISTENCE WITH EXISTS()	
	public static boolean exists(Path path, LinkOption… options)
	
### TESTING UNIQUENESS WITH ISSAMEFILE()
	public static boolean isSameFile(Path path, Path path2) throws IOException
	- While most usages of isSameFile() will trigger an exception if the paths do not exist.
	* There is a special case in which it does not. If the two path objects are equal, in terms of equals(), then
	the method will just return true without checking whether the file exists.

	- This isSameFile() method does not compare the contents of the files. 
	Two files may have identical names, content, and attributes, but if they are in different locations, then this method will return false.
	
### MAKING DIRECTORIES WITH CREATEDIRECTORY() AND CREATEDIRECTORIES()
	public static Path createDirectory(Path dir, FileAttribute<?>… attrs) throws IOException
	public static Path createDirectories(Path dir, FileAttribute<?>… attrs) throws IOException
	
	- createDirectories() like mkdirs()
	
### COPYING FILES WITH COPY()
	public static Path copy(Path source, Path target, CopyOption… options) throws IOException
	- When directories are copied the copy is shallow
	- A shallow copy means that the files and subdirectories within the directory are not copied
	- A deep copy means that the entire tree is copied, including all of its content and subdirectories

#### Copying and Replacing Files
	CopyOption.REPLACE_EXISTING
	- Without the REPLACE_EXISTING option, this method will throw an exception if the file already exists.
> FilesDemo.java

#### Copying Files with I/O Streams
	public static long copy(InputStream in, Path target, CopyOption… options) throws IOException
	public static long copy(Path source, OutputStream out) throws IOException
	
#### Copying Files into a Directory
	Notice the way file is copied base on the path string destination
> FilesDemo.java
	
### MOVING OR RENAMING PATHS WITH MOVE()
	public static Path move(Path source, Path target, CopyOption… options) throws IOException
	
### Similarities between move() and copy()
	*** Like copy(), move() requires REPLACE_EXISTING to overwrite the
	target if it exists, else it will throw an exception. 
	Also like copy(), move() will not put a file in a directory if the source is a
	file and the target is a directory. 
	Instead, it will create a new file with the name of the directory.	
	
### Performing an Atomic Move
	Files.move(Path.of("mouse.txt"), Path.of("gerbil.txt"), StandardCopyOption.ATOMIC_MOVE)
	- If the file system does not support this feature, an AtomicMoveNotSupportedException will be thrown
	
	Note that while ATOMIC_MOVE is available as a member of the
	StandardCopyOption type, it will likely throw an exception if passed to a copy() method

### DELETING A FILE WITH DELETE() AND DELETEIFEXISTS()	
	public static void delete(Path path) throws IOException
	public static boolean deleteIfExists(Path path) throws IOException
	
	- To delete a directory, it must be empty. Both of these methods
	throw an exception if operated on a nonempty directory. 
	In addition, if the path is a symbolic link, then the symbolic link
	will be deleted, not the path that the symbolic link points to.	

### READING AND WRITING DATA WITH NEWBUFFEREDREADER() AND NEWBUFFEREDWRITER()
	public static BufferedReader newBufferedReader(Path path) throws IOException
	public static BufferedWriter newBufferedWriter(Path path, OpenOption… options) throws IOException

### READING A FILE WITH READALLLINES()
	public static List<String> readAllLines(Path path) throws IOException
	- Performance concern


## Managing File Attributes
	- A fileattribute is data about a file within the system, such as its size and visibility, that is not part of the file contents
	
### DISCOVERING FILE ATTRIBUTES
#### Reading Common Attributes with isDirectory(), isSymbolicLink(), and isRegularFile()	
	public static boolean isDirectory(Path path, LinkOption… options)
	public static boolean isSymbolicLink(Path path)
	public static boolean isRegularFile(Path path, LinkOption… options)
	- Java defines a regular file as one that can contain content

> FileAtributeDemo.java
	
#### Checking File Accessibility with isHidden(), isReadable(), isWritable(), and isExecutable()
	public static boolean isHidden(Path path) throws IOException
	- A hidden file can't normally be viewed when listing the contents of a directory
	public static boolean isReadable(Path path)
	public static boolean isWritable(Path path)
	public static boolean isExecutable(Path path)

>  FileAccessibilityDemo.java	
	
#### Reading File Size with size()
	- Calling Files.size() on a directory is undefined, and the result depends on the file system	
	*** If you need to determine the size of a directory and its contents, you'll need to walk the directory tree.

> FileSize.java	

#### Checking for File Changes with getLastModifiedTime()
	public static FileTime getLastModifiedTime(Path path, LinkOption… options) throws IOException
	
> FileLastModifiedTimeDemo.java	
	
## IMPROVING ATTRIBUTE ACCESS
	- A view is a group of related attributes for a particular file system type. 
### Understanding Attribute and View Types
	TABLE 20.5 The attributes and view types
| Attributes interface | View interface         | Description                                                                                         |
| -------------------- | ---------------------- | --------------------------------------------------------------------------------------------------- |
| BasicFileAttributes  | BasicFileAttributeView | Basic set of attributes supported by all file systems                                               |
| DosFileAttributes    | DosFileAttributeView   | Basic set of attributes along with those supported by DOS/Windows‐based systems                     |
| PosixFileAttributes  | PosixFileAttributeView | Basic set of attributes along with those supported by POSIX systems, such as UNIX, Linux, Mac, etc. |
		
### Retrieving Attributes with readAttributes()
	public static <A extends BasicFileAttributes> A reaAttributes(Path path,
																Class<A> type,
																LinkOption… options) throws IOException
	*** The BasicFileAttributes class includes many values with the
	same name as the attribute methods in the Files class. 
	The advantage of using this method, though, is that all of the
	attributes are retrieved at once.

### Modifying Attributes with getFileAttributeView()
	public static <V extends FileAttributeView> V getFileAttributeView(Path path,
																	Class<V> type,
																	LinkOption… options)
	
	public void setTimes(FileTime lastModifiedTime, FileTime lastAccessTime, FileTime createTime)
	-> Pass null for any date/time value that we do not want to modify

> FileAttributeDemo.java
	
	
## Applying Functional Programming
### LISTING DIRECTORY CONTENTS
#### list() 
	Deep copy with
		-> FunctionalWithFileDemo.java			
		
### CLOSING THE STREAM
	- The NIO.2 stream‐based methods open a connection to the file system that must be properly closed, else a resource leak could ensue.
	*** If you assumed a stream's terminal operation would automatically close the underlying file resources, you'd be wrong. 
	There was a lot of debate about this behavior when it was first presented, but in short, requiring developers to close the stream won out.	
	*** Please, in your own code, always use try‐with‐resources statements with these NIO.2 methods		
	
### TRAVERSING A DIRECTORY TREE
	Traversing a directory, also referred to as walking a directory tree
	
### DON'T USE DIRECTORYSTREAM AND FILEVISITOR
	- They are older than stream, more code, not a stream
	
### Selecting a Search Strategy
	- A depth‐first search traverses the structure from the root to an arbitrary leaf and then navigates back up toward the root
	- A breadth‐first search starts at the root and processes all elements of each particular depth, before proceeding to the next depth level
	
	*** NIO.2 Streams API methods use depth‐first searching with a depth limit, which can be optionally changed.

### Walking a Directory with walk()
	- walk() uses lazy evaluation and evaluates a Path only as it gets to it
	- default maximum depth of Integer.MAX_VALUE, while the overloaded version allows the user to set a maximum depth
> WalkingDemo.java
	
	* Applying a Depth Limit
	* Avoiding Circular Path
	- The walk() method is different in that it does not follow symbolic links by default and requires the FOLLOW_LINKS option to be enabled.
	- When traversing a directory tree, your program needs to be careful of symbolic links if enabled:
		+ process comes across a symbolic link that points to the root directory of the file system, then every file in the system would be searched
		+ a symbolic link could lead to a cycle, in which a path is visited repeatedly. 
		A cycle is an infinite circular dependency in which an entry in a directory tree points to one of its ancestor directories		
		
### SEARCHING A DIRECTORY WITH FIND()
	public static Stream<Path> find(Path start, 
									int maxDepth, 
									BiPredicate<Path, 
									BasicFileAttributes> matcher, 
									FileVisitOption… options) throws IOException	  	
									
> SearchFileDemo.java		

	- We could have accomplished this using the walk() method along with a call to readAttributes(), this implementation is a lot shorter and more convenient than those would have been. 
	
### READING A FILE WITH LINES()
	public static Stream<String> lines(Path path) throws IOException
	
### FILES.READALLLINES() VS. FILES.LINES()	
	- The readAllLines() method returns a List, not a Stream, so the filter() method is not available.																																		  