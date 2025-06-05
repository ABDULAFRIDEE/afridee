package adf;
import java.util.LinkedList;
import java.util.Queue;
public class QueueEX {
	public static void main(String[] args) {
		Queue<String> st=new LinkedList<String>();
		st.add("s1");
		st.add("s2");
		st.add("s3");
		st.add("s4");
		System.out.println(st);
		String firstOut = st.remove();
		System.out.println(firstOut);
		System.out.println(st);
		

	}

}
