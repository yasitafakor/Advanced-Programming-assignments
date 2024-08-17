package List;

public class Node {

	Node child;
	int data;
	
	 Node(int n){
         data = n;
         child = null;
     }
	
	public void setChild(Node childd) {
		this.child = childd;
	}
	
	public Node getChild() {
		return this.child;
	}
	
	public void setData(int dataa) {
		this.data = dataa;
	}
	
	public int getData() {
		return this.data;
	}
}
