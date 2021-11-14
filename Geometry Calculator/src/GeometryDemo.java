import javax.swing.JOptionPane;

public class GeometryDemo 
{
	public static void main(String[] args)
	{

	try {
	
	String chooseOperation = JOptionPane.showInputDialog("GEOMETRY CALCULATOR" +
	"\n[1]CALCULATE AREA OF CIRCLE" + "\n[2] CALCULATE AREA OF RECTANGLE" + "\n[3] CALCULATE AREA OF TRIANGLE" );
	
	//store user's input in Operation
	
	int Operation = Integer.parseInt(chooseOperation); 
		
	
			
	while (Operation < 1 || Operation > 3)
	{
		chooseOperation = JOptionPane.showInputDialog("GEOMETRY CALCULATOR" +
				"\n[1]CALCULATE AREA OF CIRCLE" + "\n[2] CALCULATE AREA OF RECTANGLE" + "\n[3] CALCULATE AREA OF TRIANGLE" );
		Operation = Integer.parseInt(chooseOperation);
	} //end of while loop to ensure operation is between 1 and 3
	
	if (Operation == 1)
	{
		//get user to enter radius of circle they want 
		String areaCircle = JOptionPane.showInputDialog("Insert radius");
		
		//store the input in the variable userRadius
		double userRadius;
		
		userRadius = Double.parseDouble(areaCircle);
		
		double circleArea = Geometry.areaCircle(userRadius);
		
		JOptionPane.showMessageDialog(null, "AREA OF CIRCLE IS " + circleArea);
		
	} //end of operation 1
	
	if (Operation == 2)
	{
		//get user to enter the LENGTH of rectangle they want to calculate area of 
		String areaRectangleLength = JOptionPane.showInputDialog("Insert Length" );
		
		//stores the input in the variable userLength
		double userLength;
		userLength = Double.parseDouble(areaRectangleLength);
		
		//get user to enter the WIDTH of rectangle they want to calculate area of 
		String areaRectangleWidth = JOptionPane.showInputDialog("Insert Width" );
				
		//stores the input in the variable userWidth
		double userWidth;
		userWidth = Double.parseDouble(areaRectangleWidth);
		
		double rectangleArea = Geometry.areaRectangle(userLength, userWidth);
		
		//displays result
		JOptionPane.showMessageDialog(null, "AREA OF RECTANGLE IS " + rectangleArea);
	} //end of operation 2
	
	if (Operation == 3)
	{
		//get user to enter the height of the triangle they want to calculate the area of
		String areaTriangleHeight = JOptionPane.showInputDialog("Insert Height of triangle: ");
		
		//stores the input in the variable userHeight
		double userHeight;
		userHeight = Double.parseDouble(areaTriangleHeight);
		
		//get user to enter the base of the triangle they want to calculate the area of
		String areaTriangleBase = JOptionPane.showInputDialog("Insert Base of triangle: ");
				
		//stores the input in the variable userBase
		double userBase;
		userBase = Double.parseDouble(areaTriangleBase);
		
		double triangleArea = Geometry.areaTriangle(userBase, userHeight);
		
		//displays result
		JOptionPane.showMessageDialog(null, "AREA OF TRIANGLE IS " + triangleArea);
		
	} // end of operation 3
	else 
	{
		JOptionPane.showMessageDialog(null, "The End");
		System.exit(0);
	} //end of else
	
	}
	catch (Exception e) //prepares a window message dialog for when user clicked cancel
	{
		JOptionPane.showMessageDialog(null, "Okay bye");
		System.exit(0);
	}
	} //end of main function
	
} // end of class geometry
