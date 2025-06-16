package xyz;
import java.util.*;
public class FibinocciSeries {
	public static void main(String[] args) {
		System.out.println("Enter a num:");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println("fibinocci Series are:");
		
		
		for(int i=0;i<=input;i++) {
			System.out.println(a+"");
			int f=a+b;
			a=b;
			b=f;
			
		sc.close();
		
		}

		
		

	}

}
