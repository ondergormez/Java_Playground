# Code Inspection and Intentions

* Press Double Shift and typing analyze. You can find the analyze code in the context menu.
* Intentions used for refactoring the code that more efficient working. You can use Alt + Enter to get some insights (intentions) from the IntelliJ IDEA.
  * For example if you have a string literal + variable, you can refactor this with string format.

```Java
    {int a=10;
        // System.out.println("Hello: " + a);
        // This much more efficient
        System.out.printf("Hello: %d%n",a);}
```
