package creational.prototype;

/**
 * Created by Rana on 21/12/2021.
 */
public abstract class Shape implements Cloneable {
    protected ShapeType type;

    abstract String getShapeCode();

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
