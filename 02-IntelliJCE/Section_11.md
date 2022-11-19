# Testing in IntelliJ CE

## Testing with JUnit

* Create test for each package seperately
* Right Click --> New --> Directory
* Set name as "test". Right Click --> Mark Directory as --> Test Sources Root
* Add package inside this folder like com.companyName.RD....
* 
* 

```Java
public class MyTest {
    @Test
    public void isNameCorrectTest() {
        String expectedName = "myname";
        String currentName =O "myname";
        Assert.assertEquals(expectedName, currentName);
    }
}
```

* Right Click to file and select run test
* Run All test is other option to run all the test inside the same directory. (This add new run configuration automatically)
* If you click new class name, IntelliJ offers new test window. You can create test stub easly


```Java
Array myArray;

@Before
public void setUp throws Excetion  {
    myArray = new Array();
}
```

## Code Coverage

* Right Click a test folder or file and Run with Coverage 
* You can see the coverage in the project explorer also