package creational.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by Rana on 15/12/2021.
 */
public class FactoryTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private ShapeFactory shapeFactory;

    @BeforeEach
    public void setUp() {
        shapeFactory = new ShapeFactory();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void circleTypeShouldCreateCircleInstance() {
        Shape shape = shapeFactory.getShape(ShapeType.CIRCLE);

        Assertions.assertInstanceOf(Circle.class, shape);
    }

    @Test
    public void circleTypInstanceShouldCallDrawMethodOfCircle() {
        Shape shape = shapeFactory.getShape(ShapeType.CIRCLE);
        shape.draw();

        Assertions.assertEquals("Draw Circle", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void rectangleTypeShouldCreateRectangleInstance() {
        Shape shape = shapeFactory.getShape(ShapeType.RECTANGLE);

        Assertions.assertInstanceOf(Rectangle.class, shape);
    }

    @Test
    public void rectangleTypInstanceShouldCallDrawMethodOfRectangle() {
        Shape shape = shapeFactory.getShape(ShapeType.RECTANGLE);
        shape.draw();

        Assertions.assertEquals("Draw Rectangle", outputStreamCaptor.toString()
                .trim());
    }
}
