## TEXTBLOCK
## Defining Text Blocks
    - Also known as multiline strings.
    - A text block starts and ends with three double quotes (""")
    - The contents do not need to be escaped

    - Essential whitespace is part of your String and is important to you
    - Incidental whitespace just happens to be there to make the code easier to read

    - Text blocks require a line break after the opening """.
    - The \ tells Java not to add a new line before.
    - The \n gives a blank line since it is at the end of the line.
    - Keep the trailing spaces with \s and in addition to add a space.
  

## Whitespace TERM
    - whitespace in indent() and strip() terms: line break (\n), space separators
    - strip() ->  with all leading and trailing white space removed. 
## Methods
### indent(int n)
    - If n > 0 then add n spaces to beginning of line. Add line break at the end if missing
    - If n < 0 then up to n white space characters are removed from the beginning of each line.Add line break at the end if missing
    - If a given line does not contain sufficient white spaces then all leading white space characters are removed.
    - If n < 0 then unchanged.However, line terminators are still normalized.(add a new line to the last)
	
	
### stripIndent()
	  - Remove all leading incidential whitespaces. Based on the how many leading whitespace at the first characters
