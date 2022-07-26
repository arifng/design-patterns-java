## Object Pool Design Pattern

Object pool design pattern provides a way to reuse and manage objects which is costly to create.

#### Example
`ObjectPool<T>` holds the real logic. It has two sets - one for available objects and another for uses objects.

Acquire method will get the object, if available set is empty, then it created new one and reference of uses object save 
in uses set. Release method return object to available set for future use. Both methods are synchronised, so only one 
thread can access these method at a time.

`DatabaseConnectonPool` is the concrete pool which extends ObjectPool.

NB - this is very simple object pool method. In real life, pool may create object when it initialized or pool may have 
constants like maximum no of object creation etc.

#### Remarks

- Create abstract `ObjectPool<T>` class with private list of objects (here, set of availables and uses object)
- Create `acquire` and `release` methods in ObjectPool class
- Make an abstract `create` method.

#### Test
```
DatabaseConnection object = databaseConnectionPool.acquire();
Assertions.assertNotNull(object);

// or
DatabaseConnection object = databaseConnectionPool.acquire();
DatabaseConnection object2 = databaseConnectionPool.acquire();
Assertions.assertNotEquals(object, object2);

// or
DatabaseConnection object = databaseConnectionPool.acquire();
databaseConnectionPool.release(object);
DatabaseConnection object2 = databaseConnectionPool.acquire();
Assertions.assertEquals(object, object2);
```



