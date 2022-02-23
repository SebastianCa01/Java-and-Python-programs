/*******************************/
/*Students number: 300160294
/*Students full name: Sebastian Doka 
/*******************************/

public class UseDoublyLinkedList {
	
	
	 private static DoublyLinkedList<String> getList() {
		 DoublyLinkedList<String> l = new DoublyLinkedList<String>();
		 //ITI1121 ,“Hello”,”ITI1121”,”Summer”
	        l.addLast("ITI1121");
	        l.addLast("Hello");
	        l.addLast("ITI1121");
	        l.addLast("Summer");
	        return l;
	    }
	 
	 
	  private static void testCase1() {
	        System.out.println("testCase1: list with more than one occurence of beforeMe");
	        
	        DoublyLinkedList<String> myList = getList();
	        DoublyLinkedList<String> someList =new DoublyLinkedList<String>();
	        
	        someList.addLast("Hi");
	        someList.addLast("AddMe");
	     
	        
	        
	        System.out.println("this is myList before Calling addSpecific: " + myList.toString());
	        System.out.println("this is someList before Calling addSpecific: " + someList.toString());
	        
	        myList.addSpecific("ITI1121", someList);

	        System.out.println("this is myList after Calling addSpecific(\"ITI1121\",someList): " + myList.toString());
	        System.out.println("this is someList after Calling addSpecific(\"ITI1121\",someList): " + someList.toString());
	        
	       
	        System.out.println();
	    }
	  
	  private static void testCase2() {
	        System.out.println("testCase2: myList is empty list");
	        
	        DoublyLinkedList<String> myList = new DoublyLinkedList<String>();
	        DoublyLinkedList<String> someList =new DoublyLinkedList<String>();
	        
	        someList.addLast("Hi");
	        someList.addLast("AddMe");
	     
	        
	        
	        System.out.println("this is myList before Calling addSpecific: " + myList.toString());
	        System.out.println("this is someList before Calling addSpecific: " + someList.toString());
	        
	        myList.addSpecific("ITI1121", someList);

	        System.out.println("this is myList after Calling addSpecific(\"ITI1121\",someList): " + myList.toString());
	        System.out.println("this is someList after Calling addSpecific(\"ITI1121\",someList): " + someList.toString());
	        
	       
	        System.out.println();
	    }
	  
	  private static void testCase3() {
	        System.out.println("testCase3: someList is empty list");
	        
	        DoublyLinkedList<String> myList = getList();
	        DoublyLinkedList<String> someList =new DoublyLinkedList<String>();
	      
	        
	        
	        System.out.println("this is myList before Calling addSpecific: " + myList.toString());
	        System.out.println("this is someList before Calling addSpecific: " + someList.toString());
	        
	        myList.addSpecific("ITI1121", someList);

	        System.out.println("this is myList after Calling addSpecific(\"ITI1121\",someList): " + myList.toString());
	        System.out.println("this is someList after Calling addSpecific(\"ITI1121\",someList): " + someList.toString());
	        
	       
	        System.out.println();
	    }
	  
	  private static void testCase4() {
	        System.out.println("testCase4: someList and myList are both empty lists");
	        
	        DoublyLinkedList<String> myList = new DoublyLinkedList<String>();
	        DoublyLinkedList<String> someList = new DoublyLinkedList<String>();
	      
	        
	        
	        System.out.println("this is myList before Calling addSpecific: " + myList.toString());
	        System.out.println("this is someList before Calling addSpecific: " + someList.toString());
	        
	        myList.addSpecific("ITI1121", someList);

	        System.out.println("this is myList after Calling addSpecific(\"ITI1121\",someList): " + myList.toString());
	        System.out.println("this is someList after Calling addSpecific(\"ITI1121\",someList): " + someList.toString());
	        
	       
	        System.out.println();
	    }
	  
	  private static void testCase5() {
	        System.out.println("testCase5: list with one occurence of beforeMe");
	        
	        DoublyLinkedList<String> myList = new DoublyLinkedList<String>();
	        
	        myList.addLast("ITI1121");
	        myList.addLast("Hello");
	        myList.addLast("Summer");
	        
	        DoublyLinkedList<String> someList =new DoublyLinkedList<String>();
	        
	        someList.addLast("Hi");
	        someList.addLast("AddMe");
	     
	        
	        
	        System.out.println("this is myList before Calling addSpecific: " + myList.toString());
	        System.out.println("this is someList before Calling addSpecific: " + someList.toString());
	        
	        myList.addSpecific("ITI1121", someList);

	        System.out.println("this is myList after Calling addSpecific(\"ITI1121\",someList): " + myList.toString());
	        System.out.println("this is someList after Calling addSpecific(\"ITI1121\",someList): " + someList.toString());
	        
	       
	        System.out.println();
	    }
	  
	  private static void testCase6() {
	        System.out.println("testCase6: testing when beforeMe doesn’t exist in myList");
	        
	        DoublyLinkedList<String> myList = new DoublyLinkedList<String>();
	        
	        myList.addLast("ITI1121");
	        myList.addLast("Hello");
	        myList.addLast("Summer");
	        
	        DoublyLinkedList<String> someList =new DoublyLinkedList<String>();
	        
	        someList.addLast("Hi");
	        someList.addLast("AddMe");
	     
	        
	        
	        System.out.println("this is myList before Calling addSpecific: " + myList.toString());
	        System.out.println("this is someList before Calling addSpecific: " + someList.toString());
	        
	        myList.addSpecific("Not Exists", someList);

	        System.out.println("this is myList after Calling addSpecific(\"Not Exists\",someList): " + myList.toString());
	        System.out.println("this is someList after Calling addSpecific(\"Not Exists\",someList): " + someList.toString());
	        
	       
	        System.out.println();
	    }

	
	
	   
	
	   
  
  public static void main(String[] args) {

	 System.out.println("-------------------------------------");
	 System.out.println("* Student name: Sebastian Doka      *");
	 System.out.println("* Student number: 300160294         *");
	 System.out.println("-------------------------------------");
	 System.out.println();
    
	 testCase1();
	 testCase2();
	 testCase3();
	 testCase4();
	 testCase5();
	 testCase6();
	 
 
  }
}
