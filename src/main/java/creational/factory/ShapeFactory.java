package creational.factory;

/**
 * Created by Rana on 15/12/2021.
 */
public class ShapeFactory {
    public Shape getShape(ShapeType shapeType) {
        if (ShapeType.RECTANGLE.equals(shapeType)) {
            return new Rectangle();
        } else if (ShapeType.CIRCLE.equals(shapeType)) {
            return new Circle();
        }

        return null;
    }
}
