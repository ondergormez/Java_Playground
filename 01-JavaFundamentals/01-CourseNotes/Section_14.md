# Static Members, Nested Types, and Anonymous Classes


# Static Members
* Static members are shared class-wide
* Accessible using the class name


```Java
class Flight {
    private static int allPassengers;

    static int getAllPassengers() {
        return allPassengers;
    }

    static void setAllPassengers(int val) {
        allPassengers = val;
    }
}

// In other module we can simplify the import like this
import static com.companyname.travel.Flight.setAllPassengers;
setAllPassengers(100);

// Or you can use like this
Flight.setAllPassengers(100);
```

# Static Initialization Blocks

* This is the type initializers and use before the type init.
```Java

class Flight {
    // TODO: 
}
```

## Nested Types (Nested and Inner Classses)
* Classes can be declared within classes and interfaces
* Interfaces can be declared within classes and interfaces
* Nested types serve differing purposes
  * Structure and scoping

```Java
public class Passenger implements Comparable {
    // Other codes...

    // Nested Class
    public static class RewardProgram {
        
    }

    // Using nested class
    private RewardProgram rp = new RewardProgram();

    // Inner Class
    private class FligthIterator implements Iterator<Person> {

    }
}
```

## Anonymous Classes
* Anonymous classes are inner classes

```Java

public class Flight implements Iterable<Person> {

    public Iterator<Person> iterator() {

        // Anonymous Class
        return new Iterator<Person>() {

            // Methods
            hasNext {}
            next() {}
        }
    }
}
```
