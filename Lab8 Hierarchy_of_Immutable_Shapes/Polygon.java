
public abstract class  Polygon extends Shape {
private double perimeter;

protected Polygon(double...sides) {
	if (sides == null)
	{
	throw new  IllegalArgumentException("null sides");
	}
	if (sides.length < 3)
	{
		throw new  IllegalArgumentException("Invalid number of sides: " + sides.length);
	}
	 double sum = 0;
	    for (double side : sides) {
	        if (side <= 0) {
	            throw new IllegalArgumentException("Nonpositive side: " + side);
	        }
	        sum += side;
	    }
	    for (double side : sides) {
	        if (side >= sum - side) {
	            throw new IllegalArgumentException("Polygon inequality violated: " + side + " >= " + (sum - side));
	        }
	    }
	    this.perimeter = sum;
	
}
@Override
public double getPerimeter() {
	return perimeter;
}

@Override
public double getArea() {
	// TODO Auto-generated method stub
	return 0;
}
}
