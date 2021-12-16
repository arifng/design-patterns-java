package creational.abstractfactory;

import creational.abstractfactory.roundshape.DashedBorderShapeFactory;
import creational.abstractfactory.shape.ShapeFactory;

/**
 * Created by Rana on 16/12/2021.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(FactoryType factoryType){
        if (FactoryType.DASHED.equals(factoryType)) {
            return new DashedBorderShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
