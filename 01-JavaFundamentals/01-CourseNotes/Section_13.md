# Creating Abstract Relationships with Interfaces

## What an Interface is
* An interface defines a contract
* Provides no implementation



```Java

public class Passenger implements Comparable {
    // A lot of implementation codes here...

    private int memberLevel; // First Class (1), Second Class (2), ...
    private int memberDays;

    public int compareTo(Object o) {
        // You have to check the object "o" really instance of Passenger
        Passenger p = (Passenger)o;

        if (memberLevel < p.memberLevel)
            return -1;
        else if (memberLevel > p.memberLevel)
            return 1;
        else {
            if (memberDays > p.memberDays)
                return -1;
            else if (memberDays < p.memberDays)
                return 1;
            else
                return 0;
        }
    }
}

int main() {
    Passenger alice = new Passenger();
    alice.setLevelAndDays(2, 180);

    Passenger bob = new Passenger();
    bob.setLevelAndDays(1, 180);

    Passenger hasan = new Passenger();
    hasan.setLevelAndDays(1, 90);

    Passenger[] passengers = { alice, bob, hasan };
    // Uses method "compareTo" from Comparable interface
    Arrays.sort(passengers);

    // Sorted Result: Bob, Hasan, Alice
}

```

## Implementing an Interface

### Implementing a Generic Interface

```Java
public interface Comparable<T> {
    int compareTo(T o);
}

public class Flight implements Comparable<Flight> {

    public int compareTo(Flight f) {
        return flightTime - f.flightTime();
    }
}
```

## Implementing Multiple Interfaces
* Classes can implement multiple interface, but not derived multiple base class

```Java

public class CrewMember extends Person { }
public class Passenger extends Person { }

public interface Iterator<T> {
    boolean hasNext();
    T next();
}

public class FlightIterator
 implements Iterator<Person> {

    private CrewMember[] crew;
    private Passenger[] roster;
    private int index = 0;

    public FlightIterator(CrewMember[] crew, Passenger[] roaster) {
        this.crew = crew;
        this.roster = roster;
    }

    boolean hasNext() {
        return index < (crew.length + roster.length);
    }

    public Person next() {
        Person p = (index < crew.length) ?
        crew[index] : roster[index - crew.length];
        ++index;
        return p;
    }
 }


public interface Iterable<T> {
    Iterator<T> iterator();
}


public class Flight
 implements Comparable<Flight>, Iterable<Person> {
    private CrewMember[] crew;
    private Passenger[] roster;

    public int compareTo(Flight f) {
        return flightTime - f.flightTime();
    }

    public Iterator<Person> iterator() {
        return new FlightIterator(crew, roster);
    }
}
```

## Declaring an Interface

* Interface can have methods. This can implicitly public
* Can have constants. Typed named values. Can implicitly public, final, static
* An interface can extend another interface
