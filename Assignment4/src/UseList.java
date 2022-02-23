/*******************************/
/*Students number: 300160294
/*Students full name: Sebastian Doka 
/*******************************/

public class UseList {

    private static LinkedList<Integer> getList() {
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.addLast(8);
        l.addLast(2);
        l.addLast(1);
		l.addLast(6);
		l.addLast(9);
		l.addLast(3);
		l.addLast(7);
		l.addLast(4);
		l.addLast(5);
        return l;
    }
    
    
	
	
    private static void testCase1() {
        System.out.println("testCase1: list with multiple elements");
        LinkedList<Integer> l = getList();
        System.out.println("initial list: " + l);

        System.out.println("new list: "+l.isComprisedBetween(5,7));

        System.out.println("initial list unchanged: " + l);
        System.out.println();
    }



    private static void testCase2() {

		System.out.println("testCase2: List with one element");
		//your code here
		 LinkedList<Integer> l = new LinkedList<Integer>();
	      l.addLast(8);
	      
	      System.out.println("initial list: " + l);

	        System.out.println("new list: "+l.isComprisedBetween(5,8));

	        System.out.println("initial list unchanged: " + l);
	        System.out.println();

   
    }

    private static void testCase3() {
		System.out.println("testCase3: empty list");
		LinkedList<Integer> l = new LinkedList<Integer>();
	      
	      System.out.println("initial list: " + l);

	        System.out.println("new list: "+l.isComprisedBetween(5,8));

	        System.out.println("initial list unchanged: " + l);
	        System.out.println();


        System.out.println();
    }
	
	//your code here
    private static void testCase4() {
		System.out.println("testCase4: testing with elements v1 and v2 that don't exist in the list ");
		LinkedList<Integer> l = getList();
	      
	      System.out.println("initial list: " + l);

	        System.out.println("new list: "+l.isComprisedBetween(10,12));

	        System.out.println("initial list unchanged: " + l);
	        System.out.println();


        System.out.println();
    }
	
    private static void testCase5() {
		System.out.println("testCase5: testing with an already ordered list");
		LinkedList<Integer> l = new LinkedList<Integer>();
		 l.addLast(1);
		 l.addLast(2);
		 l.addLast(4);
		 l.addLast(5);
		 l.addLast(6);
		 l.addLast(7);
		 l.addLast(8);
		 l.addLast(9);
	      
	      System.out.println("initial list: " + l);

	        System.out.println("new list: "+l.isComprisedBetween(5,8));

	        System.out.println("initial list unchanged: " + l);
	        System.out.println();


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
		
		//call your other tests here
			

    }
}
