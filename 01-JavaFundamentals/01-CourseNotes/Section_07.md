# Class Initializers and Constructors

# What to Expect in This Module
* Establishing initial state
* Field initializers
* Constructors
* Constructor chaining & visibility
* Initialization blocks

# Field Initial State

* Can be a simple assingment
* Can be an equation
* Can be reference to other fields
* Can be a method call


```Java
public class Earth {
    long circumferenceInMiles = 24901;
    // Legal and true statement below
    long circumferenceInKilometers = Math.round(circumferenceInMiles * 1.6d);
}
```

# Constructor

* Constructor does not have the return type
* If you don't have written constructor, Java write one for you. If you have at least one, Java don't write for you.
* A class can have multiple constructors

# Chaining Constructors

* You can call other constructors inside the constructor. So that you can simplify the initialization.

```Java
public Passenger(int freeBags) {
    // Do a lot of stuff...
}

public Passenger(int freeBags, int checkedBags) {
    this(freeBags); // With this you can increase the maintainability
    // Do a lot of stuff...
}
```

# Initialization Blocks

* If you have a process that should be executed before the all the constructor that class have,  you can use this
* Executed as if the code were placed at the start of each constructor.
* Multiple initialization blocks also possible.

```Java
// Initialization Block
// Automatically executed before each constructor call.
{
    isSeatsAvailable = new int[seatCount];

    for (int i = 0; i < seatCount; ++i)
        isSeatsAvailable[i] = true;
}

public Flight() {

}

public Flight(int seatCount) {
    this.seatCount = seatCount;
}
```
