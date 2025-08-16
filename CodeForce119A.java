import java.util.Scanner;

public class CodeForce119A {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();  
        int b = sc.nextInt();  
        int n = sc.nextInt();  

        boolean simonTurn = true;  

        while (true) {
            int take;
            if (simonTurn) {
                take = gcd(a, n);
            } 
            else {
                take = gcd(b, n);
            }

            if (n < take) {
                if (simonTurn) {
                    System.out.println(1); 
                } else {
                    System.out.println(0);
                }
                break;
            }

            n -= take;
            simonTurn = !simonTurn; 
        }

        sc.close();
    }
}
