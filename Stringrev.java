package jdbca;
import java.util.Scanner;

public class Stringrev {
    public static void main(String[] args) {
        System.out.println("Enter string:");
        Scanner sc = new Scanner(System.in);
        String ut = sc.nextLine();
        sc.close();
        
        String reversed = reverse(ut);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverse(String ut) {
        return new StringBuilder(ut).reverse().toString();
    }
}

