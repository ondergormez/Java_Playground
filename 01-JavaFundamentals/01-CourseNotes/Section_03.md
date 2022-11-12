# Creating a Simple App

```Java

System.out.println("Hello World");

// Line comments

/*
Block comments
*/

/** JavaDoc commnets */
```

## Java Packages

package com.companyname.example;

* All must be lowercase
* Use reversed domain name to assure global uniqueness
  * package com.companyname.myproject;
  * package com.companyname.accounting.myproject;
  * package com.companyname.rd.myproject;
* Java requires no correlation between package names and source code file structure.
* But most IDE's requre a sub-folder for each part of the package name
  * .../src/com/companyname/example/Main.java


```sh
# Run the output like below;
.../out/production/HelloWorld$ java com.companyname.example.helloworld.Main
```
