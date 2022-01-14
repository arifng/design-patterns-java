## Builder Design Pattern

- It separates object construction so that same object has different representation.


#### Example
A `Person` class contains three fields - `name`, `age` and `address`. 
When we will create an object of Person, then sometimes all fields are not required. 

Now, if we want to create objects with only desired fields, then we need lots of constructor 
which leads new problem called `telescoping constructors problem`, unless we add setter method. 
But if we add setter method, then we will loose immutability.

So, builder patterns provides a common mechanism to create object step by step, so that we can create object
with only our desired input which provides different representation.


#### Remarks

- `PersonBuilder` is the builder class. With the help of this we can use common way to build Person object.
- `Person` is the real class, currently has three fields but it may have many fields. Immutability achieved by 
removing setter methods.

#### Test
```
Person person = Person.builder()
        .name("Person name")
        .build();

Assertions.assertEquals("Person name", person.getName());

// Other nulls
Assertions.assertNull(person.getAddress());
Assertions.assertNull(person.getAge());
```