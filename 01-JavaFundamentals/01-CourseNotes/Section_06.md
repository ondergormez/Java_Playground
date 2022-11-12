# Representing Complex Types with Classes

Object Oriented Programming
Encapsulate Data, Operations, Semantic Details

```Java
// Flight.java
class Flight {
    public int passengers;
    private int seats;

    void add1Passenger() {
        if (passengers < seats) {
            passengers++;
        }

    }

    private void handleTooMany() {
        System.out.println("Too many");
    }
}


Flight flight1 = new Flight();
Flight flight2 = new Flight();

flight2 = flight1;

flight1.add1Passenger();
flight1.add1Passenger();

// flight2 hold reference to flight1
// Output: 2
System.out.println(flight2.passengers);
```

## Naming Classes
* Pascal Casting

```Java
class BankAccount;
```

## Method Basics

* The end of the method is reached
* A return statement is encountered
* An error occurs

```Java

// return-type name(typed-parameter-list) {
//     statements
// }

void showSum(float x, float y, int count) {
    float sum = x + y;

    for (int  i = 0; i < count; ++i)
        System.out.println(sum);
}

public class Flight {
    int passengers;

    public boolean hasRoom(Flight f2) {
        int total = passengers + f2.passengers;
        return total <= seats;
    }
}
```

# Special References (this and null)

* **this** is an explicit reference to the current object
* **null** is a reference literal. Represents an uncreated object. Can be assigned any reference object.

Flight lax3 = null;

# Field Encapsulation
* In most cases, a class' fields not directly accessed via outside of the class

```Java
public class Flight {
    private int seats;

    public int getSeats() {
        return seats;
    }

    public void setSeates(int seats) {
        this.seats = seats;
    }
}
```
