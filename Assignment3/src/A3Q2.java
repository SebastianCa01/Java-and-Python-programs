/*******************************/
/*Students numbers: 
/*Students full names: 
/*******************************/
import java.util.Scanner;

public class A3Q2 {
	
	public static void main(String[] args) 
	{
		//your code here
		Scanner input = new Scanner(System.in);
		String inputStr ="";
		String answer ="";
		Item item;
		String label;
		int quantity = 0;
		float price;
		
		LinkedItems<Item> linkedItems = new LinkedItems<Item>();
	
		//takes the input from the user and checks all the exceptions 
		do
		{
		  System.out.println("Enter Item details seperated by spaces  : label quantity price.");
		  inputStr =  input.nextLine();
		  
		  if((inputStr.isEmpty()) || (inputStr == null))
		  {
			  answer = "y";
			  continue;
		  }
		  
		  
		  label = inputStr.split(" ")[0];
		  
		  if((label.isEmpty()) || (label == null))
		  {
			  answer = "y";
			  continue;
		  }
		  
		  try
		  {
			  quantity = Integer.parseInt(inputStr.split(" ")[1]);
		  }
		  catch (NumberFormatException ex)
		  {
			  System.out.println("Qunatity is not valid");
			  answer = "y";
			  continue;
		  }
		  
		  try
		  {
			  price = Float.parseFloat(inputStr.split(" ")[2]);
		  }
		  catch (NumberFormatException ex)
		  {
			  System.out.println("Price is not valid");
			  answer = "y";
			  continue;
		  }
		
		  
		  
		  item = new Item(label,quantity,price);
		  linkedItems.AddItem(item);
		  
		//  System.out.println("the following Item was added successfully to the linked list");
		 // System.out.println(item.toString());
		   
		  System.out.print("are there more items please enter (Y/N): ");
		  answer =  input.nextLine();
		  
			
		}
		while ((answer.equals("y")) || (answer.equals("Y")));
		
		//displays all the information required 
		System.out.println("Linked list has the following items:\n");
		System.out.println("Label-quantity-price\n");
		
		linkedItems.displayItems();
		
		System.out.println("\nLinked list after removing duplicates has the following items:\n");
		System.out.println("Label-quantity-price\n");
		linkedItems.eliminateDuplicates();
		linkedItems.displayItems();
		
		System.out.println("\nthe value of the current stock:\n");
		System.out.println("Label-Stock Value\n");
		linkedItems.displayStock();
		
		System.out.println("\nthe most expensive item");
		linkedItems.getItemWithMaxPrice();
		
		System.out.println("\nthe least expensive item");
		linkedItems.getItemWithMinPrice();
		
		
		
		
		

	}
}

