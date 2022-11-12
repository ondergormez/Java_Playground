# Exceptions and Error Handling

## Error Handling with Exceptions
Intrusive: Causing disruption or annoyance through being unwelcome or uninvited.
* Needs to be implicit in application development
* The traditional approach of checking error codes/flags is too intrusive
* Excpetions provide a non-intrusive way to signal errors

```Java
try {

} catch (Exception e)  {
    System.out.println("Error: " + e.getMessage());
    e.printStackTrace();
} final {

}

try {
    reader = new BufferReader(new FileReader("xyz.txt"));
} catch (Exception e){
    
} finally {
    // Clean up activities. You need to close file handle
    if (reader != null)
        reader.close();
}

```

# Exception Class Hierarchy
```Java

// Object --> Throwable --> Error -->
// Object --> Throwable --> Error --> LinkageError
// Object --> Throwable --> Error --> Exception

// Unchecked Exceptions
// Object --> Throwable --> Error --> Exception --> RunTimeException
// Object --> Throwable --> Error --> Exception --> RunTimeException --> NullPointerException

// Checked Exceptions
// Object --> Throwable --> Error --> Exception --> IOException
// Object --> Throwable --> Error --> Exception --> IOException --> FileNotFoundException
```

## Exceptions and Methods
* Excpetions propagate up the call stack. Can cross method boundries

```Java

public void addPassengers(String filename) throws IOException {

    // This method not handle the exception, but close the file opened here...
    // Caller responsibile to catch the exception 
    try {
        reader = new BufferReader(new FileReader("xyz.txt"));
    }
    finally {
        // Clean up activities. You need to close file handle
        if (reader != null)
            reader.close();
    }
}

```

* The throws clause of an overriding method must be compatible with the throws clause of the overriden method of base class
  * Can exclude exceptions
  * Can have the same exception
  * Can have a derived exception

## Custom Exceptions

```Java
public class InvalidStatementException extends Exception {
    public InvalidStatementException(String reason, String statement) {
        super(reason + ": " + statement);
    }
}

inOtherMethod() {
    // More codes...

    String[] parts = statement.split(" ");

    if (parts.length != 3)
        throw new InvalidStatementException("Incorrect number of fields", statement);

    // More codes...
}

// Catching the exception
catch (InvalidStatementException e) {

    System.out.println(e.getMessage());

    if (e.getCause() != null)
        System.out.println(" Original exception: " + e.getCause().getMessage());
}

```
