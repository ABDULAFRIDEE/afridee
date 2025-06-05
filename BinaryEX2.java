package xyz;

import java.util.Scanner;
import java.util.Arrays;
public class BinaryEX2 {
	public static void main(String[]args) {
		String [] names= {"Amit","Divya","Karan","Charith","Zoyz"};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name:");
		String input=sc.nextLine();
		sc.close();
		int index = Arrays.binarySearch(names, input);
		 if (index >= 0) {
	            System.out.println("Name Exists.");
	        } else {
	            System.out.println("Name doesn't Exists.");

		
	}

}}
