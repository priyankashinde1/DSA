package circularList;

public class Main {

	public static void main(String[] args) {
		
	
	CircularList cl=new CircularList();
	/*
	cl.insert(10);
	cl.insert(20);
	cl.insert(30);
	cl.insert(40);
	cl.insert(50);
	cl.display();
	cl.deletebyvalue(30);
	cl.display();
	
	*/
	

	cl.insert(10, 1);
	cl.insert(20, 2);
	cl.insert(30, 3);
	cl.insert(40, 4);
	cl.insert(50, 5);
	cl.insert(60, 6);
	cl.display();
	cl.deletebyposition(3);
	cl.display();
	
	}
	
}
