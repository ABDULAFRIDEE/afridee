package xyz;
import java.util.Arrays;
public class QuickSortExample {

	   
	    static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(arr, low, high);
	            quickSort(arr, low, pivotIndex - 1);  
	            quickSort(arr, pivotIndex + 1, high); 
	        }
	    }
	    static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high]; 
	        int i = low - 1; 
	        for (int j = low; j < high; j++) {
	            if (arr[j] < pivot) {
	                i++;
	              
	                int temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	        }
	     
	        int temp=arr[i+1];
	        arr[i+1]=arr[high];
	        arr[high]=temp;
	        return i + 1; 
	    }
	   
	    public static void main(String[ ] args) {
	        int[] numbers = {8, 4, 7, 3, 9, 2, 5};
	        System.out.println("Before sorting: " + Arrays.toString(numbers));

	        quickSort(numbers, 0, numbers.length - 1);

	        System.out.println("After sorting: " + Arrays.toString(numbers));
	    }
	}