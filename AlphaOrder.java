package xyz;
import java.util.List;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
public class AlphaOrder {

	public static void main(String[] args) {
	List<String> t=new ArrayList<>();
	t.add("A");
	t.add("C");
	t.add("D");
	t.add("B");
	t.add("E");
	t.add("G");
	t.add("F");
	Collections.sort(t);
	System.out.println(t);
	
	}

}
