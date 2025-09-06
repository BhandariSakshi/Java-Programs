import java.util.*;

public class CodeForce231A {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int n = sobj.nextInt();
        int counter = 0;

        for(int i = 0; i < n; i++){

            int Petya = sobj.nextInt();
            int Vasya = sobj.nextInt();
            int Tonya = sobj.nextInt();

            if (Petya + Vasya + Tonya >= 2) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
