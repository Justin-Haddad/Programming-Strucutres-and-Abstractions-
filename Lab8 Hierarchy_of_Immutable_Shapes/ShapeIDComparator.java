import java.util.Comparator;

public class ShapeIDComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape shape1, Shape shape2) {
        return Long.compare(shape1.getID(), shape2.getID());
    }
}
