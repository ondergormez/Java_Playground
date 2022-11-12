# A Closer Look at Parameters

## Parameter Immutability
Immutability: Değişmezlik

* Passing by-value in primitive types. Changes made to passed value are not visible outside of method
* Passing by-reference in class types. Changes made to members of passed class instances are visible outside of method.
```Java
void swap(int i, int j) {
    int k = i;
    i = j;
    j = k;
}

main {

    int val1 = 10;
    int val2 = 20;

    swap(val1, val2);
    System.out.println(val1); // Output 10
    System.out.println(val2); // Output 20
}

// Take affect after the method call
swap(Flight i, Flight j) {
    int k = i;
    i = j;
    j = k;
}
```

## Overloading
* A class may have multiple versions of its constructor or methods
* Also take affect with parameter types
* Automatic conversion applied in overloading if necessary (short --> int etc.)
* If not parameter type matching, if it is possible, automatic conversion applied.

```Java
public Flight() {

}

public Flight(int seatCount) {
    this.seatCount = seatCount;
}

short count = 10;

// Automatic short to int conversion
// Implicit widening conversion
Flight f1 = new Flight(count);
```

## Variable Number of Parameters
* Can only be the last parameter

```Java
public void addPassengers(Passenger[] list) {
    
}

public void addPassengers(Passenger... list) {
    
}
```
