import java.util.*;

class Digit
{
    public static int Reverse(int iNo)
    {
        int iDigit = 0, iRev = 0;

        while (iNo != 0) {
            
            iDigit = iNo % 10;
            iRev = (iRev*10) + iDigit;
            iNo = iNo / 10;
        }

        return iRev;
    }
}

class DigitReverse
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Digit obj = new Digit();

        int iRet = obj.Reverse(iValue);

        System.out.println(iRet);
    }
}