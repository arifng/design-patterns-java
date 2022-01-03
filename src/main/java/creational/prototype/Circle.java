package creational.prototype;

/**
 * Created by Rana on 21/12/2021.
 */
public class Circle extends Shape {
    public Circle() {
        type = ShapeType.CIRCLE;
    }

    @Override
    String getShapeCode() {
        return "Circle hashcode - " + this.hashCode();
    }
}
