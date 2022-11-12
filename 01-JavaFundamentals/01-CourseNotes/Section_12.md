# Working with Packages

## What is a Package?

A package is a group of related types
* Create a namespace
* Provide an access boundry
* Act as a unit of distribution

## Packages as a Namespace

* Convention creates unique package name
* Reverse domain name structure
* Type name is qualified by package name

com.companyname.travel.Fligth lax175 = ...

## Determining a Type's Package

* Allows use of a type's simple name in code
* Types in current package do not need to be qualified

```Java
// Single type import
// This much safer than other import type
import com.companyname.travel.Fligth;
import com.companyname.travel.Passenger;

// Represents a instance of com.companyname.travel.Fligth
Fligth lax175 = ...

// Import on demand. Use with caution
// You can import all classes with below
import com.companyname.travel.*;

```

## Limiting Access to Package Contents

no access modifier: Only with its own package (package private)
public: Everywhere
private: Only within its own class
protected: Only within its own class and subclasses

## Distributing Packages and Archive Files

Packages provide a predictable software structure

### Archive Files
Archive Files: Places package folder structure into a single file. Supports compressing content
* The jar command-line utility and IDE support
* Build automation systems: Commonly known as build managers (Gradle, Maven)


### IntelliJ IDEA

Sub Packages
out/production/com/companyname/calcengine
out/production/com/companyname/myapp

.../out/production/com/companyname/
File --> Project Structure --> Artifacts
Click "+" icon --> select com.companyname.myapp.Main 

In Build --> Build Artifacts
/out/artifacts/CalcEngine_jar$ java -jar CalcEngine.jar

Jar file is a basically a zip file includes "*.class" files ana "META-INF" file
