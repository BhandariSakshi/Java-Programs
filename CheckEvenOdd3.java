import java.util.*;

public class CheckEvenOdd3 {

    public static void EvenOdd(int iNo)
    {
        if (iNo % 2 == 0) {
            
            System.out.println(iNo + " is even number");
        }
        else
        {
            System.out.println(iNo + " is odd number");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        EvenOdd(iValue);
    }
}
