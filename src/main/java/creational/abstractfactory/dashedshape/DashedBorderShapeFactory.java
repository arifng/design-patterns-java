package creational.abstractfactory.dashedshape;

import creational.abstractfactory.AbstractFactory;
import creational.abstractfactory.Shape;
import creational.abstractfactory.ShapeType;

/**
 * Created by Rana on 15/12/2021.
 */
public class DashedBorderShapeFactory extends AbstractFactory {
    public Shape getShape(ShapeType shapeType) {
        if (ShapeType.RECTANGLE.equals(shapeType)) {
            return new DashedBorderRectangle();
        } else if (ShapeType.CIRCLE.equals(shapeType)) {
            return new DashedBorderCircle();
        }

        return null;
    }
}
