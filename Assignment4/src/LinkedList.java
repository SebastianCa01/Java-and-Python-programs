/*******************************/
/*Students number: 300160294
/*Students full name: Sebastian Doka 
/*******************************/

public class LinkedList<E extends Comparable<E>>{

    private static class Node<T> {
        private T value;
        private Node<T> next;
        private Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node<E> head;
    private int size=0;

    public boolean isEmpty() {
        return head == null;
		//or
		//return size == 0;
    }
	
    public void addFirst(E elem) {
        if (elem == null) {
            throw new NullPointerException();
        }
        head = new Node<E>(elem, head);
        size++;
    }

    public void addLast(E elem) {
        if (elem == null) {
            throw new NullPointerException();
        }
        if (head == null) {
            head = new Node<E>(elem, null);
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<E>(elem, null);
        }
        size++;
    }
	
	//adding at a specific index
    public void add(E elem, int index) {
        if (elem == null) {
            throw new NullPointerException();
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if (index == 0) {
            head = new Node<E>(elem, head);
        } else {
            Node<E> p = head;
            for (int i=0; i<(index-1); i++) {
                p = p.next;
            }
            p.next = new Node<E>(elem, p.next);
        }
        size++;
    }

    public E removeFirst() {
        if (head == null) {
            throw new NullPointerException();
        }
        E saved = head.value;
        head = head.next;
        size--;
        return saved;
    }

    public E removeLast() {
        if (head == null) {
            throw new NullPointerException();
        }
        E saved;
        if (head.next == null) {
            saved = head.value;
            head = null;
        } else {
            Node<E> p = head;
            while (p.next.next != null) {
                p = p.next;
            }
            saved = p.next.value;
            p.next = null;
        }
        size--;
        return saved;
    }

    public int size() {
        return size;
    }

    public String toString() {
        String str = "[";
        Node<E> p = head;
        while (p!=null) {
            if (p != head) {
                str += ", ";
            }
            str += p.value;
            p = p.next;
        }
        str += "]";
        return str;
    }
//*****************************************************	
//Do Not change anything above this line
//Add your code below this line
//*****************************************************

	//orderList() returns a list ordered in ascending order(smallest to greatest)
	//called by isComprisedBetween(E v1, E v2)
	
    public LinkedList<E> orderList() 
    {
		LinkedList<E> orderedList= new LinkedList<E>();
		E minValue;
		
		
		Node<E> newNode = null;
		
		Node<E> current = null;
		Node<E> otherCurrent = null;
		
		
		while(orderedList.size < size)
		{
			current = head;
			minValue = head.value;
	
			
			while(current!= null)
        	{
        		if(orderedList.contains(minValue))
        		{
        			current = current.next;
        			minValue = current.value;
        		}
        		else
        		{
        			break;
        		}
        	
        	}
			
			
			//minValue = current.value;
			
			current = current.next;
			
			while (current != null) 
		        {
		           if((current.value.compareTo(minValue) < 0) && (!orderedList.contains(current.value)))
		           {
		        	   minValue = current.value; 
		           }
		           
		        	current = current.next;
		        }
		        
		   if(orderedList.head == null)
	        {
	        	 orderedList.head =  new Node<E>(minValue, null);
	        	 orderedList.size++;
	        	 
	        }
	        else
	        {
	        	otherCurrent = orderedList.head;
	        
	        
	        	
	        	while(otherCurrent.next!= null)
	        	{
	        		
	        		otherCurrent = otherCurrent.next;
	        	}
	        	
	        	newNode = new Node<E>(minValue, null);
	        	
	        	otherCurrent.next = newNode;
	        	orderedList.size++;
	        }
		       
			   
		}
		
       

		
		
		return orderedList;
	}
	
    public LinkedList<E> isComprisedBetween(E v1, E v2) {
		
		LinkedList<E> newList= new LinkedList<E>();
		
		LinkedList<E> tempList= orderList();
		Node<E> current = null;
		Node<E> otherCurrent = null;
		Node<E> newNode = null;
		
		
		current = tempList.head;
		
		while (current != null) 
        {
			if((current.value.compareTo(v1)>=0)&&(current.value.compareTo(v2)<=0))
			{
				newNode = new Node<E>(current.value, null);
				
				if(newList.head == null)
				{
					newList.head = newNode;
					newList.size++;
				}
				else
				{
					otherCurrent = newList.head;
					while(otherCurrent.next!= null)
		        	{
		        		
		        		otherCurrent = otherCurrent.next;
		        	}
					otherCurrent.next = newNode;
					newList.size++;
					
				}
			}
			
			current = current.next;
        }
		

        return newList;
    }
    
    
    private boolean contains(E objValue)
    {
       Node<E> current = head;
       
       if(current == null)
       {
    	   return false;
       }
		
        
       while (current != null) 
        {
    	  if(current.value.compareTo(objValue) == 0)
    	  {
    		  return true;
    	  }
    	   
    	   current = current.next;
        }
    	
    	return false;
    }
	
		
}
