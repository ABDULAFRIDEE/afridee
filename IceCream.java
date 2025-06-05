package adf;
import java.util.LinkedList;
import java.util.Queue;

public class IceCream {

	public static void main(String[] args) {
		Queue<String> st=new LinkedList<String>();
		st.add("kid1");
		st.add("kid2");
		st.add("kid3");
		st.add("kid4");
		st.add("kid5");
		System.out.println(st);
		for(int i=0;i<=4;i++) {
			String firstOut=st.poll();
			System.out.println("kid how is taking the ice cream:"+firstOut);
			System.out.println("in line"+st);
		}if(st.isEmpty()) {
			System.out.println("the line is empty");
			st.add("kid6");
			st.add("kid7");
			System.out.println(st);
		}

	}

}
