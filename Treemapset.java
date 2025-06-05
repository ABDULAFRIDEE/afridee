package adf;

import java.util.TreeMap;

public class Treemapset {
	public static void main(String[]args) {
		TreeMap<String,Integer> std=new TreeMap<String,Integer>();
		std.put("sammu", 99);
		std.put("ammu", 49);
		std.put("sue", 59);
		std.put("maura", 79);
		std.put("sameer", 89);
		System.out.println(std);
		System.out.println(std.get("sammu"));
		System.out.println(std.containsKey("sammu"));
	
		
	}

}
