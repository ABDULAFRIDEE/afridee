package xyz;
import java.util.Queue;
import java.util.LinkedList;

public class IceCream2 {

	public static void main(String[] args) {
		Queue<String> t=new LinkedList<String>();
		t.add("Kid1");
		t.add("Kid2");
		t.add("Kid3");
		t.add("Kid4");
		t.add("Kid5");
		System.out.println(t);
		System.out.println("First kid: "+t.peek());
		try {
		for(int i=0;i<=5;i++) {
			System.out.println("serving to:"+t.poll());
		}
		if(t.isEmpty()) {
			System.out.println("serving is over");
		}
		}catch(Exception e){
			System.out.println("serving is over:");
		}
	

	}

}
