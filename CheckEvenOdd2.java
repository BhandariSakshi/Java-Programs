import java.util.*;

public class CheckEvenOdd2 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        String evenOdd = (iValue % 2 == 0) ? " even" : " odd";

        System.out.println(iValue + " is" + evenOdd);
    }
}
