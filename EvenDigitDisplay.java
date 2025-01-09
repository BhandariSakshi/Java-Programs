import java.util.*;

class EvenDigit
{
    public static void Display(int iNo)
    {
        int iDigit = 0;

        while (iNo > 0) {
            
            iDigit = iNo % 10;
            if (iDigit % 2 == 0) {
                System.out.println(iDigit);
            }
            iNo = iNo / 10;
        }
    }
}

class EvenDigitDisplay{

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        EvenDigit obj = new EvenDigit();
        
        obj.Display(iValue);

    }
}