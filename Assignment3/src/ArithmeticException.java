public class ArithmeticException extends Exception{
	public static int DV0 = 0;
	public static int NSR = 1;
	public int input;
	public ArithmeticException(int input){
         super();
		 this.input=input;
	
	}
	public String getMessage(){
		if(input == DV0){
			return "ArithmeticException: You are not allowed to divide by zero.";
		}else{
			return "ArithmeticException: You are not allowed to square root negative numbers.";
		}
	}

	
}