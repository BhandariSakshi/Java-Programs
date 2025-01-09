import java.util.*;

class CheckEvenOdd
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        if (iValue % 2 == 0) {
            
            System.out.println(iValue + " is an even number");
        }
        else
        {
            System.out.println(iValue + " is an odd number");
        }
    }
}