## Strategy Design Pattern

- A class behavior or its algorithm can be changed at run time.

- Creating objects which represent various strategies and a context object whose behavior varies as per its strategy 
object. The strategy object changes the executing algorithm of the context object.

- The Strategy pattern is to be used where we want to choose the algorithm to use at runtime.
 A good use of the Strategy pattern would be saving files in different formats, running various sorting algorithms, or 
 file compression.

#### Example
`ZipCompressionStrategy` and `RarCompressionStrategy` both implements `CompressionStrategy` interface. 

A `CompressionContext` will run the common way to create  based on strategy.

#### Remarks

- Strategy (`CompressionStrategy`) - defines an interface common to all supported algorithms. Context uses 
this interface to call 
the algorithm defined by a ConcreteStrategy.

- ConcreteStrategy (`ZipCompressionStrategy` and `RarCompressionStrategy`) - each concrete strategy implements 
an algorithm.

- Context (`CompressionContext`) - contains a reference to a strategy object.

#### Test
```
// For checking printing value
final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
System.setOut(new PrintStream(outputStreamCaptor));

// test data
File file = new File("/test.txt");

CompressionContext context  = new CompressionContext();
context.setCompressionStrategy(new ZipCompressionStrategy());
context.createArchive(Arrays.asList(file));

// test result
Assertions.assertEquals("Compress files to ZIP", outputStreamCaptor.toString()
                .trim());
```