## Singleton Design Pattern

Singleton Design Pattern ensures there should be only one instance of a class.

#### Remarks

- Encapsulated "just-in-time initialization" or "initialization on first use".

#### Test
```
Singleton instance1 = Singleton.getInstance();
Singleton instance2 = Singleton.getInstance();

Assertions.assertEquals(instance1, instance2);
```

##### Eager initialization
The example shown in the class is lazy initialization. There is other way to initialize singleton class which is called
eager initialization.

```
class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {}
 
    public static Singleton getInstance() {
        return singleton;
    }
}
```