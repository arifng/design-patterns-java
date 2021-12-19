## Template Method Design Patter

- Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. 

- Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithms structure.

#### Example
`DataParser` define the steps of algorithm. The purpose of this parser is to read data from different source,
then parse it based on different data format and write in unified format.

So, write method implemented by `DataParser`, other two methods made abstract so that subclass must implement its 
base own logic.

#### Remarks

- `DataParser`'s `parseDataAndGenerateOutput()` method is Template method.

#### Test
```
DatabaseDataParser dataParser = Mockito.mock(DatabaseDataParser.class);
dataParser.parseDataAndGenerateOutput();

InOrder order = Mockito.inOrder(dataParser);

order.verify(dataParser).readData();
order.verify(dataParser).processData();
order.verify(dataParser).writeData();
```