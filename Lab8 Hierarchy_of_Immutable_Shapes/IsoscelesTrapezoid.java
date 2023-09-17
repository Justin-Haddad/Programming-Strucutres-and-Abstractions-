

public class IsoscelesTrapezoid  extends Polygon {

	private double top;
	private double base;
	private double leg;
	private double area;
	private double triangleBase;
	private double height;
	
	public IsoscelesTrapezoid (double top, double base, double leg) {
		 super(top, base, leg, leg);
		 this.top = top;
		 this.base = base;
		 this.leg = leg;
	}
	
	public double getTop() {
		return top;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getLeg() {
		return leg;
	}
	
	public double getHeight() {
		return height;
	}
	@Override
	public double  getArea() { 
		return (top + base) / 2 * Math.sqrt(leg * leg - (base - top) * (base - top) / 4);
	}
	
	//public double getPerimeter() {
		//return top + base + 2 * leg;
	//}
	public Rectangle getCenterRectangle() { 
		double x = (base - top) / 2;
		double y = Math.pow(leg, 2) - Math.pow(x, 2);
		double height = Math.sqrt(y);
		if (top < base) {
			return new Rectangle(top, height);
		}
		else 
		{
			return new Rectangle(base, height);
		}
	}

	
}
