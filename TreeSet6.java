package xyz;
import java.util.TreeMap;
public class TreeSet6 {
	public static void main(String[]args) {
		TreeMap<String,String> t=new TreeMap<>();
		t.put("India","New Delhi");
		t.put("USA","Washington");
		t.put("Germany","Berlin");
		t.put("Japan","Tokyo");
		t.put("India","Delhi");
		System.out.println(t);
	
		System.out.println(t.firstKey());
		System.out.println(t.lastKey());
		
		System.out.println(t.higherKey("India"));
		System.out.println(t.lowerKey("USA"));
	}

}
