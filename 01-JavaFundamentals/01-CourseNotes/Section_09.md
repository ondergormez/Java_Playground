# Class Inheritance

## Inheritance Basics

Derived class has the capability of the base class

```Java
public class CargoFlight extends Flight{
    // CargoFlight also flight
}
```

## Member Hiding and Overriding

* Can be assigned to base class typed references
* Derived class hides base class datas
* Fields hide base class fields with same name
* Methods override base class methods with same signature

```Java
public class Flight {
    int seats = 150;
}

public class CargoFlight extends Flight {
    int seats = 12;
}

main {
    CargoFlight cf = new CargoFlight();

    print(cf) // Output 12

    Flight f = cf;

    print(f) // Output 150
}
```

* "**@override**" annotation make the basic checks in derived class with parameter matching etc. This is the compile time action.

## The Object Class

* The object class is the root of the Java class hierarchy.
* Every class inherits directly or indirectly from the Object class.

```Java
Object objets = new Objects[3];
objects[0] = new Fligth[5];

// Wrong
o.add1Package();

Flight f = (Flight)o;
// Correct
f.add1Package();
```

## Object Equality
```Java
Flight f1 = new Flight(175);
Flight f2 = new Flight(175);

// Object class
// return false equality statement
if (f1 == f2)
    // do something


// Object class
// return false equality method
if (f1.equals(f2))
    // do something
```

```Java

class Flight {

    // If we implement and override, this method calls
    @override
    public boolean equals(Object o) {

        if ((o instanceof Flight) == false)
            return false;

        Flight other = (Flight)o;

        return flightNumber == other.flightNumber;

    }
}

// in this context

// Object class
// return false equality statement
if (f1 == f2)
    // do something


// Flight class
// return true equality method
if (f1.equals(f2))
    // do something
```

## The Super Keyword
Similar to this, super is an implicit reference to the current object
* Useful for accessing overridden base class methods

```Java

class Flight {

    @override
    public boolean equals(Object o) {

        // This will be cause a recursive call the function itself
        // if (equals(o))
        //     return true;

        // Correct way of doing this
        if (super.equals(o))
            return true;

        
        // Do the other tasks...

    }
}
```

## Final and Abstract

* Controlling inheritance and overriding
* By default permits all methods overridable

```Java
public final class Passenger {
    // ...
}

// Same meaning
final public class Passenger {
    // ...
}

public class Passenger {
    // ...

    // Selectively blocking override mechanism
    // You can't override this method
    public final void a() {}

    // You can override this method
    public void b(){}
}
```

* If you have one or more abstract methods you have to mark the class abstract

```Java
public abstract class Passenger {
    
    public abstract boolean canAccept(Flight f);
    
}
```
