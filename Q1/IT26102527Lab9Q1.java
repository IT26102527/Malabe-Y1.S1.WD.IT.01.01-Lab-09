import java.util.Scanner;
public class IT26102527Lab9Q1{
	public static void main(String[] args){
		
		// creating Scanner object
		Scanner input = new Scanner(System.in);
		
		double a,b,c;
		double root1,root2;
		
		// Get input values
		System.out.print("Enter value a: ");
		a = input.nextDouble();
		System.out.print("Enter value b: ");
		b = input.nextDouble();
		System.out.print("Enter value c: ");
		c = input.nextDouble();
		
		// to check whether the equation is quadratic
		if (a == 0){
			System.out.println("This is not a quadratic equation");
			
		}
	
		else{	
			// to check wheter roots are real and different
			if ((Math.pow(b,2) - 4*a*c)> 0 )
			{
				System.out.println("\nRoots are real and different");
				root1 = ( -b + (Math.sqrt(Math.pow(b,2) - 4*a*c))) / (2*a);
				root2 = ( -b - (Math.sqrt(Math.pow(b,2) - 4*a*c))) / (2*a);
				System.out.println("Root 1: " + root1);
				System.out.println("Root 2: " + root2);
				
			}
			// to check wheter roots are unreal 
			else if ((Math.pow(b,2) - 4*a*c) < 0)
			{
				System.out.print("\nRoots are unreal");
			}
			
			// to check wheter roots are real and same
			else{
				System.out.print("\nRoots are real and equal");
				
				
				root1 = ( -b + (Math.sqrt(Math.pow(b,2) - 4*a*c))) / (2*a);
				root2 = root1;
				System.out.println("Both Roots are : " + root1);
				
			}
		}
		
	}
}