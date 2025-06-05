package adf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;


class  Arraylist{
	public Arraylist() {
		ArrayList<String> st=new ArrayList<String>();
		st.add("sammu");
		st.add("samm");
		st.add("sam");
		st.add("ammu");
		System.out.println("st");
		
		
	}

	class Linkedlist extends Arraylist{
		public Linkedlist() {
			LinkedList<String> st=new LinkedList<String>();
			st.add("sammu");
			st.add("samm");
			st.add("sam");
			st.add("ammu");
			System.out.println("st");
			
			
		}
	}
	
	class Hashset extends Arraylist{
		public Hashset() {
			HashSet<String> vw=new HashSet<String>();
			vw.add("sammu");
			vw.add("samm");
			vw.add("sam");
			vw.add("ammu");
			System.out.println("vw");
			
			
		}
		
	}
	class Hashmap extends Arraylist{
		public Hashmap() {
			HashMap<String,Integer> bt=new HashMap<String,Integer>();
			bt.put("ammu",1);
			bt.put("mu",2);
			bt.put("samu",3);
			bt.put("mmu",4);
			System.out.println(bt);
			
		}
		
	}
	
}
public class Alllist {
	
	public static void main(String[]args) {
		Arraylist al=new Arraylist();
		Linkedlist l1=new Linkedlist();
		HashSet h1=new HashSet();
		Hashmap h2=new Hashmap();
	}
}
