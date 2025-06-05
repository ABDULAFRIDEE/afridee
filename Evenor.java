package adf;
import java.util.*;

import com.sun.tools.javac.parser.Scanner;

public class Evenor { 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter number: ");
        int ut = scanner.nextInt();
        if(ut%2==0) {
        	System.out.println("even");
        	
        }else {
        	System.out.println("odd");
        }

	}}
