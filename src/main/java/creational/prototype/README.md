## Prototype Design Pattern

Prototype Design Patter provides a way to create duplicate object from existing object.

#### Usage

- This pattern is used when creating new object is costly (may be depends on data that read from database or need to 
process data to build it). In this pattern, costly object are stored in cache and new objects are creating simply 
cloning that object.
- Provides a prototype to clone object from existing one.

#### Prototype Design Participants
`Shape` is the prototype of an actual object.

`ShapeStore` is used as a registry service to have all prototypes in cache accessible using type.

`Client (PrototypeTest)` will be responsible for using registry service to access prototype instances.

#### Test
```
Shape shape1 = ShapeStore.getShape(ShapeType.CIRCLE);
Shape shape2 = ShapeStore.getShape(ShapeType.CIRCLE);

Assertions.assertNotEquals(shape1.getShapeCode(), shape2.getShapeCode());
```
