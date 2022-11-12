# Conditional Logic, Looping, and Arrays


# Conditional Logic
```Java
// Relational Operators
// >, >=, <, <=, ==

// Conditional Assignment
// result = condition ? true-value : false-value;

int v1 = 7;
int v2 = 5;
int vMax = v1 > v2 ? v1 : v2;
```

# If Else Statement
```Java
if (condition)
    true-statement;
else
    false-statement;

if (condition-1)
    true-statement-1;
else if (condition-2)
    true-statement-2;
else
    false-statement;
```

# Block Statements

* A variable declared within a block is not visible outside of the block. Known as the variable's scope.

```Java
{
    int val1 = 0;
    statement-1;
    statement-2;
    ...
}
```

# Logical Operators

* This is used for bit operations. Not have short circuit behaviour.

```Java
&: Both side must be true
^: Exclusive Or (XOR) just one side true the other false
!: Nagation
```

# Conditional Logic Operators
* Have short circuit behaviour.
```Java
&&: Both side must be true
||: One side enough must be true
!: Nagation
```

# Looping
```Java
// While Loop
while(condition)
    statement;


// Do-while Loop
do
    statement;
while(condition);

// For Loop
for(initialize; condition; update)
    statement;
```

# Arrays
Provides an ordered collection of elements

```Java
for(int i = 0; i < theVals.legth; ++i)
    sum += theVals[i];
```

# For-each Loop

```Java
// for (loop-variable-decleration : array)
//     statement;

for(float currentVal : theVals)
    sum += currentVal;
```

# Switch
```Java
// switch(test-value) {
//     case value-1:
//         statements
//     case value-2:
//         statements
//     case value-3:
//         statements
//         break;
//     default:
//         statement
//         break;    
// }
```

* You should add "break" statement to prevent fall through behaviour
