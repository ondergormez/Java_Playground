# More About Data Types

* String class
* StringBuilder class
* Primitive wrapper classes
* Final fields
* Enumeration types

## String Class
* Stored in ETF-16 Encoding
* String object are immutable

## String Equality

```Java
String s1 = "I Love";
s1 += " Java";

String s2 = "I";
s2 += " Love Java";

// Result: false
// Reference equality comparision
if (s1 == s2)
    // Do something

// Result: true
// Content equality comparision
if (s1.equals(s2))
    // Do something

String s3 = s1.intern();
String s4 = s2.intern();

// Result: true
// TODO: Research why equal?
if (s3 == s4)
```

## Converting Non-string Types to Strings

* Conversion often implicitly

```Java
int iVal = 100;
String sVal = String.valueOf(iVal);

```

* Class conversions controlled by the class' toString method


```Java
public class Flight {

    @Override
    public String toString() {
        return System.out.println("Flight Number: " + flightNumber);
    }
}
```

## StringBuilder Class
Mutable: Değişken
* StringBuilder provides mutable string buffer
* For best performance, pre-size the buffer
  * If needed, will grow automatically.


```Java
StringBuilder sb = new StringBuilder(40);

sb.append("I flew to ");
sb.append("California");

// sb.capacity() ---> 40
// sb.length() ---> 20

int time = 9;

sb.insert(pos, " at ");
sb.insert(pos + 4, time);

String message = sb.toString();
```

## Primitive Wrapper Classes

* Classes provide convenience
* Primitives provide efficiency

```Java
// Integer wrapper class
Integer a = 100;
// Primitive variable
int b = a;

Integer c = b;

```

* Wrapper classes provide methods for explicit conversions

```Java
Integer a = 100;
int b = a;
Integer c = b;

// Primitive to wrapper
// Known as boxing
Integer d = Integer.valueOf(100);
Integer f = Integer.valueOf(d);

// Wrapper to primitive
// Known as unboxing
int e = d.intValue();

```

## Wrapper Class Equality

```Java
Integer i1000A = 10 * 10 * 10;
Integer i1000B = 100 * 10;

// Result: false
// Reference comparision
if (i1000A == i1000B)
    // do something

// Result: true
// Primitive type comparision inside the class
if (i1000A.equals(i1000B))
    // do something


Integer i8A = 4 * 2;
Integer i8B = 2 * 2 * 2;


// Boxing conversions that always return the same wrapper class instance
// Result: true
// TODO: Why this differs from the above reference conversion
if (i8A == i8B)
    // do something
```

## Final Fields and Enumerations

```Java
static final int MAX_FAA_SEATS = 550;
```

* Enumeration types useful for defining a type with a finite list of valid values
```Java
public enum FlightCrewJob {
    Pilot,
    CoPilot,
    FligthAttendant,
    AirMarshal
}
```




