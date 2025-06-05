package adf;
import java.util.Stack;

public class Stackplates {
	public static void main(String[]args) {
		Stack<String> st=new Stack<String>();
		st.push("plate1");
		st.push("plate2");
		st.push("plate3");
		st.push("plate4");
		st.push("plate5");
		
		System.out.println("cleaned plates"+st);
		try {
		for(int i=0;i<=5;i++) {
		System.out.println("if some one eat a plate:"+st.pop());
		System.out.println("reaiming"+st);
		 
			 
		 
		}}
		catch(Exception e){
			System.out.println("all plates are over");
			
		}
		
	}}

