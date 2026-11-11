public class IT26102527Lab9Q3{
	public static void main(String[] args){
		int result1,result2;
		result1 = square(add(multiply(3,4),multiply(5,7)));
		System.out.print("Result of (3*4+5*7)²    : "+result1);
		
		result2 =add(square(add(4,7)),square(add(8,3)));
		System.out.print("\nResult of (4+7)²+(8+3)² : "+ result2);
	
		
	}
	//creating add method
	public static int add(int num1,int num2){
		return (num1+num2);
	
	
	}
	//creating multiply method
	public static int multiply(int num1,int num2){
		return num1*num2;
		
	}
	//creating square method
	public static int square(int num){
		return num*num;
	}
	
}