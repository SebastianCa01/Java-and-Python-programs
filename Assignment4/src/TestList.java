
public class TestList {

	public static void main(String[] args) 
	{
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
		
		
		System.out.println(l.orderList().toString());

	}

}
