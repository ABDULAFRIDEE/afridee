package xyz;
import java.util.ArrayList;
public class ArrayListex2 {
	public static void main (String [] args) {
		ArrayList<String> t=new ArrayList<String>();
		t.add("Doreamon");
		t.add("shinchan");
		t.add("Dora");
		t.add("Jackie chan");
		t.add("He man");
		System.out.println(t);
		for(int i=0;i<=4;i++) {
			System.out.println("names:"+t.get(i));
			
		}
		
	}
}
