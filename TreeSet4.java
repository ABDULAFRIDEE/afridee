package xyz;
import java.util.Scanner;
import java.util.TreeSet;
public class TreeSet4 {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("Keyboard");
		t.add("mouse");
		t.add("joystick");
		System.out.println("the products are:"+t);
		Scanner sc=new Scanner(System.in);
		System.out.println("select the product:");
		String input=sc.nextLine();
		sc.close();
		
	if(t.contains(input)){
		System.out.println("exits");
		
		}
	else {
		System.out.println("not exists");
	}
		
	}

}
