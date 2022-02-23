/*******************************/
/*Students numbers: 
/*Students full names: 
/*******************************/

import java.util.Scanner;

public class A3Q1{
	public static void main(String[] args) throws OperatorNotSupportedException,ArithmeticException{

		int output; // output of the expression evaluation
		String input;
		String newexp = "Y";
		Scanner s= new Scanner(System.in);
		
		do{
		try{
			System.out.print("Enter your postfix expression: ");
			input=s.nextLine();
			output = PostFixHandler.processExpression(input);
			System.out.println("output: " + output);
			System.out.print("Do you want to enter another expression to evaluate?(Y/N):");
			newexp=s.nextLine();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		}while(newexp.equals("Y")|| newexp.equals("y"));
		//
 
}
}