package creational.abstractfactory.shape;

import creational.abstractfactory.AbstractFactory;
import creational.abstractfactory.Shape;
import creational.abstractfactory.ShapeType;

/**
 * Created by Rana on 15/12/2021.
 */
public class ShapeFactory extends AbstractFactory {
    public Shape getShape(ShapeType shapeType) {
        if (ShapeType.CIRCLE.equals(shapeType)) {
            return new Circle();
        } else if (ShapeType.RECTANGLE.equals(shapeType)) {
            return new Rectangle();
        }

        return null;
    }
}
