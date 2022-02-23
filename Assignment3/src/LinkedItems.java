import java.util.LinkedList;

/*******************************/
/*Students numbers: 
/*Students full names: 
/*******************************/
public class LinkedItems<E extends Item> {
	
	class Elem<T> {
		public T value;
		public Elem<T> next;

		Elem(T value, Elem<T> next) {
			this.value = value;
			this.next = next;
		}
		
	}
	
	private Elem<E> top;
	
	public LinkedItems(){
		top = null;
	}
	
    public boolean isEmpty(){
		return top == null;
	}
	//your code here
    
    public void AddItem(E value)
    {
    	Elem<E> current = top;
    	Elem<E> newElement = new Elem<E>(value,null);
    	
    	if(isEmpty())
    	{
    	   top = newElement;
    	  
    	}
    	
    	else
    	{
    		while(current.next != null)
    		{
    			current =current.next;
    		}
    		
    		current.next = newElement;
    	}
    	
    }
    /**
     * this method displays the LinkedList items
     */
    public void displayItems()
    {
    	Elem<E> current = top;
    	
    	if(isEmpty())
    	{
    	 System.out.println("List is empty");
    	  
    	}
    	
    	else
    	{
    		while(current != null)
    		{
    			
    			System.out.println(current.value.toString());
    			current =current.next;
    		}
    		
    	
    	}
    	
    	
    }
    /**
     * this method displays the stock
     */
    public void displayStock()
    {
    	Elem<E> current = top;
    	
    	if(isEmpty())
    	{
    	 System.out.println("List is empty");
    	  
    	}
    	
    	else
    	{
    		while(current != null)
    		{
    			
    			System.out.println(current.value.getLabel() + " - " + current.value.getQuantity() * current.value.getPrice());
    			current =current.next;
    		} 		
    	
    	}	
    	
    }
    
    /**
     * This method gets the LinkedList Item with maximum price 
     */   
    public void getItemWithMaxPrice()
    {
    	Elem<E> current = top;
    	float max = Float.MIN_VALUE;
    	E itemMax =  null;
    	
    	if(isEmpty())
    	{
    	 System.out.println("List is empty");
    	  
    	}
    	
    	else
    	{
    		while(current != null)
    		{
    			
    			if(current.value.getPrice() > max )
    			{
    				max = current.value.getPrice();
    				itemMax = current.value;
    				
    			}		
    			
    			current =current.next;
    		} 
    		
    		
    		System.out.println(itemMax.getLabel() + " - "  + itemMax.getPrice() );
    	
    	}	 	
    }
    /**
     * This method gets the LinkedList Item with minimum price 
     */
    public void getItemWithMinPrice()
    {
    	Elem<E> current = top;
    	float min = Float.MAX_VALUE;
    	E itemMin =  null;
    	
    	if(isEmpty())
    	{
    	 System.out.println("List is empty");
    	  
    	}
    	
    	else
    	{
    		while(current != null)
    		{
    			
    			if(current.value.getPrice() < min )
    			{
    				min = current.value.getPrice();
    				itemMin = current.value;
    				
    			}		
    			
    			current =current.next;
    		} 
    		
    		
    		System.out.println(itemMin.getLabel() + " - "  + itemMin.getPrice() );
    	
    	}	 	
    }
    
    /**
     * this method eliminates duplicate items with the same label
     * sets the quantity to the sum of quantities of the same label  
     * sets price to the minimum price among duplicates
     */
    public void eliminateDuplicates()
    {
    	
        Elem<E> current = top;
        Elem<E> currentTemp = null;
        Elem<E> currentdup = null;
        float min;
        
        
        LinkedItems<E> tempList = new LinkedItems<E>();
        LinkedItems<E> duplicateList = new LinkedItems<E>();
    	
        if(!isEmpty()) 
        {
    	
			while(current != null)
			{
			    if(tempList.contains(current.value))
			    {
			    	duplicateList.AddItem(current.value);
			    }
			    else
			    {
			    	tempList.AddItem(current.value);
			    }
				
				current =current.next;
			}
			
			if(!tempList.isEmpty())
			{
				currentTemp = tempList.top;
			
				
				while((currentTemp != null) &&   (!duplicateList.isEmpty()))
				{
				   
			    	min = currentTemp.value.getPrice();
			    	
			    	currentdup = duplicateList.top;
			    	
			    	while(currentdup!= null)
			    	{
			    		
			    		if(currentdup.value.equals(currentTemp.value))
			    		{
			    			
			    		   currentTemp.value.setQuantity( currentTemp.value.getQuantity() + currentdup.value.getQuantity());
			    		    
			    		   if(currentdup.value.getPrice() < min)
			    		   {
			    			   min = currentdup.value.getPrice();
			    		   }
			    		    
			    		}
			    		
			    		currentdup =currentdup.next;
			    	}
			    	
			    	currentTemp.value.setPrice(min);
			    	currentTemp = currentTemp.next;			
					
				}
				
				
				if(!duplicateList.isEmpty())
				{
					clear();	
					this.top = tempList.top;
					
				}
					
				
			}
    				
    	}
    	
    }
    
    /**
     * this method checks if an item exists in the list 
     */
    public boolean contains(E value)
    {
    	
        Elem<E> current = top;
    	
    	
		while(current != null)
		{
			
			if(current.value.equals(value))
			{
				return true;
			}
			current =current.next;
		}
    		
    	
    	return false;
    	
    }
    
    public void clear()
    {
    	top = null;
     	
     	
 		
    	
    }
    
 
    
}
