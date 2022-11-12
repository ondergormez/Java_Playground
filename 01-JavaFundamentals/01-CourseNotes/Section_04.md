# Variables, Data Types, and Math Operators


# Variables
* Strongly typed language
* Value can be modified

```Java
int dataValue;
dataValue = 100;
```

* By convention follw the style often referred to as "Camel Case"
  * First letter is lower case
  * Start of each word after the first is upper case
  * All other letters are lower case


```Java
int myVar;
int anotherVar = 100;
```
## Primitive Data Types
* Built into the language (Not correct information)
* Foundation of all other types (Strong and correct information)
* Four categories of primitive types (Integer, floating point, character, boolean)

### Integer Types
byte (8 bit)
short (16 bit)
int (32 bit)
long (64 bit)

### Floating Point Types
* Implementation of IEEE 754

float (32 bit)
double (64 bit)

## Character and Boolean Types

char regularU = 'U';


## Operator Precedence
* Operators of equal precedence are evaluated left-to-right
* Can override precedence with paranthesis
* Nested paranthesis evaluated from the inside out

Postfix x++ x--
Prefix ++x --x
Multiplicative * / %
Additive + -

# Type Conversion

## İmplicit Type Conversion
* Conversion performed automatically by the compiler
* 
```Java
int iVal = 50;
// Widening conversion
long lVal = iVal;
```

* Widening conversions are automatic. For example in equations above.

## Explicit Type Conversion
* Conversion performed explicitly in code with cast operator
* Use caution with narrowing conversions
* 
```Java
long lVal = 50;
// Narrowing conversion
int iVal = (int) lVal;
```
