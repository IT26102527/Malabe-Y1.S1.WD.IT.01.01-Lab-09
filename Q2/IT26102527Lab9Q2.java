import java.util.Scanner;
public class IT26102527Lab9Q2{
	public static void main(String[] args){
		
		// creating Scanner object
		Scanner input = new Scanner(System.in);
		
		double radius;
		
		// get radius value
		System.out.print("Enter the radius of the circle: ");
		radius = input.nextDouble();
		
		double area = circleArea(radius);
		
		System.out.println("The area of the circle with radius " + radius +": " + area );
		
		
	}
	
	// Method to calculate Area
	public static double circleArea(double radius){
		return radius *radius * Math.PI;
	}
		
}	
		