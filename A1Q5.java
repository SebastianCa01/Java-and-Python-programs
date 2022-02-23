import java.util.Scanner;

public class A1Q5{
	public static void main(String[] args)
	{
       
		int[][] arrayOfArrays;
		
		
		//your code here
		
		int numOfRows = 0;
		int numOfCols = 0;
		String line;
		String[] arrayStr;
		
		int[][] temp2DArray;
	    Scanner scan= new Scanner(System.in);

		
		System.out.println("Enter the array of arrays one row per line.Enter an empty line when you are done.");
		System.out.println("Elements of each row should be separated by commas:");
		
		
		temp2DArray = new int[5][];
		
		do
		{
			line = scan.nextLine();
			
			if(line.equals(""))
			{
				break;
			}
			
		
			
			arrayStr = line.split(",");
			numOfCols = arrayStr.length;
			temp2DArray[numOfRows] =  new int[numOfCols];
			
			for(int i=0; i<numOfCols ; i++)
			{
				temp2DArray[numOfRows][i] = Integer.parseInt(arrayStr[i]);
			}
					
			numOfRows++;
			
		}
		
		while(numOfRows <=5);
		
		arrayOfArrays =  new int[numOfRows][];
		
		for(int i=0; i< numOfRows; i++)
		{
			
			arrayOfArrays[i] =  new int[temp2DArray[i].length];
			for(int j=0; j<temp2DArray[i].length; j++ )
			{
				arrayOfArrays[i][j] = temp2DArray[i][j];
			}
		}
		
		
		display(arrayOfArrays);
		
       scan.close();
	}		
	
	public static void display(int[][] arrayOfArrays)
	{
		
		System.out.println("The array of arrays is: ");
		
		for(int i =0 ; i <arrayOfArrays.length; i++)
		{
			System.out.print ("Row "+ i + " : ");
			
			for(int j=0; j<arrayOfArrays[i].length; j++ )
			{
				if( j < (arrayOfArrays[i].length - 1))
				{
					System.out.print (arrayOfArrays[i][j] + " ");
				}
				else
				{
					System.out.print (arrayOfArrays[i][j]);
				}
				
			}
			
			System.out.println();
		}
	}
}