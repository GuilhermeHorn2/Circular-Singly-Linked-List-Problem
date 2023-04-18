package misc;

public class Node_circ {
	
	/*
	 * In this implementation,you can only set the argument i of the method append to a number != 1 if this node is 
	 * the last one,ex: you CANNOT DO:l.append(1,0);l.append(1,1);l.append( 1,0)
	 * you CAN DO: l.append(1,0);l.append(2,0);l.append(3,1).
	 */
	
	Node_circ next = null;
	int data;
	static int len = 0;
	
	public Node_circ(int d){
		if(len == 0) {
			len++;
		}
		data = d;
	}
	
	public Node_circ get_node(int i){
		
		int c = 0;
		Node_circ n = this;
		while(c != i){
			n = n.next;
			c++;
		}
		return n;
		
	}
	
	public int size() {
		return len;
	}
	
	public void append(int d,int i) {
		
		if(len == 1) {
			
			Node_circ novo = new Node_circ(d);
			Node_circ n = this;
			
			n.next = novo;
			novo.next = n;
		}
		else {
			
			Node_circ n = this;
			
			while(n.next != this) {
				n = n.next;
			}
			
			Node_circ novo = new Node_circ(d);
			
			n.next = novo;
			novo.next = this.get_node(i);
		}
		len++;
		
	
		
	}
	
	
	
	
			
	
	

}
