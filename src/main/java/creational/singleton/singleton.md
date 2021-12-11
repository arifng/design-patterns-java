## Singleton Design Patter

Singleton Design Patter ensures there should be only one instance of a class.

#### Remarks

- Encapsulated "just-in-time initialization" or "initialization on first use".

#### Test
```
Singleton instance1 = Singleton.getInstance();
Singleton instance2 = Singleton.getInstance();

Assertions.assertEquals(instance1, instance2);
```