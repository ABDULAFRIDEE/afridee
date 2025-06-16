package xyz;
import java.util.TreeSet;
public class Treesetex2 {
	public static void main(String[]args) {
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(5002);
		t.add(5003);
		t.add(5004);
		t.add(5005);
		t.add(5006);
		System.out.println(t);
	
		System.out.println(t.higher(2));	
		t.lower(5006);
		System.out.println(t);	
		
	}
}
