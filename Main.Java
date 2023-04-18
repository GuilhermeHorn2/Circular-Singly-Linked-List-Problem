package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class main_misc {
    //private static HashMap<String,String> cache = new HashMap<>();
	public static void main(String[] args) {
	  
		
		Node_circ l = new Node_circ(0);
		l.append(1,0);
		l.append(2,0);
		l.append(3,1);
		
		//System.out.println(l.get_node(1).next.next.data);
		
		System.out.println(find_loop(l).data);
		
	
		
		
		
	
		
	}
	
	private static Node_circ find_loop(Node_circ l) {
		
		//I want to find to which node the "last" node points to
		
		//I can just do return l.get_node(l.size()-1),but i want to prove that i can get to the loop node using the 
		//both paths
		
	
		
		int j = l.size()-1;
		Node_circ r = l.get_node(j).next;
		
		//trying to find r using the linear path
		
		Node_circ n = l;
		
		while(!n.equals(r)) {
			n = n.next;
		}
		
		return n;
		
		
		
	}
	
	
		
	}
	
  
	
    
	
		

	

	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

