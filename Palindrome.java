package jdbca;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String st = scanner.nextLine();
        scanner.close();
        
        if (st.equals(reverse(st))) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static String reverse(String st) {
        return new StringBuilder(st).reverse().toString();
    }
}