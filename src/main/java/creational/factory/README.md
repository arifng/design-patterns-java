## Factory Design Pattern

- Provides a way to create instance without exposing creation logic.
- A Factory class should have a method which take input and return different instance based on input.
- The return instances should inherit a common interface/class.

#### Example
A `Shape` interface inherited by different shapes (here - `Rectangle` and `Circle`).

`ShapeFactory` exposes a factory method `getShape` which return instances based on `ShapeType`.


#### Remarks

- `ShapeFactory`'s `getShape` is a factory method.

#### Test
```
ShapeFactory shapeFactory = new ShapeFactory();

Shape instance1 = shapeFactory.getShape(ShapeType.CIRCLE);
Shape instance2 = shapeFactory.getShape(ShapeType.RECTANGLE);

Assertions.assertInstanceOf(Circle.class, instance1);
Assertions.assertInstanceOf(Rectangle.class, instance2);
```