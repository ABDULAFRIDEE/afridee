package xyz;

public class Reverse_Array {

	public static void printFirstElement(int[]arr) {
		if(arr.length>0) {
			System.out.println("First Element is:"+arr[0]);
		}
		else {
			System.out.println("Array is Empty");
		}
	}
	
	public static void main(String[] args) {
		int [] num= {10,20,30,40};
		printFirstElement(num);
		
		}
		

	}
