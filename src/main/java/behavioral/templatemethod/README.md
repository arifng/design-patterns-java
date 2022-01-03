## Template Method Design Pattern

- Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. 

- Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithms structure.

#### Example
`DataParser` define the steps of algorithm. The purpose of this parser is to read data from different source,
then parse it based on different data format and write in unified format.

So, write method implemented by `DataParser`, other two methods made abstract so that subclass must implement its 
base own logic.

- `DataParser`'s `parseDataAndGenerateOutput()` method is Template method.

#### Remarks

- Abstract class defines templateMethod().

- Concrete classes implements abstract method, may override other method except template.

- The Template Method pattern makes use of the Hollywood Principle: Don't call us, we'll call you.

- When broken down, there are four different types of methods used in the parent class: 

    - Concrete methods: Standard complete methods that are useful to the subclasses. These methods are usually utility methods.

    - Abstract methods: Methods containing no implementation that must be implemented in subclasses.

    - Hook methods: Methods containing a default implementation that may be overridden in some classes. Hook methods are intended to be overridden, concrete methods are not.

    - Template methods: A method that calls any of the methods listed above in order to describe the algorithm without needing to implement the details.

#### Test
```
DatabaseDataParser dataParser = Mockito.mock(DatabaseDataParser.class);
dataParser.parseDataAndGenerateOutput();

InOrder order = Mockito.inOrder(dataParser);

order.verify(dataParser).readData();
order.verify(dataParser).processData();
order.verify(dataParser).writeData();
```