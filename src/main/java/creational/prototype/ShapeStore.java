package creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rana on 21/12/2021.
 */
public class ShapeStore {
    private static Map<ShapeType, Shape> cache = new HashMap<>();

    static {
        cache.put(ShapeType.CIRCLE, new Circle());
        cache.put(ShapeType.RECTANGLE, new Rectangle());
    }

    public static Shape getShape(ShapeType type) {
        return (Shape) cache.get(type).clone();
    }
}
