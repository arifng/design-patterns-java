package creational.prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Rana on 21/12/2021.
 */
public class PrototypeTest {
    @Test
    public void getShapeWillInvokeCloneMethod() {
        Shape shape1 = ShapeStore.getShape(ShapeType.CIRCLE);
        Shape shape2 = ShapeStore.getShape(ShapeType.CIRCLE);

        Assertions.assertNotEquals(shape1.getShapeCode(), shape2.getShapeCode());
    }
}
