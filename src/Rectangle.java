
public class Rectangle extends Shape 
{
	private double length;
	
	private double width;
	
	public Rectangle(String id, double length, double width) 
	{
		super(id);
		this.length = length;
		this.width = width;
	}
	
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	
	public double getArea() 
	{
		return length * width;
	}
	
	public double getPerimeter()
	{
		return (2* length) + (2 * width);
	}
	public String getShapeType() 
	{
		return "Rectangle";
	}
}
