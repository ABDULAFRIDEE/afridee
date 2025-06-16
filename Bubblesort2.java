package xyz;

public class Bubblesort2 {

	public static void main(String[] args) {
		int []num= {5,3,8,4,2};
		for(int i=0;i<num.length-1;i++) {
			for(int j=0;j<num.length-1;j++) {
				if(num[j] > num[j+1]) {
					int temp=num[j+1];
					num[j+1]=num[j];
					num[j]=temp;
					
					
				}
				
				
			}}
			System.out.println("the sorted arry");
			for(int n:num) {
				System.out.println(n);
			}
		}

	}


