## Abstract Factory Design Patter

- A super-factory which creates other factories.
- Responsible for creating a factory of related objects.
- Each generated factory can generate objects as per [Factory pattern](src/main/java/creational/factory).

#### Example
A `AbstractFactory` class inherited by different factories (here - `ShapeFactory` and `DashedBorderShapeFactory`).

`FactoryProducer` exposes a factory method `getFactory` which return instances based on `FactoryType`.

Specific factory is responsible to generate their own available shapes.

#### Remarks

- `FactoryProducer`'s `getFactory` is responsible to generate `AbstractFactory` typed instances.

#### Test
```
AbstractFactory normalShapeFactory = FactoryProducer.getFactory(FactoryType.NORMAL);
AbstractFactory dashedBorderShapeFactory = FactoryProducer.getFactory(FactoryType.DASHED);

Shape instance1 = normalShapeFactory.getShape(ShapeType.CIRCLE);
Shape instance2 = dashedBorderShapeFactory.getShape(ShapeType.CIRCLE);

Assertions.assertInstanceOf(Circle.class, instance1);
Assertions.assertInstanceOf(DashedBorderCircle.class, instance2);
```