Working with Dates and Times
	java.time.LocalDate
	java.time.LocalTime
	java.time.LocalDateTime -> Day and time with no time zone
	java.time.ZonedDateTime
	
	DateTimeFormatter
	-> The DateTimeFormatter will throw an exception if it encounters an incompatible type
	- DateTimeFormatter supports a custom format using a date format String.
	LocalDateTimeDemo.java
	

	Learning the Standard Date/Time Symbols	
	- need to make sure the format String is compatible with the underlying date/time type
	
	Selecting a format() Method
	- The date/time classes contain a format() method that will take a formatter, while the formatter classes contain a format()
	method that will take a date/time value
	
	Adding Custom Text Values
	- escape the text by surrounding it with a pair of single quotes
	- Java supports this by putting two single quotes next to each other
	
	
	Supporting Internationalization and Localization
	- Locale.getDefault() <> Language code_country code
	- the constructors to create a new object
	- use builder design pattern 
	
	LOCALIZING NUMBERS
	NumberFormat.getInstance(locale)
	NumberFormat.getNumberInstance(locale)
	NumberFormat.getCurrencyInstance(locale)
	NumberFormat.getPercentInstance(locale)
	NumberFormat.getIntegerInstance(locale)
	
	In the real world, use int or BigDecimal for money and not
	double. Doing math on amounts with double is dangerous
	because the values are stored as floating‐point numbers.
	
	Parsing Numbers
		The lesson is to make sure that you parse using the right locale!
	
	LOCALIZING DATES
		DateTimeFormatter with FormatStyle	-> SHORT, MEDIUM, LONG, and FULL
		
	LOCALE CATEGORY	
		- The Locale.Category enum is a nested element in Locale
		DISPLAY
		FORMAT
		
		- call Locale.setDefault() with a locale, both the DISPLAY and FORMAT are set together
		
Loading Properties with Resource Bundles

	PICKING A RESOURCE BUNDLE
	When Java is searching for a matching resource bundle, it will first check for a resource bundle file with the matching class name
	load-rb-locale-order.png

	SELECTING RESOURCE BUNDLE VALUES
		- finding the matching resource bundle to use as a base
	 	It can get them from any
		parent of the matching resource bundle. A parent resource
		bundle in the hierarchy just removes components of the name
		until it gets to the top	
		
		Zoo_fr_FR  
			Zoo_fr_FR.properties
			Zoo_fr.properties
			Zoo.properties
			
		- Once a resource bundle has been selected, only properties
		along a single hierarchy will be used	
		
		- MissingResourceException -> if there is no rb property
		
FORMATTING MESSAGES
	MessageFormat

USING THE PROPERTIES CLASS	
	java.util.Properties
		- getProperty() support default value
		- ensures you don't add data to the Properties object that cannot be read.
		(a Properties object works only with String values)