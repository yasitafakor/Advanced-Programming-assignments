package List;

public class LinkedList {

	private Node root = null;
	private int last = -1;
	private Node n;
	
	public void setRoot(Node roott) {
		this.root = roott;
	}
	
	public Node getRoot() {
		return this.root;
	}
	
	public void insert(int data,int index) {
		if(!(index <= 1+last && index>=0))
			throw new IllegalArgumentException("IndexOutOfBound");
		
		if(root == null){
			root = new Node(data);
			root.setData(data);
			last++;
		}
		


		
		
		Node n = new Node(data);
		n.child = null;
		
		if(root == null) {
			root = n;
		}else {
			Node temp = root;
			
			for (int i = 0; i < index; i++) {
			    temp = temp.child;
			}
			
			temp.child = n;
		}
		
		
		
	}
	
	public void delete(int index) {
		
		Node t = root;
		int c = 0;
		
		while(t.child != null) {
			t = t.child;
			c++;
		}
		
		if(index > c) {
			throw new IllegalArgumentException("IndexOutOfBound");
		}
		
		Node cur = root;
		Node prev = null;
		
		if(index == 0 && cur != null) {
			root = cur.child;
		}else {
			
			int counter = 0;
			
			while(cur != null) {
				if(counter == index) {
					
					prev.child = cur.child;
					break;
					
				}else {
					
					prev = cur;
					cur = cur.child;
					counter++;
					
				}
			}
		}
	}
	
	public void replace(int data, int index) {
		
		Node t = root;
		int c = 0;
		
		while(t.child != null) {
			t = t.child;
			c++;
		}
		
		if(index > c) {
			throw new IllegalArgumentException("IndexOutOfBound");
		}
		
		Node temp = root;
		
		for (int i = 0; i < index; i++) {
		    temp = temp.child;
		}
		
		temp.data = data;
		
	}
	
	public int getData(int index) {
		
		Node t = root;
		int c = 0;
		
		while(t.child != null) {
			t = t.child;
			c++;
		}
		
		if(index > c) {
			throw new IllegalArgumentException("IndexOutOfBound");
		}
		
		Node temp = root;
		
		for (int i = 0; i < index; i++) {
		    temp = temp.child;
		}
		
		return temp.data;
	}
	
	
}
