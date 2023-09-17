import java.util.Objects;

public class Circle extends Ellipse {

    public Circle(double radius) {
        super(radius, radius);
    }

    public double getRadius() {
        return getA();
    }

    

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

   

}
