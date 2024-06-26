package circularList;

public class CircularList {

	private Node head;
	
	public CircularList() {
		head=null;
	}

	public Node getHead() {
		return head;
	}
	
	public boolean insert(int data) {
		Node newnode=new Node(data);
		
		if(head==null){
			head=newnode;
			head.setNext(head);
			return true;
		}
		
		Node last=head;
		while(last.getNext()!=head) {
			last=last.getNext();
		}
		
		last.setNext(newnode);
		newnode.setNext(head);
		
		return true;
		
	}
	
	public boolean insert(int data,int position) {
		if(position <=0 ||(head==null && position >1)) {
			return false;
		}
	Node newnode=new Node(data);
		
	if(position==1) {
			if(head==null) {
				head=newnode;
				head.setNext(head);
			}
			
			Node last=head;
			while(last.getNext()!=head) {
				last=last.getNext();
			}
			newnode.setNext(head);
			head=newnode;
			head.setNext(head);
			
		}
		
		Node prev=head;
		
		for(int i=1;i<position-1;i++) {
			prev=prev.getNext();
			if(prev==head) {
				return false;
			}
		}
		newnode.setNext(prev.getNext());
		prev.setNext(newnode);
		
		return true;
	}
	
	public boolean deletebyvalue(int data) {
		
		if(head==null) {
			return false;
		}
		if(head.getData()==data) {
			if(head.getNext()==head) {
				head=null;
				return true;
			}
		}
		Node last=head;
		while(last.getNext()!=head) {
			last=last.getNext();
		}
		
		Node del=head,prev=head;
		
		while(del.getData()!=data) {
			prev=del;
			del=del.getNext();
			if(del==null) {
				return false;
			}
		}
		
	
		prev.setNext(del.getNext());
		
		return true;
		
	}
	
	public boolean deletebyposition(int position) {
		
		if(position<=0||(head==null && position>1)) {
			return false;
		}
	
		if(position==1) {
			if(head.getNext()==head) {
				head=null;
				return false;
			}
			
			Node last=head;
			while(last.getNext()!=head) {
				last=last.getNext();
			}
			
		head=head.getNext();
			last.setNext(head);
			
			return true;
		}
		Node prev=head;
		for(int i=1;i<position-1;i++) {
			prev=prev.getNext();
			if(prev.getNext()==head) {
				return false;
			}
		}
		
		Node del=prev.getNext();
		prev.setNext(del.getNext());
		
		
		
		return true;
		
	}
	
	

	 public void display() {
	        if (head == null) {
	            return;
	        }
	        Node temp = head;
	        do {
	            System.out.print(temp.getData() + " ");
	            temp = temp.getNext();
	        } while (temp != head);

	        System.out.println();
	    }
	
	
	
	
	
	
	
	
}
