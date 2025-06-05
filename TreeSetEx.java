package adf;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> num=new TreeSet<Integer>();
		num.add(90);
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
		num.add(80);

		System.out.println(num);
		System.out.println(num.first());
		System.out.println(num.higher(30));
		System.out.println(num.last());
		System.out.println(num.isEmpty());
		System.out.println(num.clone());
		System.out.println(num.removeLast());
		
		
	}

}
