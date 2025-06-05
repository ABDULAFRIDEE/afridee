package adf;

import java.util.Stack;

public class Stackexample {
	public static void main(String[]args) {
		Stack<String> stc=new Stack<String>();
		stc.push("afrid");
		stc.push("sammu");
		stc.push("muttu");
		System.out.println("top burger is "+stc.peek());
		System.out.println("serving "+stc.pop());
		if(stc.isEmpty()) {
			System.out.println("all burger are over");
		}
		else {
			System.out.println("not over");
		}
		
		
	}

}
