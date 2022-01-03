package creational.prototype;

/**
 * Created by Rana on 21/12/2021.
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = ShapeType.RECTANGLE;
    }

    @Override
    String getShapeCode() {
        return "Rectangle hashcode - " + this.hashCode();
    }
}
