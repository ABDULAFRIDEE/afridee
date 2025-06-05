package jdbca;

public class BinarySearch {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 1;
        int left = 0;
        int right = num.length - 1;
        boolean found = false;

        while (left <= right) { 
            int mid = left + (right - left) / 2;
            if (num[mid] == target) {
                System.out.println("Found " + target + " at index " + mid);
                found = true;
                break;
            } else if (target < num[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (!found) { 
            System.out.println("Not found");
        }
    }
}