package xyz;

public class BubbleSort {

	public static void main(String[] args) {
		int[] num={1,4,5,6,3,7,67};
		for(int i=0;i<num.length-1;i++) {
			for(int j=0;j<num.length-1;j++) {
				if(num[j]> num[j+1]) {
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		System.out.println("the sorted list:");
		for(int nums:num) {
			System.out.println(nums);
		}
	}

}
