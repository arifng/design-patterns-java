package creational.abstractfactory;

import creational.abstractfactory.roundshape.DashedBorderCircle;
import creational.abstractfactory.roundshape.DashedBorderRectangle;
import creational.abstractfactory.shape.Circle;
import creational.abstractfactory.shape.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by Rana on 16/12/2021.
 */
public class AbstractFactoryTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private AbstractFactory normalShapeFactory;
    private AbstractFactory dashedBorderShapeFactory;

    @BeforeEach
    public void setUp() {
        normalShapeFactory = FactoryProducer.getFactory(FactoryType.NORMAL);
        dashedBorderShapeFactory = FactoryProducer.getFactory(FactoryType.DASHED);
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void circleTypeShouldCreateCircleInstance() {
        Shape shape = normalShapeFactory.getShape(ShapeType.CIRCLE);

        Assertions.assertInstanceOf(Circle.class, shape);
    }

    @Test
    public void circleTypInstanceShouldCallDrawMethodOfCircle() {
        Shape shape = normalShapeFactory.getShape(ShapeType.CIRCLE);
        shape.draw();

        Assertions.assertEquals("Draw Circle", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void rectangleTypeShouldCreateRectangleInstance() {
        Shape shape = normalShapeFactory.getShape(ShapeType.RECTANGLE);

        Assertions.assertInstanceOf(Rectangle.class, shape);
    }

    @Test
    public void rectangleTypInstanceShouldCallDrawMethodOfRectangle() {
        Shape shape = normalShapeFactory.getShape(ShapeType.RECTANGLE);
        shape.draw();

        Assertions.assertEquals("Draw Rectangle", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void dashedBorderCircleTypeShouldCreateDashedBorderCircleInstance() {
        Shape shape = dashedBorderShapeFactory.getShape(ShapeType.CIRCLE);

        Assertions.assertInstanceOf(DashedBorderCircle.class, shape);
    }

    @Test
    public void dashedBorderCircleTypInstanceShouldCallDrawMethodOfDashedBorderCircle() {
        Shape shape = dashedBorderShapeFactory.getShape(ShapeType.CIRCLE);
        shape.draw();

        Assertions.assertEquals("Draw DashedBorderCircle", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    public void dashedBorderRectangleTypeShouldCreateDashedBorderRectangleInstance() {
        Shape shape = dashedBorderShapeFactory.getShape(ShapeType.RECTANGLE);

        Assertions.assertInstanceOf(DashedBorderRectangle.class, shape);
    }

    @Test
    public void dashedBorderRectangleTypInstanceShouldCallDrawMethodOfDashedBorderRectangle() {
        Shape shape = dashedBorderShapeFactory.getShape(ShapeType.RECTANGLE);
        shape.draw();

        Assertions.assertEquals("Draw DashedBorderRectangle", outputStreamCaptor.toString()
                .trim());
    }
}
