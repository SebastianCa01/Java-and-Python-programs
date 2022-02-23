/*******************************/
/*Students numbers: 
/*Students full names: 
/*******************************/

import java.util.Scanner;

public class PostFixHandler{
	
  public static int processExpression(String postFixExp)
  throws OperatorNotSupportedException,ArithmeticException,WrongExpressionFormatException{
    LinkedStack<Integer> stack = new LinkedStack<Integer>();  
	String[] input = postFixExp.split(" ");
	int output=0;
		for(int i=0;i<input.length;i++){
			if(input[i].equals("plus")){
				int right = pop(stack);
				int left = pop(stack);
				output = left + right;
				stack.push(output);
				
			}else if(input[i].equals("minus")){
				int right = pop(stack);
				int left = pop(stack);
				output = right - left;
				stack.push(output);
			}else if(input[i].equals("multiply")){
				int right = pop(stack);
				int left = pop(stack);
				output = right*left;
				stack.push(output);
			}else if(input[i].equals("divide")){
				int right = pop(stack);
				int left = pop(stack);
				if(right == 0){
					try{
						throw new ArithmeticException(ArithmeticException.DV0);
					}catch(ArithmeticException e){
						System.out.println(e.getMessage());
						right=1;
					}
				}
				output = left/right;
				stack.push(output);
			}else if(input[i].equals("squareRoot")){
				int num = pop(stack);
				if(num<0){
					try{
						throw new ArithmeticException(ArithmeticException.NSR);
					}catch(ArithmeticException e){
						System.out.println(e.getMessage());
						output=0;
					}
				}else{
			    output = (int)Math.sqrt(num);
				}
				stack.push(output);
			}else if(isNumber(input[i])){
				stack.push(Integer.parseInt(input[i]));
			}else{
				throw new OperatorNotSupportedException();
			}
		}
		output = pop(stack);
		if(stack.isEmpty()){
			return output;
		}else{
			throw new WrongExpressionFormatException();
		}
		
		//return output;
  }
  
  public static int pop(LinkedStack<Integer> s) throws WrongExpressionFormatException{
	  if(s.isEmpty()){
		 throw new WrongExpressionFormatException();
	  }else{
		  return s.pop();
	  }
  }
  public static boolean isNumber(String s){
	  try{
		  Integer.parseInt(s);
		  return true;
	  }catch(Exception e){
		  return false;
	  }
  }
  
}