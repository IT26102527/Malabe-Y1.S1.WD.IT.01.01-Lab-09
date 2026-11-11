import java.util.Scanner;
public class IT26102527Lab9Q4{
	public static void main(String[] args){
		
		// creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//create Student ID array 
		String name[] = new String[5];
		
		//create finalMark array
		double finalMark[] = new double[5];
		
		//create grade array
		char grade[] = new char[5];
		int count;
		
		//Getting user inputs
		for (count =0;count<5;count++){
			
			System.out.println();
			System.out.print("Enter Name of Student " + (count+1) +":");
			name[count] = input.nextLine();
			
			System.out.print("Enter Assignment Mark (Out of 100) for " + name[count] +":");
			double assignmentMark = input.nextDouble();
			
			System.out.print("Enter Final Mark (Out of 100) for " + name[count] +":");
			double examMark = input.nextDouble();
			input.nextLine();
			
			finalMark[count] = calcFinalMark(assignmentMark,examMark);
			grade[count] = findGrade(finalMark[count]);
		}
		System.out.println();
		//print the details including the header of the table and contents
		
		System.out.println("Name\t\tFinal Mark\tGrade");
		for (count =0;count<5;count++){
			printDetails(name[count],finalMark[count],grade[count]);
		}
			
		
		
	}
	
	//creating calcFinalMark method
	
	public static double calcFinalMark(double assignmentMark,double examMark){
		return assignmentMark*0.3 + examMark *0.7;
	}
	
	//creating findGrade method
	public static char findGrade(double finalMark){
		
		if (finalMark >= 75){
			return 'A' ;
			}
		else if (finalMark>= 60){
			return 'B' ;
		}
		else if (finalMark>= 50){
			return 'C' ;
		}
		else {
			return 'F' ;
		}
	}
	//creating pintDetails method
	public static void printDetails(String name, double finalMark, char grade ){
		System.out.println(name + "\t\t" + String.format("%.2f",finalMark) + "\t\t" + grade );
	}
}