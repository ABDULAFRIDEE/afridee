package xyz;

public class BUBBLE_STRING {
	    public static void main(String[] args) {
	        String[] n = {"a", "c", "b", "d", "e", "g"};

	        for (int i = 0; i < n.length - 1; i++) {
	            for (int j = 0; j < n.length - 1 - i; j++) { 
	                if (n[j].compareTo(n[j + 1]) > 0) {
	                    String temp = n[j];
	                    n[j] = n[j + 1];
	                    n[j + 1] = temp;
	                }
	            }
	        }

	       
	        for (String nu : n) {
	            System.out.println(nu.toString());
	        }
	    }}
	