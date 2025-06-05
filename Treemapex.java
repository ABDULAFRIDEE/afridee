package adf;
import java.util.TreeMap;

public class Treemapex {

	public static void main(String[] args) {
		TreeMap <Integer,String> num=new TreeMap<Integer,String>();
		num.put(1, "sammu");
		num.put(2, "sa");
		num.put(3, "sam");
		num.put(4, "samm");
		num.put(5, "ammu");
		System.out.println(num);
		System.out.println(num.clone());
		System.out.println(num.isEmpty());
		System.out.println(num.lastKey());
		System.out.println(num.firstKey());
		
	}
}
