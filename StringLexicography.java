import java.util.Scanner;

class Strings {
    public void Lexicography(String str, int k) {
        // If k is greater than the string length, return empty
        if (k >= str.length()) {
            System.out.println("Smallest string: ");
        } else {
            String result = str.substring(k); // Remove first k characters
            System.out.println("Smallest string: " + result);
        }
    }
}

public class StringLexicography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = sc.nextLine();

        System.out.println("Enter value of k:");
        int k = sc.nextInt();

        Strings obj = new Strings();
        obj.Lexicography(str, k);

        sc.close();
    }
}
