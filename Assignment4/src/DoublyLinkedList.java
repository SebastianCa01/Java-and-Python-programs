/*******************************/
/*Students number: 300160294
/*Students full name: Sebastian Doka 
/*******************************/

public class DoublyLinkedList<E>{

    private static class Node<T> {
        private T value;
        private Node<T> previous;
        private Node<T> next;
        private Node(T value, Node<T> previous, Node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }

    private Node<E> head;
    private int size;
	

    public void addLast(E elem) {
        if (elem == null) {
            throw new NullPointerException();
        }
        if (head == null) {
            head = new Node<E>(elem, null, null);
        } else {
			Node<E> p = head;
			while(p.next != null){
				p = p.next;
			}
            p.next = new Node<E>(elem, p, null);
        }
        size++;
    }
	
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
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
//Do Not change anything above this line
//**************************************************************************
// your code after this line

   public void addSpecific( E beforeMe, DoublyLinkedList<E> someList ) 
   {
      Node<E> newNode =  null;
	   
	   // getting the last element in someList
	   E lastElemValue;
	   Node<E> someListCurrent = someList.head;
	   
	   if(someList.isEmpty())
	   {
		   System.out.println("someList is empty");
		   if(isEmpty())
		   {
			   System.out.println("myList is empty");
			   System.out.println("specific element not found");
		   }
		   return;
	   }
	  
	  
       while (someListCurrent.next!= null) 
       { 
    	   someListCurrent = someListCurrent.next;
       }
       
       lastElemValue = someListCurrent.value;
       
       
    // getting the last element in myList
       Node<E> current = head;
       
       if(isEmpty())
       {
    	  // newNode = new Node<E>(lastElemValue, null, null); 
    	  // head = newNode;
    	  // size++;
    	   System.out.println("mylist is empty");
    	   System.out.println("specific element not found");
       }
       else
       {
    	   while (current.next!= null) 
           { 
        	   current = current.next;
           }
           
           while (current!= null) 
           { 
        	   if(current.value.equals(beforeMe))
        	   {
        		   break;
        	   }
        	   current = current.previous;
           }
           
           if(current != null)
           {
        	   newNode = new Node<E>(lastElemValue, current.previous, current);
        	   if(current.previous!= null)
        	   {
        		   current.previous.next = newNode;
            	   current.previous = newNode;
        	   }
        	   else
        	   {
        		   current.previous = newNode;
        		   head = newNode;
        	   }
        	   size++; 
        	   
           }
           else
           {
        	   System.out.println("specific element not found");
           }
    	   
       }
   
     
       
       if((!someList.isEmpty()) && (current!=null))
       {
    	   if(someListCurrent == someList.head)
    	   {
    		   someList.head = null;
    	   }
    	   else
    	   {
    		   someListCurrent.previous.next = null;
        	   someListCurrent.previous = null;
        	   someListCurrent =  null;
    		   
    	   }
    	   
    	   someList.size--;
       }
            
       

    }
}
 