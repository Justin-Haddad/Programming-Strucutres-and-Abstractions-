
public class Triangle {

	//Instance Data
	private double sideA = DEFAULT_SIDE;
	private double sideB  =DEFAULT_SIDE;
	private double sideC = DEFAULT_SIDE;
	
	//Class Data
	public static final String POLYGONSHAPE = "Triangle";
	public static final double DEFAULT_SIDE = 1.0;
	
	//Class Methods 
	public static boolean isTriangle(double a, double b, double c)
	{
		if ((a > 0) &&
		(b > 0) && 
		(c > 0) && 
		(a < b + c) && 
		(b < a + c) && 
		(c < a + b))
				{
					return true;
				}
		return false;
	}
	
	public static boolean isTriangle(double[] sides)
	{
		if (sides == null)
		{
			return false;
		}
		if (!(sides.length == 3))
		{
			return false;
		}
		if  ((sides[0] > 0) && 
			(sides[1] > 0) &&
			(sides[2] > 0) && 
			(sides[0] < sides[1] + sides[2]) && 
			(sides[1] < sides[0] + sides[2]) && 
			(sides[2] < sides[0] + sides[1]))
		{
			return true;
		}
		return false;
	}
		
	
	public static double lawOfCosines(double a, double b, double c)
	{
		c = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2))/(2 * a*b));
		c = (c * 180)/ Math.PI;
		return c;
	
				
	}
	//Constructors
	public Triangle()
	{
		sideA = DEFAULT_SIDE;
		sideB = DEFAULT_SIDE;
		sideC = DEFAULT_SIDE;
	}
		
	public Triangle(double sideA, double sideB, double sideC)
	{
		boolean check = isTriangle(sideA, sideB, sideC);
		if (check)
		{
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
		}
		else 
		{
			sideA = DEFAULT_SIDE;
			sideB = DEFAULT_SIDE;
			sideC = DEFAULT_SIDE;
		}
				
	}
	
	public Triangle(double[] sides)
	{
		boolean check = isTriangle(sides);
			if (check)	
			{
				sideA = sides[0];
				sideB = sides[1];
				sideC = sides[2];			
			}
			else 
			{
				sideA = DEFAULT_SIDE;
				sideB = DEFAULT_SIDE;
				sideC = DEFAULT_SIDE;
			}
	}
	
	public Triangle(Triangle triangle)
	{
		if (!(triangle == null))
				{
			this.sideA = triangle.getSideA();
			this.sideB = triangle.getSideB();
			this.sideC =triangle.getSideC();
				}
		
	}
	
	//Accessors
	public double getSideA()
	{
		return sideA;
	}
	
	public double getSideB()
	{
		return sideB;
	}
	
	public double getSideC()
	{
		return sideC;
	}
	
	public double[] getSides()
	{
		
		double[] array = new double[3];	
		array[0] = getSideA();
		array[1] = getSideB();
		array[2] = getSideC();
		return array;
	}
	
	public double getAngleA()
	{
		double angleA = lawOfCosines(getSideC(), getSideB(), getSideA());
		return angleA;
	}
	
	public double getAngleB()
	
	{
		double angleB = lawOfCosines(getSideA(), getSideC(), getSideB());
		return angleB;
	}
	
	public double getAngleC()
	{
		double angleC = lawOfCosines(getSideA(), getSideB(), getSideC());
		return angleC;
	}
	
	public double[] getAngles() 
	{
		double[] array = new double[3];
		array[0] = getAngleA();
		array[1] = getAngleB();
		array[2] = getAngleC();
		return array;
		
	}
	//Constructors
	
	public boolean setSideA(double sideA)
	{
		boolean check = isTriangle(sideA, sideB, sideC);
		if (check)
		{
			this.sideA = sideA;
			return true;
		}
		return false;
		}

	
	public boolean setSideB(double sideB)
	{
		boolean check = isTriangle(sideA, sideB, sideC);
		if (check)
		{
			this.sideB = sideB;
			return true;
		}
		return false;
	}
	
	public boolean setSideC(double sideC)
	{
		boolean check = isTriangle(sideA, sideB, sideC);
		if (check)
		{
			this.sideC = sideC;
			return true;
		}
		return false;
	}
	
	public boolean setSides(double[] sides)
	{
		boolean check = isTriangle(sides);
		if (check)
		{
			this.sideA = sides[0];
			this.sideB = sides[1];
			this.sideC = sides[2];
			return true;
		}
		return false;
	}
	public String toString()
	{
		String sideA = String.format("%.4f", this.sideA);
		String sideB = String.format("%.4f", this.sideB);
		String sideC = String.format("%.4f", this.sideC);
		
		return (POLYGONSHAPE + "(" + sideA + ", " + sideB + ", " + sideC + ")");
	}
}	
