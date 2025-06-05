package jdbca;
public class LinearSearchex{
    public static void main(String[] args) {
        int[] num = {5, 6, 7, 8, 9, 0};
        int target = 9; 
        boolean found = false;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) { 
                System.out.println("Found " + target + " at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(target + " not found in array.");
        }
    }
}