package xyz;

public class Kadanes_Algorithm {
	public static int maxSubarraySum(int[] arr) {
		        int maxEnding = arr[0]; 
		        int maxSoFar = arr[0];  
		        
		        for (int i = 1; i < arr.length; i++) {
		            maxEnding = Math.max(arr[i], maxEnding + arr[i]); 
		            maxSoFar = Math.max(maxSoFar, maxEnding); 
		        }

		        return maxSoFar;
		    }

		    public static void main(String[] args) {
		        int[] arr = {2, -3, 5, -1, 6, -2, 4, -8, 3};
		        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr));
		    }
		

	

}
