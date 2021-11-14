
public class Geometry 
{
	//fields
	public static final double PI = 3.142;
	
	public static double areaCircle(double radius)
	{
		do 
		{
		double area = Math.PI * radius * radius;
		return area;	
		} while (radius < 0);
	}
	
	public static double areaRectangle(double l, double w)
	{
		do 
		{
		double area = l * w;
		return area;
		} while (l < 0 || w < 0);
	}
	
	public static double areaTriangle(double base, double height)
	{
		do {
		double area = base * height * 0.5;
		return area; } while (base < 0 || height < 0);
	}
	
	
}
