package xyz;
import java.util.TreeSet;
public class TreeSet3 {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("sumit");
		t.add("karan");
		t.add("anjali");
		t.add("mohan");
		t.add("Zoya");
		System.out.println("in order:");
		System.out.println(t);
		System.out.println("in reverse order:");
		System.out.println(t.reversed());

		

	}

}
