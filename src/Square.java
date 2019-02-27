
public class Square extends Rectangle {
	
	private double sideLength;
	
	public Square(String id, double sideLength) 
	{
		super(id, sideLength, sideLength);
		this.sideLength = sideLength;
	}
	
	public double getSideLength()
	{
		return sideLength;
	}
	
	public double getArea()
	{
		return sideLength * sideLength;
	}
	
	public double getPerimeter() 
	{
		return 4 * sideLength;
	}
	
	public String getShapeType()
	{
		return "Square";
	}
}
