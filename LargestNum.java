package xyz;
import java.util.Scanner;
public class LargestNum {

	public static void main(String[] args) {
		System.out.println("enter size of the array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] num= new int[size];
		
		System.out.println("enter a num:");
		
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
			
		}
		int largest = num[0];
        for (int nums : num) {
            if (nums > largest) {
                largest = nums;
            }
        }

        System.out.println("Largest number: " + largest);
        sc.close();

			
		
			
	
	}

}
